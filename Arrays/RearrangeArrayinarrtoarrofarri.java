package Arrays;
//Given an array arr[] of size N where every element is in the range from 0 to n-1. 
//Rearrange the given array so that arr[i] becomes arr[arr[i]]
public class RearrangeArrayinarrtoarrofarri {
	 public static void arrange(long arr[], int n)
	    {
	       //IDea here is 
		 //Calculate a binded number by calculating a*b*n
		// where a=arr[i] and b=arr[arr[i]]
		//	now binded value %n gives previous value and binded vaue/n gives new value	 
			
		 for(int i=0;i<n;i++)
			 {
				arr[i]=arr[i]+(arr[(int)arr[i]]%n)*n;
				//main element = a+b*n
				//b=arr[(int)arr[i]]%n
				//%n to get previous value 
			 }
			 for(int i=0;i<n;i++)
			 {
				 arr[i]=arr[i]/n;
			 }
	    }

}
