package MatrixArray;

public class RotateaMatrixby90 {
	static int n=4;
	//static int c=4;
	public static void rotateby90(int arr[][])
	{
		//Last column becomes first row
		///second last column become secnd row
		int temp[][]=new int [n][n];
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<n;j++)
			{
				temp[n-j-1][i]=arr[i][j];
			}
		}

		for(int i = 0; i < n; i++)
			for(int j = 0; j < n; j++)
				arr[i][j] = temp[i][j];
	}
	//efficient method 
	//first find transpose
	//then reverse the matrix such that 1 row becomes last row ,
	//last row to first row 
	//second last row should become second row 
	public static void rotate90efficient(int arr[][])
	{
		for(int i=0;i<n;i++)
		{
			for(int j=i+1;j<n;j++)
			{
				int temp=arr[i][j];
				arr[i][j]=arr[j][i];
				arr[j][i]=temp;
			}
		}
		for(int i=0;i<n;i++)
		{
			int low=0; //first row
			int high=n-1; //last row
			while(low<high)
			{
				int temp = arr[low][i]; //columns remain same 
				arr[low][i] = arr[high][i]; //row get swapped
				arr[high][i] = temp;
				low++;
				high--;
			}
		}
	}

}
