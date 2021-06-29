package Sorting;

public class CountPossibleTriangles {
	public static int countPossibleTriable(int arr[])
	{
		int count =0;
		for(int i=arr.length-1;i>=2;i--)
		{
			int left=0;
			int right=i-1;
			while(left<right)
			{
				if(arr[left]+arr[right]> arr[i])
				{
					count=count+right-left; //because agar firt element bana raha hai toh obviouslu
					//right-left ke saare elements bhi banayenge 
					right--; //right ko piche rakh denge
				}
				else
				{
					i++;
				}
			}
		}
		return count;
	}

}
