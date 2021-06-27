package Sorting;

public class SortanArraywithTwoTypes {

	//Segergate Positive and Negatives
	public static void positive(int arr[])
	{
		int temp[]=new int[arr.length];
		int i=0;
		for(int j=0;j<arr.length;j++)
		{
			if(arr[j]<0)
			{
				temp[i]=arr[j];
				i++;
			}
		}
		for(int j=0;j<arr.length;j++)
		{
			if(arr[j]>0)
			{
				temp[i]=arr[j];
				i++;
			}
		}
		for(int k=0;k<temp.length;k++)
		{
			arr[k]=temp[k];
		}
	}
	public static void main(String[] args) 
	{
		
	}

}
