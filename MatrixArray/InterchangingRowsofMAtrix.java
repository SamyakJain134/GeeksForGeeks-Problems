package MatrixArray;

public class InterchangingRowsofMAtrix {
	static void interchangeRows(int arr[][])
    {
        int r=arr.length;
        int c=arr[0].length;
        
        for(int i=0;i<r/2;i++)
        {
            for(int j=0;j<c;j++)
            {
                int temp=arr[i][j];
                arr[i][j]=arr[r-i-1][j];
                arr[r-i-1][j]=temp;
            }
            
        }
    }
}
