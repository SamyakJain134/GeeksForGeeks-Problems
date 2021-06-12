package Arrays;

public class RearrangeArrayAlternatively {
	 public static void rearrange(int arr[], int n){
	        
		 int max_index=n-1;
		 int min_index=0;
		 int max=arr[n-1]+1;
		 
		 for(int i=0;i<n;i++)
		 {
			 if(i%2==0) //even places element ke liye max elements aayenge 
			 {
				 arr[i]=(arr[max_index] % max)*max + arr[i];
				 max_index--;
			 }
			 else
			 {
				 arr[i]=( arr[min_index] % max)*max + arr[i];
				 min_index++;
			 }
		 }
		 for(int i=0;i<n;i++)
		 {
			 arr[i]=arr[i]/max;
		 }
	    }

}
