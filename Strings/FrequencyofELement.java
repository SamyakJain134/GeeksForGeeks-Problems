package Strings;

public class FrequencyofELement {
	public static int isPresnt(int arr[],int x)
	{
		int count=0;
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]==x)
			{
				count++;
			}
		}
		return count;
	}
	public static void main(String args[])
	{
		int arr[]={1,2,34,44,68,4,5,43,1,3,42,31,1,2};
		System.out.println(isPresnt(arr, 99));
		
	}

}
