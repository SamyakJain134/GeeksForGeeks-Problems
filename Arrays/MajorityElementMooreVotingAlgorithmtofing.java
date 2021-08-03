package Arrays;

public class MajorityElementMooreVotingAlgorithmtofing {
//first phase finds out a candidate and guarantees that if there is a majority element in array then 
//then this candidate is going to be majority element
	//second phase check that if majority lement found out by first is actually a majority element or not 
	
	//need of second phase is only where there is no majority element in an array//this algo may not always give first occurance of the majority element
	
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
	}
