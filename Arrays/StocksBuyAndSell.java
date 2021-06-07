package Arrays;
 
public class StocksBuyAndSell {
	public static int profit(int price[],int start,int end)
	{
		if(start>=end)
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
	public static void main(String args[])
	{
		int proce[]={1,5,3,8,12};
				System.out.println(profit(proce,0,proce.length-1));
	}
}

