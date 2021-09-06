package MatrixArray;

import java.util.Scanner;

public class DifferenceBetwwenSumofTwoDiagonal {
	 public static int difference(int arr[][], int n)
	    {
	        // Initialize sums of diagonals
	        int d1 = 0, d2 = 0;
	      
	        for (int i = 0; i < n; i++)
	        {
	            for (int j = 0; j < n; j++)
	            {
	                // finding sum of primary diagonal
	                if (i == j)
	                    d1 += arr[i][j];
	      
	                // finding sum of secondary diagonal
	                if (i == n - j - 1)
	                    d2 += arr[i][j];
	            }
	        }
	      
	        // Absolute difference of the sums
	        // across the diagonals
	        return Math.abs(d1 - d2);
	    }
	 public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int n = s.nextInt();
int first[][] = new int[n][n];

// Read the matrix values
System.out.println("Enter the elements of the matrix");
for (int i = 0; i < n; i++) {
  for (int j = 0; j < n; j++) {
	  first[i][j] = s.nextInt();
  }
      
	}
System.out.println(difference(first, n));
	 } 
}
