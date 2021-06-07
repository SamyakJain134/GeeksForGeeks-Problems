package Arrays;

public class FrequencyinSortedArray {
	public static void frequencyinSortedArray(int arr[])
	{
		int freq=1;
		int i=1;
		while(i<arr.length)
		{
			while(i<arr.length && arr[i-1]==arr[i])
			{
				freq++;
				i++;
			}
			System.out.println(arr[i-1]+" "+freq);
			freq=1;
			i++;
		}
		//if only one element or last element not equal
		if(arr.length==1 || arr[arr.length-1]!=arr[arr.length-1])
		{
			System.out.println(arr[arr.length-1]+" "+ 1);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
