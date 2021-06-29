package Sorting;

public class TripletSuminArray {
	public static boolean find3Numbers(int A[], int n, int X) { 
	    
	       //arr[i]+arr[j]+arr[k]=sum;
			quickSort(A, 0, n-1);
			for(int i=0;i<n-2;i++) // because last two elements can sum up and add in ary 
			{
				int j=i+1; ; //index next to i
				int k=n-1; //last index
				while(j<k)
				{
					if(A[i]+A[j]+A[k]==X)
					{
						return true;
					}
					else if(A[i]+A[j]+A[k]<X)
					{
						j++;
					}
					else
					{
						k--;
					}
				}
			}
			return false;
	    
	    }
	    	private static void quickSort(int[] input,int si,int ei)
	    {
	        if(si>=ei)
	        {
	            return;
	        }
	        int pivotpos=partition(input,si,ei);
	        quickSort(input,si,pivotpos-1);
	        quickSort(input,pivotpos+1,ei);
	        
	    }
	    private static int partition(int[] input,int si,int ei)
	    {//find the index of pivot element ,
	    	
	         int pivot=input[si];//first element
	        int k=si; 
	        int count=0; //to count number of elements less then pivot 
	        while(k<=ei) // element to be placed in left
	        {
	            if(pivot>input[k])
	            {
	                count++;
	            }
	            k++;
	        }
	        int pivotPos=si+count; //to find the index of pivot element , 
	        int temp=input[si];
	        input[si]=input[pivotPos];
	        input[pivotPos]=temp; // replace the position of element
	        int i=si; //for arranging in ascending order 
	        int j=ei; //for arranging in ascending order 
	        while(i<pivotPos&&j>pivotPos)
	        {
	            if(input[i]<pivot)// chota hai element matlab sahi jagah hai array ke
	            {
	                i++;
	            }
	            else
	            {
	                if(input[j]>=pivot) // changed
	                { // bada hai element matlab sahi jagah hai array ke
	                    j--;
	                }
	                else//chota h element to swap karenge  
	                {
	                    int temp1=input[i];
	                    input[i]=input[j];
	                    input[j]=temp1; //changed
	                    i++; //added
	                    j--; //added
	                }
	            }

	        }
	        return pivotPos;
	    }

}
