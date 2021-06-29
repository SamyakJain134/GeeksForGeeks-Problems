package MatrixArray;

public class AdditionofTwoMatrix {
	 static int[][] sumMatrix(int A[][], int B[][])
	    {
	        //storing the size of rows and columns.
	        int n1 = A.length; //row ki length
	        int m1 = A[0].length; //column ki length
	        int n2 = B.length;
	        int m2 = B[0].length;
	        
	        //we can add matrices only if both have same no. of rows and columns.
	        if(n1 != n2 || m1 != m2)
	        {
	            int result[][] = new int[0][0];
	            return result;
	        }
	        else
	        {
	            //list to store the result.
	            int result[][] = new int[n1][m1];
	            for(int i = 0; i  < n1; i++)
	                for(int j = 0; j < m1; j++)
	                    //calculating the sum.
	                    result[i][j] = A[i][j] + B[i][j];
	                    
	            //returning the result.
	            return result;
	        }
	    }
}
