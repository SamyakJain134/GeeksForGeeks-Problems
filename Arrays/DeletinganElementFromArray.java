package Arrays;

public class DeletinganElementFromArray {
	
	public static int deleteElement(int ary[] , int element)
	{
		int i;
		for(i=0 ; i<ary.length;i++)
		{
			if(ary[i]==element)
			{
				break;
			}
		}
		if(i==ary.length)// did not find element
		{
			return ary.length;
		}
		//copying element one before
			for(int j=i;i<ary.length-1;j++)
			{
				ary[j]=ary[j+1];
			}		
			System.out.println(ary.toString());
		return ary.length-1;
	}
	public static void main(String[] args) {
		int ary[]= {2,3,4,5,6,7,8,9,4,5,8};
		System.out.println(deleteElement(ary, 3));

	}

}
