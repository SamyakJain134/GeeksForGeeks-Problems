 package Arrays;

import java.util.ArrayList;


public class StocksBuyAndSell {
	public static int profit(int price[],int start,int end)
	{
		if(start>=end) //for a single day we cannot maek any profit 
		{
			return 0;
		}
		int profit=0;
		for(int i=start;i<end;i++)
		{
			for(int j=i+1;j<=end;j++)
			{
				if(price[j]>price[i])
				{
					//left of i
					//right of j
					int curr_profit=(price[j]-price[i]) + profit(price,start,i-1) + profit(price, j+1, end);
					profit=Math.max(profit, curr_profit);
				}			
			}
		}
		return profit;
	}
	public static int profitefficient(int price[])
	{
		int profit=0;
		for(int i=1;i<price.length;i++)
		{
			if(price[i]>price[i-1])
			{
				profit += price[i]-price[i-1];
			}
		}
		return profit; 
	}
	public static ArrayList<ArrayList<Integer> > stockBuySell(int price[], int n) {
	       ArrayList<ArrayList<Integer> > result = new ArrayList<ArrayList<Integer>>();
	       int buy=0;
	       int sell=0;
	       int flag=0;
	       for(int i=1;i<n;i++)
	       {
	           if(price[i]>=price[i-1] && price[i] !=price[buy])
	           {
	               sell++;
	               flag=1;
	           }
	           else if(buy==sell)
	           {
	               buy=i;
	               sell=i;
	           }
	           else
	           {
	               ArrayList<Integer> vec=new ArrayList<Integer>();
	               vec.add(buy);
	               vec.add(sell);
	               result.add(vec);
	                buy=i;
	               sell=i;
	           }
	       }
	       if(flag==0)
	       {
	           return result;
	       }
	       else if(buy != n-1 && sell==n-1)
	       {
	            ArrayList<Integer> temp=new ArrayList<Integer>();
	               temp.add(buy);
	               temp.add(sell);
	                result.add(temp);
	      
	       }
	       return result;
	    }
	//Only one transaction allowed 
    public static int maxProfit(int arr[])
    {
    	int maxProfit=0;
    	int minSoFar=arr[0];
    	for(int i=0;i<arr.length;i++)
    	{
    		minSoFar=Math.min(minSoFar, arr[i]);
    		int profir=arr[i]-minSoFar;
    		maxProfit=Math.max(profir, maxProfit);
    	}
    	return maxProfit;
    }
    //Infinite Trasaction alowed
    public static int maxProfitInfinite(int arr[])
    {
    	int buyingdate=0;
    	int selligdate=0;
    	int profit=0;
    	for (int i=1;i<arr.length;i++)
    	{
    		if(arr[i]>=arr[i-1])
    		{
    			selligdate++;
    		}
    		else
    		{
    			profit=profit+arr[selligdate]-arr[buyingdate];
    			buyingdate=selligdate=i;
    		}
    	}
    	profit=profit+arr[selligdate]-arr[buyingdate]; //last loop ke liye hai ye 
    	return profit;
    }
    //Infinite transaction with amount per sell
    public static int maxProfitonsell(int arr[],int fees)
    {
    	//Buy state means ek share hai extra 
    	//Sell state means clear hai no extra share 
    	//Purani bought satte ko continue kare ya purani bought state me aaj naya sell kare
    	
    	int oldbuystateprofit=-arr[0]; //Phla share khrid rakha hai profit - me hai aur ek share hai 
    	int oldsoldstateprofit=0; //phle din profit hota hi nahi hai 
    	
    	for(int i=1;i<arr.length;i++)	
    	{
    		int newBuyingStateProfit=0;
    		int newSellStateProfit=0;
    		
    		if(oldsoldstateprofit - arr[i] > oldbuystateprofit) //aagar purane soldstateprofir me aaj khrida ar ye purane bsp se acha hai toh new bsp ko update karenge
    		{
    			newBuyingStateProfit=oldsoldstateprofit - arr[i];
    		}
    		else
    		{
    			newBuyingStateProfit=oldbuystateprofit;
    		}
    		if(oldbuystateprofit+arr[i] -fees > oldsoldstateprofit)
    		{
    			newSellStateProfit=oldbuystateprofit+arr[i] -fees;
    		}
    		else
    		{
    			newSellStateProfit=oldsoldstateprofit;
    		}
    		oldbuystateprofit=newBuyingStateProfit;
    		oldsoldstateprofit =newSellStateProfit;
    		
    	}
    	return oldsoldstateprofit;
    }
    

	public static void main(String args[])
	{
		int proce[]={1,5,3,8,12};
				System.out.println(profit(proce,0,proce.length-1));
	}
}

