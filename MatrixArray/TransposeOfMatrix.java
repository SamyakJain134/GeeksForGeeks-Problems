package MatrixArray;

public class TransposeOfMatrix {
	static int n=4;
	public static void printTranspose(int arr[][])
	{
		//We know in transpose diagonal elements remains same 
		//so we need to swap upper elemets with lower once
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
			for(int j=0;j<n;j++)
			{
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
	}
	//naive solution
	
	public 	static void transpose(int mat[][])
		{
			int temp[][] = new int[n][n];

			for(int i = 0; i < n; i++)
				for(int j = 0; j < n; j++)
					temp[i][j] = mat[j][i];

			for(int i = 0; i < n; i++)
				for(int j = 0; j < n; j++)
					mat[i][j] = temp[i][j];

		}
	
	public static void main(String args[]) 
    {
        int arr[][] = {{1, 2, 3, 4},
    				   {5, 6, 7, 8},
    				   {9, 10, 11, 12},
    				   {13, 14, 15, 16}};
        printTranspose(arr);
    }

}
