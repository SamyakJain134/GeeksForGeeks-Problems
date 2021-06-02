
public class TripletSuminArray {
//Given an array and a value, find if there is a triplet in array whose sum 
	//is equal to the given value. If there is such a triplet present in array, 
	//then print the triplet and return true. Else return false.4
	 public static boolean find3Numbers(int A[], int n, int X) { 
		    
	       //arr[i]+arr[j]+arr[k]=sum;
			quickSort(A, 0, A.length-1);
			for(int i=0;i<A.length-2;i++) // because last two elements can sum up and add in ary 
			{
				int j=i+1; ; //index next to i
				int k=A.length-1; //last index
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
	 public static boolean find3Numberss(int A[], int arr_size, int sum)
	    {
	        int l, r;
	  
	        
	        quickSort(A, 0, arr_size - 1);
	  
	        
	        for (int i = 0; i < arr_size - 2; i++) {
	  
	            
	            l = i + 1; 
	            r = arr_size - 1; 
	            while (l < r) {
	                if (A[i] + A[l] + A[r] == sum) {
	                    System.out.print("Triplet is " + A[i] + ", " + A[l] + ", " + A[r]);
	                    return true;
	                }
	                else if (A[i] + A[l] + A[r] < sum)
	                    l++;
	  
	                else 
	                    r--;
	            }
	        }
	  
	        // If we reach here, then no triplet was found
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
	public static void main(String[] args) {
		int ary[]= {1 ,4 ,45 ,6 ,10 ,8};
		System.out.println(find3Numberss(ary, ary.length, 15));
	}

}
