package Arrays;

import com.sun.prism.Surface;

public class SubArraywithGivenSumWindow {
	public static boolean findSubaaray(int arr[],int sum)
	{
		
		for(int i=0;i<arr.length;i++)
		{
			int sum2=0;
			for(int j=i;j<arr.length;j++)
			{
				sum2=sum2+arr[j];
				if(sum2==sum)
				{
					return true;
				}
				else
					continue;
			}
			
		}
		return false;
	}
	//Technique2 - Traverse throught the array one by one , 
	//If sum is greater add next element 
	//keep adding till we get desired sum
	// If sum increases desired sum , decrease initial element one by one 
	//if not getting result , Return false
	//array Contains non negative number (onlu non negative integers)
	public static boolean findSubaarayEfficient(int arr[],int sum)
	{
		int n=arr.length;
		int curr_sum=arr[0]; 
		int start=0; //Initially start and end is at element 1
		for(int end=1;end<n;end++) //second element se compare karenge
		{
			//Clear the provious window
			while(curr_sum>sum && start <end-1)
			{
				curr_sum=curr_sum-arr[start];
				start++;
			}
			if(curr_sum==sum)
			{
				int p = end - 1;
                System.out.println(
                    "Sum found between indexes " + start
                    + " and " + p);
				return true;
			}
			if(end<n)
			{
				curr_sum=curr_sum+arr[end];
			}
			
		}
		return (curr_sum==sum);
	}
	public static void main(String[] args) {
		int arr[]={1,4,20,3,10,5};
		System.out.println(findSubaaray(arr, 33));

	}

}
