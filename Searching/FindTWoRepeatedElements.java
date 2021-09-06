package Searching;

public class FindTWoRepeatedElements {
	public static int[] twoRepeated(int arr[], int N)
    {
       boolean first = false;
        int[] res = new int[2];
        
        //iterating over the array elements.
        for(int p=0;p<N+2;p++)
        {
            //making the visited elements negative.
		    if(arr[Math.abs(arr[p])] > 0)
		    {
		    	System.out.println(Math.abs(arr[p]));
		    	System.out.println(arr[Math.abs(arr[p])]);
		        arr[Math.abs(arr[p])] = -arr[Math.abs(arr[p])];
		    }
		    //if the number is negative, it was visited previously
            //so this would be the repeated element.
		    else
		    {
		        //storing first and second repeated element accordingly.
		        if(first==false)
	            {
	                res[0] = Math.abs(arr[p]);
	                first = true;
	            }
		        else
		            res[1] = Math.abs(arr[p]);
		            
		    }
        }
        //returning the result.
        return res;
    }
	public static void main(String[] args) {
		int arr[]={1,2,1,3,4,3};
		int arr2[]=twoRepeated(arr,arr.length);
		System.out.println(arr2[0]+"   "+arr2[1]);
	}
}
