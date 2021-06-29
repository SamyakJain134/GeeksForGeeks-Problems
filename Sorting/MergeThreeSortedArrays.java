package Sorting;

import java.util.ArrayList;

public class MergeThreeSortedArrays {
	 public static ArrayList<Integer> merge3sorted(int A[], int B[], int C[])
	    {
	        int n=A.length;
	        int m=B.length;
	        int o=C.length;
	        //Creating a list for storing output.
	        ArrayList<Integer> arr=new ArrayList<Integer>(n+m+o);
	        int i=0;
	        int j=0;
	        int k=0;
	      //Using three pointers over the three lists which helps in choosing
	        //and storing the smallest element in the output list.
	        while(i<n && j<m && k<o)
	        {
	        	 //Finding minimum of A[i], B[j] and C[k]
	        	int min=Math.min(A[i],Math.min(B[j],C[k]));
	        	arr.add(min);//We store the minimum value in output list.
	        	if(min==A[i])
	        	{
	        		i++;
	        	}
	        	else if(min==B[j])
	        	{
	        		j++;
	        	}
	        	else//(min==C[k])
	        	{
	        		k++;
	        	}
	        	 //Incrementing the pointer which had the minimum value.
	        }
	        // next three while loop is to sort two
	        // of arrays if one of the three gets exhausted
	        //Lets assume C is exhausted 
	      //If C has exhausted(its pointer has crossed last element) then 
	        //we continue storing the minimum values from other two lists.
	        while(i<n && j< m)
	        {
	        	int min=Math.min(A[i],B[j]);
	        	arr.add(min);//We store the minimum value in output list.
	        	if(min==A[i])
	        	{
	        		i++;
	        	}
	        	else//(min==B[j])
	        	{
	        		j++;
	        	}
	        }
	      //Lets assume b is exhausted 
	        //If B has exhausted(its pointer has crossed last element) then 
	        //we continue storing the minimum values from other two lists.
	        while(i<n && k<o)
	        {
	        	int min=Math.min(A[i],C[k]);
	        	arr.add(min);//We store the minimum value in output list.
	        	if(min==A[i])
	        	{
	        		i++;
	        	}
	        	else//(min==B[j])
	        	{
	        		k++;
	        	}
	        }
	      //Lets assume A is exhausted 
	        //If A has exhausted(its pointer has crossed last element) then 
	        //we continue storing the minimum values from other two lists.
	        while(j<m && k<o)
	        {
	        	int min=Math.min(B[j],C[k]);
	        	arr.add(min);//We store the minimum value in output list.
	        	if(min==B[j])
	        	{
	        		j++;
	        	}
	        	else//(min==B[j])
	        	{
	        		k++;
	        	}
	        }
	        //
	        //
	      //If B and C have exhausted (their pointer has crossed last element) then
	        //we continue storing the minimum values from the last list A.
	        while(i<n)
	        {
	        	arr.add(A[i]);
	            i++;
	        }
	      //If A and C have exhausted (their pointer has crossed last element) then
	        //we continue storing the minimum values from the last list B.
	        while(j<m)
	        {
	        	arr.add(B[j]);
	        	j++;
	        }
	      //If A and B have exhausted (their pointer has crossed last element) then
	        //we continue storing the minimum values from the last list C.
	        while(k<o)
	        {
	        	arr.add(C[k]);
	        	k++;
	        }
	        return arr;
	    }

}
