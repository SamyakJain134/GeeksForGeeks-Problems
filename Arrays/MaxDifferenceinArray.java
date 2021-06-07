package Arrays;
	
public class MaxDifferenceinArray {
	public static int maxdiff(int arr[])
	{
		int res=arr[1]-arr[0];
		for(int i=0;i<arr.length-1;i++)
		{
			for(int j=i+1;j<arr.length;j++)
			{
				res=Math.max(res, arr[j]-arr[i]);
			}
		}
		return res;
	}
	public static int maxdiffefficient(int arr[])
	{
		int res=arr[1]-arr[0];
		int minValue=arr[0];
		
			for(int j=1;j<arr.length;j++)
			{
				res=Math.max(res, arr[j]-minValue);
				minValue=Math.min(minValue, arr[j]);
			}
		
		return res;
	}
	
}
