package Searching;

public class MedianofTwoSortedArrays {
	 public static  int findMedianNaive(int arr[], int n, int brr[], int m)
	    {
	     //first we will merge sorttwo arrays then find median 
		 int i=0;
		 int j=0;
		 int k=0; //for iterating through new array
		 int newarylength=n+m;
		 int finalary[]=new int[newarylength];
		 while(i<arr.length &&  j<brr.length)
		 {
			 if(arr[i]<brr[j])
			 {
				 finalary[k]=arr[i];
				 i++;
				 k++;
			 }
			 else
			 {
				 finalary[k]=brr[j];
				 j++;
				 k++;
			 }
		 }
		 while(i<arr.length)
		 {
			 finalary[k]=arr[i];
			 i++;
			 k++;
		 }
		 while(j<brr.length)
		 {
			 finalary[k]=brr[j];
			 j++;
			 k++;
		 }
		 double median=0.0;
		 int mid=finalary.length/2;
		 if(finalary.length%2==1)
		 {
			 median= mid;
		 }
		 else
		 {
			 median=(finalary[mid]+finalary[mid-1])/2.0;
		 }
		 return (int) median;
	    }
	 public static int findMedian2(int arr[], int n, int brr[], int m)
	    {
	        //Consider n<=m
	        //Create left half arr[0...i1-1] and brr[0....i2-1]
		 	//Create right half arr[i1....n] and brr[i2...n]
		 //i1=i1/2
		 //i2=(n+m+1)/2-i1;
		 //AIM-Left half should be smaller then right half
		 
		 //MIN1- minimum element of right side of arr
		 //MAX1- maximum element of left sid of arr
		 //MIN2-minimum element of right side of brr
		 //MAX2-maximum element of left sid of brr
		 //Compare max2 with min 1 
		 //if smax2<min1 then it is ok , find median 
		 //else max2--
		 
		 //Similarly
		 //MAx1 should be smaller then MIN2
		 //if(max1>min2) shift left
		 //Condition= (max1<=min2 && max2<=min1)
		 
		 int begin1=0;
		 int end1=n;
		 while(begin1<=end1)
		 {
			 int i1=begin1+end1/2;
			 int i2=(n+m+1)/2-i1;
			 int min1=Integer.MIN_VALUE;
			 if(i1==n)
			 {
				 min1=Integer.MAX_VALUE;
			 }
			 else
			 {
				 min1=arr[i1];
			 }
			 int max1=Integer.MAX_VALUE;
			 if(i1==0)
			 {
				 max1=Integer.MIN_VALUE;
			 }
			 else
			 {
				 max1=arr[i1-1];
			 }
			 //////////////////////////////////////////////////////////////
			 int min2=Integer.MIN_VALUE;
			 if(i2==m)
			 {
				 min2=Integer.MAX_VALUE;
			 }
			 else
			 {
				 min2=brr[i2];
			 }
			 int max2=Integer.MAX_VALUE;
			 if(i2==0)
			 {
				 max2=Integer.MIN_VALUE;
			 }
			 else
			 {
				 max2=brr[i2-1];
			 }
			// int min1w= (n==n) ? Integer.MAX_VALUE : arr[i1];
			// int max2= (n=0) ? Integer.MIN_VALUE  arr[i1-1];
			 
			 if(max1<=min2  && max2<=min1)
			 {
				  if(n+m%2==0)
				  {
					  return (int) ((double)(Math.max(max1,max2)+ Math.min(min1, min2))/2);
				  }
				  else
				  {
					  return Math.max(max1, max2);
				  }
			 }
			 else if(max1>min2)
			 {
				 end1=i1-1;
			 }
			 else
			 {
				 begin1=i1+1;
			 } 
		 }
		return -1;
	    }
	 public static int findMedian(int arr[], int n, int brr[], int m)
	    {		 
		 int begin1=0;
		 int end1=n;
		 int i1,i2,min1,min2,max1,max2;
		 while(begin1<=end1)
		 {
			  i1=begin1+end1/2;
			 i2=(n+m+1)/2-i1;
			 min1=(i1==n)? Integer.MAX_VALUE:arr[i1]; //nothing on the right side
			 max1=(i1==0)?Integer.MIN_VALUE:arr[i1-1];//nothing on the left side
			 min2=(i2==m)?Integer.MAX_VALUE:arr[i2];
			 max2=(i2==0)?Integer.MIN_VALUE:arr[i2-1];
			 //checking for binary serch
			 if(max1<=min2 && max2 <= min1)
			 {
				 if(n+m%2==0)
				  {
					  return (int) ((double)(Math.max(max1,max2)+ Math.min(min1, min2))/2);
				  }
				  else
				  {
					  return Math.max(max1, max2);
				  }
			 }
			 else if(max1>min2)
			 {
				 end1=i1-1; //move to left side
			 }
			 else
			 {
				 begin1=i1+1;//move to right side
			 }
		 }
		 return -1;
	    }
	 public static int findMedian3(int arr[], int n, int brr[], int m)
	    {
	        
		 
		 int begin1=0;
		 int end1=n;
		 while(begin1<=end1)
		 {
			 int i1=begin1+end1/2;
			 int i2=(n+m+1)/2-i1;
			 int min1=(i1==n)? Integer.MAX_VALUE:arr[i1]; //nothing on the right side
			 int max1=(i1==0)?Integer.MIN_VALUE:arr[i1-1];//nothing on the left side
			 int min2=(i2==m)?Integer.MAX_VALUE:arr[i2];
			 int max2=(i2==0)?Integer.MIN_VALUE:arr[i2-1];
			 //checking for binary serch
			 if(max1<=min2 && max2 <= min1)
			 {
				 if((n+m)%2==0)
				  {
					  return (int)Math.floor(Math.max(max1, max2)+Math.min(min2, min1))/2;
				  }
				  else
				  {
					  return (int)(Math.floor(Math.max(max1, max2)));
				  }
			 }
			 else if(max1>min2)
			 {
				 end1=i1-1; //move to left side
			 }
			 else
			 {
				 begin1=i1+1;//move to right side
			 }
		 }
		 return -1;
	    }
	
	 
	 public static void main(String args[])
	 {
		 int arr[]={1,2,3,4,5};
		 int brr[]={3,4,5,6,7,8};
		 System.out.println(findMedian(arr, 5, brr, 6));
	 }
	 
}
