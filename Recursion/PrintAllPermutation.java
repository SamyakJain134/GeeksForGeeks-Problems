package Recursion;

public class PrintAllPermutation {
	public static void printPeermutation(String s, int index)
	{
		if(index==s.length()-1)
		{
			System.out.println(s+" ");
		}
		for(int i=index;i<s.length();i++)
		{
			char temp=s.charAt(index);
			//s.charAt(index)=s.charAt(i);
			
			printPeermutation(s, index+1);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
