package MatrixArray;

import java.util.Arrays;

public class Sorting2DMAtricx {
public static int[][] sortedMatrix(int N, int Mat[][]) {
        
        int r=Mat.length;
        int c=Mat[0].length;
        int arr[]=new int[r*c];
        int k=0;
        for(int i=0;i<r;i++)
        {
            for(int j=0;j<c;j++)
            {
                arr[k]=Mat[i][j];
                k++;
            }
        }
        Arrays.sort(arr);
        int km=0;
        for(int i=0;i<r;i++)
        {
            for(int j=0;j<c;j++)
            {
                Mat[i][j]=arr[km];
                km++;
            }
        }
        return Mat;
    }

}
