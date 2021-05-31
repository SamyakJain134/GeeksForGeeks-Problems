package Arrays;

public class InsertElementatPosition {
	public static int insert(int arr[], int pos , int element , int capacity )
	{
		
		if(arr.length==capacity)
		{
			return arr.length;
		}
		int index=pos-1;
		for(int i = arr.length-1;i>=index;i--)
		{
			arr[i+1]=arr[i]; // shifting elements after i to i+1
		}
		arr[index]=element;
		return arr.length+1;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int ary[]= new int [7];
		for (int i=0;i<5;i++)
		{
			ary[i]=i;
		}
		System.out.println(insert(ary,5 , 9, 7));
	}

}
