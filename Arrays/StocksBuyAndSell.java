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
    

	public static void main(String args[])
	{
		int proce[]={1,5,3,8,12};
				System.out.println(profit(proce,0,proce.length-1));
	}
}

