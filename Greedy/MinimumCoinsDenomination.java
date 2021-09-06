package Greedy;

import java.util.ArrayList;
import java.util.Arrays;

public class MinimumCoinsDenomination {
	public static void minCoins(int coins[], int M, int V) 
	{ 
		Arrays.sort(coins);
	    ArrayList<Integer> arr=new ArrayList<>();
	    for(int i=M-1;i>=0;i--)
	    {
	        while(V>=coins[i])
	        {
	            V=V-coins[i];
	            arr.add(coins[i]);
	        }
	    }
	    for(int i=0;i<arr.size();i++)
	    {
	    	System.out.println(arr.get(i)+" ");
	    }
	} 
	public static void main(String[] args) {
		int coins[]={25,10,5};
		minCoins(coins, 3, 30);
	}
}
