package Strings;

import java.util.Scanner;

public class Question {
	public static int string(String str)
	{
		int res=0;
		int sum=0;
		for(int i=0;i<str.length();i++)
		{
			if(str.charAt(i)>='0' && str.charAt(i)<='9')
			{
				res=res*10+(int)( str.charAt(i)-'0');
			}
			else
			{
				sum=sum+res;
				res=0;
			}
		}
		return res+sum;
	}
	public static int countholiday(int arr[],int k)
	{
		int max=Integer.MIN_VALUE;
		for(int i=1;i<arr.length-1;i++)
		{
			if(arr[i-1]==1 && arr[i+1]==1)
			{
				max=Math.max(max, k+i+i);
			}
		}
		return max;
	}
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int r=s.nextInt();
		int c=s.nextInt();
		int arr[][]=new int[r][c];
		for (int i = 0; i < arr.length; i++) 
		 {
			 for (int j = 0; j < arr[0].length; j++) 
			 	{
				 	arr[i][j]=s.nextInt();
			 	}
		 }
		set(arr);
		
		
	}
	
	public static void set(int[][] arr) {

		 int[] row = new int[arr.length];
		 int[] column = new int[arr[0].length];
	 for (int i = 0; i < arr.length; i++) 
	 {
		for (int j = 0; j < arr[0].length;j++) 
		{
				if (arr[i][j] == 0) 
				{
						row[i] = 1;
							column[j] = 1;
							}
				}
		 }
		 for (int i = 0; i < arr.length; i++) 
		 {
			for (int j = 0; j < arr[0].length; j++) 
		 	{
					if ((row[i] == 1 || column[j] == 1)) 
					{
						arr[i][j] = 0;
					}
		 	}
		 }
		 for (int i = 0; i < arr.length; i++) 
		 {
			 for (int j = 0; j < arr[0].length; j++) 
			 	{
				 	System.out.print(arr[i][j]+" ");
			 	}
			 	System.out.println();
		 }

		 }
		 


}
