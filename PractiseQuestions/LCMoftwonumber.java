package PractiseQuestions;

public class LCMoftwonumber {
public static int LCM(int a,int b)
	
	{
		int res=Math.max(a, b);
		while(true)
		{
			if(a%res==0 && b%res==0)
			{
				break;
			}
			res++;
		}
		return res;
	}
//Effifcient approach
public static int Euclidianusingrecursopn(int a,int b)

{
	if(b==0)
	{
		return a;
	}
	return Euclidianusingrecursopn(b, a%b);
}
public static int LCMefficient(int a,int b)

{
	return (a*b)/Euclidianusingrecursopn(a, b);
}

}
