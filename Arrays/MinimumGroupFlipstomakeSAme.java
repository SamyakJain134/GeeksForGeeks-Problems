package Arrays;

public class MinimumGroupFlipstomakeSAme {
	//given a binary or boolean array
	//convert all zxeros to one or vice cersa in minimum flips
	public static void printNumberofFlips(int arr[])
	{
		for(int i=1;i<arr.length;i++)
		{
			if(arr[i]!=arr[i-1]) //{0,0,1,1,0,0,1,1}
			{
				//loop ke ander ayega nhai phle 
				if(arr[i]!=arr[0]) //new group beginning which needs to be flipped
				{
					System.out.print("From "+ i +" to ");
				}
				else
				{
					System.out.println(i-1);
				}
			}
		}
		if(arr[arr.length-1]!=arr[0])//last me ek element alag hai uska naya group banega
		{
			System.out.println(arr.length-1);
		}
	}
	public static void  main(String args[])
	{
		int arr[]={0,0,1,1,0,0,1,1};
		printNumberofFlips(arr);
	}
}
