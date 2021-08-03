package Arrays;

public class MaximumIndex {
	public static int maxIndexDiff(int arr[], int n) 
	{
		if(n==1)
			{
				return 0;
			}
		int Rmax[]=new int[n];
		int Lmin[]=new int[n];
		Lmin[0]=arr[0];
		for(int i=1;i<n;i++)
		{
			Lmin[i]=Integer.min(arr[i], Lmin[i-1]);
		}
		Rmax[n-1]=arr[n-1];
		for(int i=n-2;i>=0;i--)
		{
			Rmax[i]=Integer.max(arr[i],Rmax[i+1]);
		}
		for(int i=0;i<n;i++)
		{
			System.out.print(Lmin[i]+" ");
		}
		System.out.println();
		for(int i=0;i<n;i++)
		{
			System.out.print(Rmax[i]+" ");
		}
		int i=0,j=0;
		
		int maxDiff=-1;
		while(i<n && j< n) 
		{
			if(Lmin[i]<=Rmax[j])
			{
				maxDiff=Math.max(maxDiff,j-i);
				j++;
			}
			else
			{
				i++;
			}
		}
		
	return maxDiff;
	}
	public static void main(String[] args) {
		int a[]={82 ,63 ,44 ,74 ,82, 99 ,82};
	System.out.println(maxIndexDiff(a, a.length));
	}
}
