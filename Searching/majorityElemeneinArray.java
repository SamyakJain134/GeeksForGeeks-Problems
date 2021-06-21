package Searching;

public class majorityElemeneinArray {
	 static void findMajority(int arr[], int n)
    {
        int maxCount = 0;
        int index = -1; // sentinels
        for (int i = 0; i < n; i++) 
        {
            int count = 0;
            for (int j = 0; j < n; j++) 
            	{
                	if (arr[i] == arr[j])
                		count++;
            	}

            // update maxCount if count of
            // current element is greater
             		if (count > maxCount) {
                maxCount = count;
                index = i;
            }
        }

        // if maxCount is greater than n/2
        // return the corresponding element
        if (maxCount > n / 2)
            System.out.println(arr[index]);

        else
            System.out.println("No Majority Element");
    }

	 	//MooreVotingAlgorithm
	//first phase finds out a candidate and guarantees that if there is a majority element in array then 
	//then this candidate is going to be majority element
		//second phase check that if majority lement found out by first is actually a majority element or not 
		
		//need of second phase is only where there is no majority element in an array
	 //this algo may not always give first occurance of the majority element
		
		public static int findmajorityElement(int arr[]) //finding majority element first
		{
			int res=0; //by defaulkt fist element
			int count=1; //atleast ek count to rahega
			for(int i=1;i<arr.length;i++)
			{
				if(arr[res]==arr[i]) //phle 2 element compare kiye
				{
					count++;
				}
				else //agar equal nhai hue to count kam kr diya aur 
				{
					count--; 
				}
				if(count==0) //res ko update kr denge aab yahin se res ko compare karenge
				{
					res=i; //res will always contain index
					count=1;
				}  
			}
			//Checking if Majority element is right or wrong
			count=0;
			for(int i=0;i<arr.length;i++)
			{
				if(arr[res]==arr[i])
				{
					count++;
				}
				
			}
			if(count<=arr.length/2)
			{
				res=-1;
			}
			return res; //	index of majority elment 
			}
		

    public static void main(String[] args)
    {

        int arr[] = { 1, 1, 2, 1, 3, 5, 1 };
        int n = arr.length;

        // Function calling
        findMajority(arr, n);
    }
   
}

