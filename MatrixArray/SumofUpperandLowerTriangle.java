package MatrixArray;

import java.util.ArrayList;

public class SumofUpperandLowerTriangle {
	public static ArrayList<Integer> sumTriangles(int matrix[][], int n)
    {
		int upper=0;
		int lower=0;
		//diagonal elements will be same for both 
		
        ArrayList<Integer> arr=new ArrayList<Integer>();
        //int sum=0;
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
               if(i==j)
               {
            	   upper=upper+matrix[i][j];
            	   lower=lower+matrix[i][j];
               }
               else if(j>i)
               {
            	   upper=upper+matrix[i][j];
               }
               else if(i>j) 
               {
            	   lower=lower+matrix[i][j];
               }
            }
        }
       arr.add(upper);
       arr.add(lower);
       return arr;
      
    }

}
