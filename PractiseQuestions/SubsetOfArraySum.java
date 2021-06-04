package PractiseQuestions;

public class SubsetOfArraySum {
	public static int countSubsetequaltosum(int arr[],int n,int sum)
	{
		//in this approach we are mainaining a sum variable  and using that sum we ar edeciding 
		if (n==0)
		{
			return (sum==0) ? 1 : 0; //IF SUM ==0 THEN RETURN 1 ELSE REUR ZERO
			
		}
		return countSubsetequaltosum(arr, n-1, sum)+countSubsetequaltosum(arr, n-1, sum-arr[n-1]);
		
		
	}

}
