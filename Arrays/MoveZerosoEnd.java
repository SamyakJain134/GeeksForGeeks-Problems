package Arrays;

public class MoveZerosoEnd {
	public static void movezeros(int arr[])
	{
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]==0)
			{
				for(int j=i+1;j<arr.length;j++)
				{
					if(arr[j]!=0)
					{
						int temp=arr[i];
						arr[i]=arr[j];
						arr[j]=temp;
					}
				}
			}
		}
		
	}
	public static void movezeroswfficient(int arr[])
	{
		int count=0;
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]!=0)
			{
				int temp=arr[i];
				arr[i]=arr[count];
				arr[count]=temp;
				count++;
			}
		}
		
	}

	public static void main(String[] args) {
		int arr[]= {1,0,0,9,4,5,0,8};
		movezeroswfficient(arr);
		//int arr2[]=movezeros(arr);
		for(int i=0;i<arr.length;i++)
		{
			System.out.print(arr[i]+" ");
		}

	}

}
