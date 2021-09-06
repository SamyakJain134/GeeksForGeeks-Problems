package Arrays;

public class SmallestSubArraywithFSumGreaterThanaGivenValue {
	public static int sb(int arr[], int n, int x) {
	       int mi=Integer.MAX_VALUE;
	       int i=0;
	       int j=0;
	       int sum=0;
	       while(i<=j && j<n)
	       {
	           while(sum<=x && j<n)
	           {
	               sum=sum+arr[j];
	               j++;
	           }
	           while(sum>x && i<j)
	           {
	               mi=Math.min(mi,j-i);
	               sum=sum-arr[i];
	               i++;
	           }
	       }
	       return mi;
	    }
}
