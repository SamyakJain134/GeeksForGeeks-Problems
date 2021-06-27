package Sorting;

public class SortingElementwithThreeType {
	//Sort an array with 0's 1's and 2's
	//Three way partitioning around a pivot element where all occurance of pivot element should come together 
	//and smaller to pivot in left and greater to pivot in right
	
	//partitition around a range //first smaller element then elements in given range then bigger element
	public static void sortarraywithzeroandone(int arr[])
	{
		//We will use hoare's partition here 
		int low=0;
		int mid=0;
		int high=arr.length-1;
		while(mid<=high)
		{
			if(arr[mid]==0)
			{
				int temp=arr[low];
				arr[low]=arr[mid];
				arr[mid]=temp;
				low++;
				mid++;
			}
			else if(arr[mid]==1)
			{
				mid++;	
			}
			else //arr[mid==2
			{
				int temp=arr[high];
				arr[high]=arr[mid];
				arr[mid]=temp;
				high--;
				//we will not incremen mid because 
				//after swapping we do not know what element was there earlier at arr[high]
				//so mid will be compared in next iteration
			}
		}
	}
}
