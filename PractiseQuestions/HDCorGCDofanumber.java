package PractiseQuestions;

public class HDCorGCDofanumber {
	public static int GCD(int a,int b)
	
	{
		int res=Math.min(a, b);
		while(res>0)
		{
			if(a%res==0 && b%res==0)
			{
				break;
			}
			res--;
		}
		return res;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
