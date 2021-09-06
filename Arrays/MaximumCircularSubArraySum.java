package Arrays;

public class MaximumCircularSubArraySum {
	public static int MAxCircularSubArray(int arr[])
	{
		int res=arr[0];
		for(int i=0;i<arr.length;i++)
		{
			int curr_sum=arr[0];
			int curr_max=arr[0];
			for(int j=1;j<arr.length;j++)
			{
				int index=(i+j)%arr.length;
				curr_sum=curr_sum+arr[index];
				curr_max=Math.max(curr_sum, curr_max);
			}
			res=Math.max(curr_max, res);
		}
		return res;
	} 
	
	///Approach 2
	// we will fing MaxSub Array subusng kandane algo
	//we will find minimum subsarray sum and we subtract from overall sum
	public static int NormalmaxSum(int arr[])
	{
		int res=arr[0];
		int maxEnding=arr[0]; //max sum that must end with this element 
		//phle first element ko lenge then saare element me uske phle wka sum add karenge 
		for(int i=1;i<arr.length;i++)
		{
			maxEnding=Math.max(maxEnding+arr[i], arr[i]);
			res=Math.max(res, maxEnding);
		}
		return res;
	}
	public static int OverallMAxSum(int arr[] )
	{
		int maxNormal=NormalmaxSum(arr); // Consists maximum of a normal sub array
		if(maxNormal<0) //all the elemnts in array are negative 
		{
			return maxNormal;
		}
		int arr_sum=0;
		for(int i=0 ;i<arr.length;i++)
		{
			arr_sum=arr_sum+arr[i];
			arr[i]=-arr[i]; //inverting the array and then calling NormalMax sum again
		}
		//Maximum sum in an inverted array basiciallly means Minimum sum in original array
		int max_circular=arr_sum+NormalmaxSum(arr); //instead of subtracting we add becuase --=+
		return Math.max(max_circular, maxNormal);
	}
}
