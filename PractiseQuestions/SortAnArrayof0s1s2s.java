package PractiseQuestions;

public class SortAnArrayof0s1s2s {
//Given an array of size N containing only 0s, 1s, and 2s; 
	//sort the array in ascending order.
	 public static void sort012(int a[], int n)
	    {
	        int low=0; //for zero 
	        //every elemet left ofwill be 0
	        int mid=0; //for 1
	        //every elemet left ofwill be 0
	        int high=n-1;//for two 
	      //every elemet left of will be 2
	        while(mid<=high)
	        {
	            if(a[mid]==0)
	            {
	               int temp=a[low];
	                a[low]=a[mid];
	                a[mid]=temp;
	                low++;
	                mid++;
	            }
	            else if(a[mid]==1)
	            {
	                mid++;
	            }
	            else
	            {
	               int  temp=a[high];
	                a[high]=a[mid];
	                a[mid]=temp;
	                high--;
	            }
	        }
	    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
