package Arrays;

public class TappingRainWater {
	public static int maxRainWater(int arr[])
	{
		int res=0;
		for(int i=1;i<arr.length-1;i++) //because corner two elemnets cannot hold water
		{
			int leftmax=arr[i];
			for(int j=0;j<i;j++)
			{
				leftmax=Math.max(leftmax, arr[j]);
			}
			int rightmax=arr[i];
			for(int j=i+1;j<arr.length;j++)
			{
				rightmax=Math.max(rightmax,arr[j]);
			}
			res=res+(Math.min(leftmax, rightmax)-arr[i]);
		}
		return res;
	}
	//Better Approach
	
	public static int maxRainWaterEfficient(int arr[])
	{
		int leftMax[]=new int[arr.length];
		int rightMax[]=new int[arr.length];
		int res=0;
		leftMax[0]=arr[0];
		for(int i=1;i<arr.length;i++)
		{
			leftMax[i]=Math.max(leftMax[i-1], arr[i]);
		}
		rightMax[arr.length-1]=arr[arr.length-1];
		for(int i=arr.length-2;i>=0;i--)
		{
			rightMax[i]=Math.max(rightMax[i+1], arr[i]);
		}
		for(int i=1;i<arr.length-1;i++)
		{
			res=res+(Math.min(leftMax[i], rightMax[i])-arr[i]);
		}
		return res;
	}
	public static void main(String[] args) {
		int ary[]= {3,0,1,2,5};
		System.out.println(maxRainWater(ary));
		System.out.println(maxRainWaterEfficient(ary));

	}

}
