package Sorting;

public class QuickSortvariousPartitionMethod {
	public  static void quickSort(int[] input,int si,int ei)
    {
        if(si>=ei)
        {
            return;
        }
        int pivotpos=partition1(input,si,ei);
        quickSort(input,si,pivotpos-1);
        quickSort(input,pivotpos+1,ei);
        
    }
    private static int partition1(int[] input,int si,int ei)
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

	public static int partition(int[] arr, int left, int right) //Lomuto partition 
	{
		int i=left-1;
		int pivot=arr[right];
		for(int j=left;j<=right-1;j++)
		{
			if(arr[j]<pivot)
			{
				i++;
				int temp=arr[i];
				arr[i]=arr[j];
				arr[j]=temp;
			}
		}
		int temp=arr[i+1];
		arr[i+1]=arr[right];
		arr[right]=temp;
		
		
		return i+1;//index of pivot element which was last
	}
	//Hoare's Partition
	public static int hoarepartion(int arr[],int low,int high)
	{
		int pivot=arr[low];
		int i=low-1;
		int j=high+1;
		while(true)
		{
			do
			{
				i++;
			}
			while(arr[i]<pivot);
			do {
				j--;
			}
			while(arr[j]>pivot);
			if(i>=j)
			{
				return arr[j];
			}
			int temp=arr[i];
			arr[i]=arr[j];
			arr[j]=temp;	
		}
	}
}
