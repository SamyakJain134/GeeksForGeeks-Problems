package Arrays;

public class MaximumConsecutive1sinBinaryArray {
	
	public static int countBinary(int arr[])
	{
		int res=0;
		for(int i=0;i<arr.length;i++)
		{
			int count =0;
			for(int j=i;j<arr.length;j++)
			{
				if(arr[j]==1)
				{
					count++;
				}
				else
					break;
				 res=Math.max(res, count);
			}
			
		}
		return res;
	}
	public static int countBinaryEfficient(int arr[])
	{
		int res=0;
		int count=0;
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]==0)
			{
				count=0;
			}
			else
			{
				count++;
			}
			res=Math.max(res, count);
		}
		return res;
	}
	public static void main(String[] args) {
		int ary[]= {1,0,1,1,0};
		System.out.println(countBinaryEfficient(ary));

	}

}
