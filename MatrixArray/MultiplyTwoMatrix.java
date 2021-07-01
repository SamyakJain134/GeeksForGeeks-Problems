package MatrixArray;

public class MultiplyTwoMatrix {
	 public static int[][] multiplyMatrix(int A[][], int B[][])
	    {
	       int n1=A.length;
	       int m1=A[0].length;
	        int n2=B.length;
	       int m2=B[0].length;
	       if(m1!=n2)
	       {
	           int arr[][]=new int[0][0];
	           return arr;
	       }
	       else
	       {
	           int arr[][]=new int[n1][m2];
	           for(int i=0;i<n1;i++)
	           {
	               for(int j=0;j<m2;j++)
	               {
	                   int sum=0;
	                   for(int k=0;k<m1;k++)
	                   {
	                       sum=sum+A[i][k]*B[k][j];
	                   }
	                   arr[i][j]=sum;
	               }
	           }
	           return arr;
	       }
	      // return null;
	    }
}
