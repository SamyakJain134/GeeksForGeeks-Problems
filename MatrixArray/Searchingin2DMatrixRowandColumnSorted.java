package MatrixArray;

public class Searchingin2DMatrixRowandColumnSorted {
	public static void search(int arr[][],int target)
	{
		int r=0;
		int c=arr[0].length-1;
		while(r<arr.length && c>=0 )
		{
			if(arr[r][c]==target)
			{
				System.out.println("Element found at "+(r+1)+ " row "+(c+1)+" Column");
				return ;
			}
			else if(arr[r][c]>target)
			{
				c--;
			}
			else
			{
				r++;
			}
		}
		 System.out.print("n Element not found");
		 return;
	}
	public static void main(String args[])
	{
		  int mat[][] = { { 10, 20, 30, 40 },
                  { 15, 25, 35, 45 },
                  { 27, 29, 37, 48 },
                  { 32, 33, 39, 50 } };

		  search(mat, 29);
	}

}
