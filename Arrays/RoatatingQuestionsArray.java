package Arrays;

public class RoatatingQuestionsArray {
	public static void rotate(int arr[],int n,int d) //left rotate 
	{
		for(int i=0;i<d;i++)
		{
			rotate2(arr,n);
		}
	}
	public static void rotate2(int arr[],int n) //left rotate ke liye hai ye 
	{
		int temp=arr[0];
		for(int i=1;i<n;i++)
		{
			arr[i-1]=arr[i];
		}
		arr[n-1]=temp;
	}
	public static int[] rotatemethod2(int arr[],int n,int d)
	{
		int temp[] = new int[d];
		for(int i=0;i<d;i++)
		{
			temp[i]=arr[i];
		}
		for(int i=d;i<n;i++)
		{
			arr[i-d]=arr[i];
		}
		for(int i=0;i<d;i++)
		{
			arr[n-d+i]=temp[i];
		}
		return arr;
	}
	public static int[] leftRoatatmethod3(int arr[],int n,int d)
	{
		rotatearray(arr,0,d-1);
		rotatearray(arr,d,n-1);
//		for(int i=0;i<arr.length;i++)
//		{
//			System.out.print(arr[i]+" ");
//		}
		rotatearray(arr,0,n-1);
		return arr;
	}
	

	private static void rotatearray(int[] arr, int low, int high) {
		while(low<high)
		{
			int temp=arr[low];
			arr[low]=arr[high];
			arr[high]=temp;
			low++;
			high--;
		}
	}
	//Cycallically Rotate Array by One
	public static  int[] rotate(int arr[], int n)
    {
		 int temp=arr[arr.length-1];
	        for(int i=n-1;i>0;i--)
	        {
	        	arr[i]=arr[i-1];
	        }
	        arr[0]=temp;
	        return arr;
    }
	public static void main(String[] args) {
		int arr[]= {1,2,3,4,5};
		//rotatemethod2(arr,arr.length,2);
		//int arr2[]=rotatemethod2(arr,arr.length,2);

		int arr2[]=leftRoatatmethod3(arr,arr.length,2);
		int arr3[]=rotatemethod2(arr,arr.length,2);
		int arr4[]=rotate(arr,arr.length);
		for(int i=0;i<arr2.length;i++)
		{
			System.out.print(arr2[i]+" ");
		}
		System.out.println();
		for(int i=0;i<arr3.length;i++)
		{
			System.out.print(arr3[i]+" ");
		}
		System.out.println();
		for(int i=0;i<arr4.length;i++)
		{
			System.out.print(arr4[i]+" ");
		}
	}

}
