package Sorting;

import java.util.Arrays;

public class CountNoofPairs {
	//Given two arrays X and Y of positive integers, 
	//find the number of pairs such that xy > yx (raised to power of) where x is an 
	//element from X and y is an element from Y.

	
	//If element of y>x then it is a possible pair /
	//if element is 1 then the count of number of zeros is a possible pair 
	
	//Exceptions
	//In x array if element is zero then no change in count Y array ke case me hoga 
	//1pow(0)>0pow(1)
	//y=3 and y=2 ke lie x=2 wala case kaam nahi karega 
	//if x=2 then subtract number of three and number of 4 from y array 
	//Oand 1 powe wala case sabse sath valid hai jese 6pow(0)>0pow(6)
	//Therefore koi bhi number ho number of zero and number of one to add karne hi karne hai usme  
	public  static long countPairs(int x[], int y[], int M, int N)
    {
        int zeros=0,one=0,three=0,four=0,two=0;
        Arrays.sort(x);
        Arrays.sort(y);
        //Counting elements in Y array
        for(int i=0;i<N;i++)
        {
        	if(y[i]==0)
        	{
        		zeros++;
        	}
        	if(y[i]==1)
        	{
        		one++;
        	}
        	if(y[i]==3)
        	{
        		three++;
        	}
        	if(y[i]==4)
        	{
        		four++;
        	}
        	if(y[i]==2)
        	{
        		two++;
        	}
        }
        //Traversing x[] elements
        long ans=0;
        for(int i=0;i<M;i++)
        {
        	if(x[i]==0)
        	{
        		continue; 
        	}
        	if(x[i]==1)
        	{
        		//jitne bhui zeros hai uske sath pair hoga 
        		ans=ans+zeros;
        	}
        	else if(x[i]==2)
        	{
        		//jitne bhui zeros hai uske sath pair hoga
        		int index=getIndex(y,N,2); 
        		//index will be all the elements greater then 2
        		if(index!=-1) //if none of the elements are greater then 2
        		{
        			ans=ans+N-index; //bacuse n is length of y array and index is elements greater then x
        		}
        		ans=ans-three;
        		ans=ans-four; //because these two cases are not possible in case of two as stated above
        		ans=ans+zeros+one;
        	}
        	
        	else
        	{
        		int index=getIndex(y, N, x[i]);
        		if (index!=-1)
        		{
        			ans=ans+N-index;
        		}
        		ans=ans+zeros+one;
        	     if(x[i]==3)
                {
        		ans=ans+two;
        	    }
        	}
        }
        return ans;
    }

private static int getIndex(int[] y, int n, int element) {
	int low=0;
	int high=n-1;
	int ans=-1;
	while(low<=high)
	{
		int mid=(low+high)/2;
		if(y[mid]>element)
		{
			ans=mid;
			high=mid-1;
		}
		else
		{
			low=mid+1;
		}
	}
	return ans;
}
 	

}
