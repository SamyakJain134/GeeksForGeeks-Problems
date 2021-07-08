package MatrixArray;

public class ExchangeMatrixColumns {
	public static void exchangeColumns(int matrix[][])
    {
        int r=matrix.length;
        int c=matrix[0].length;
        for(int i=0;i<r;i++)
        {
            int temp=matrix[i][0];
            matrix[i][0]=matrix[i][c-1];
            matrix[i][c-1]=temp;
        }
    }
}
     