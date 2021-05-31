package Arrays;

public class ArraysQuestions 
{
	//Inserting element at an index
	 public static int[] insertAtIndex(int arr[],int sizeOfArray,int index,int element)
	    {
	        for(int i=arr.length-1; i>=index ; i-- )
	        {
	        	arr[i+1]=arr[i];
	        }
	        arr[index]=element;
	        return arr;
	    }
	 //Deleting an element from array 
	 public static void deleteFromArray(int arr[], int n, int index)
	    {
	        // Your code here
	    }
	 //Count Smaller then X
	 public static int smallerThanX(int arr[], int n, int x)
	    {
			return x;
	        // Your code here
	    }
	 //Fonding immediate smaller then x
	 public static int immediateSmaller(int arr[], int n, int x)
	    {
			return x;
	        // Your code here
	    }
	//LArgest Element in an array
	public static int LargestElement(int arr[]) 
	{
		int largest=arr[0];
		for(int i=1;i<arr.length;i++)
		{
			if(arr[i]>largest)
			{
				largest=arr[i];
			}
		}
		return largest;
	}
	
	//Remove Duplicates from Sorted Array
	public static int removeDuplicates(int arr[])
	{
		int result=1; //because there must be one element
		for(int i=1;i<arr.length;i++)
		{
			if(arr[i]!=arr[result-1])
			{
				arr[result]=arr[i];
				result++;
			}
		}
		return result;
			
	}
	// Check if array is sorted 
	public static boolean checkIfSorted(int arr[])
	{
		for(int i =1 ;i< arr.length; i++)
		{
			if(arr[i]>arr[i-1])
			{
				return true;
			}
		}
		return false;
	}
	
	//Left Rotate an array by 1 
	 public static int[] rotateArray(int ary[])
	 {
		 int temp=ary[0];
		 for(int i=0;i<ary.length-1;i++)
		 {
			 ary[i]=ary[i+1];
		 }
		 ary[ary.length-1]=temp;
		 return ary;
		 
	 }
	 //Reversing an Array
	 public static int[] ReverseArray(int arr[])
	 {
		 int startIndex=0;
		 int endIndex=arr.length-1;
		 while(startIndex<endIndex)
		 {
			 int temp=arr[startIndex];
			 arr[startIndex]=arr[endIndex];
			 arr[endIndex]=temp;
			 startIndex++;
			 endIndex--;
		 }
		 return arr;
	 }
	 //checking if Sorted abhi galat hai 
	 
	 public static int isSorted(int arr[], int n)
	    {
	        int flag=1;
	        int flagg=1;
	        for(int i =1 ;i < n; i++)
			{
				if(arr[i]>=arr[i-1])
				{
					flag=1;
				}
				else
				{
				    flag=0;
				}
			}

			for (int i=1;i<n;i++)
			{
			    if(arr[i-1]>arr[i])
			    {
			        flagg=1;
			    }
			    else
			    {
			        flagg=0;
			    }
			}
			if(flag==1||flagg==1)
			{
			    return 1;
			}
			else
			{
			    return 0;
			}
	    }
	 

	public static void main(String[] args) {
		int ary[]= {2,3,4,5,6,7};
		//int ary2[]=rotateArray(ary);
		int ary2[]=ReverseArray(ary);
		for(int i=0;i<ary2.length;i++)
		{
			//System.out.print(ary2[i]);
			//System.out.println();
		}
		System.out.println(checkIfSorted(ary));
		//System.out.println(LargestElement(ary));
		int ary3[]= {9,5,25,69,49,82, 69, 60, 7 ,22, 23 ,39, 9, 74, 56 ,13, 86, 16 ,90, 31, 18, 90 ,68, 43, 16 ,62 ,20, 98 ,23, 59,46 ,72, 50, 8,91};
		System.out.println(isSorted(ary3, ary3.length));
	}

}
