package MatrixArray;

public class ReversingColumnsinMatrix {
	public static void reverseCol(int matrix[][])
	    {
	        int r=matrix.length;
	        int c=matrix[0].length;
	        for(int i=0;i<r;i++)
	        {
	           for(int j=0;j<c/2;j++)
	           {
	               int temp=matrix[i][j];
	               matrix[i][j]=matrix[i][c-j-1];
	               matrix[i][c-j-1]=temp;
	           }
	        }
	    }
}
