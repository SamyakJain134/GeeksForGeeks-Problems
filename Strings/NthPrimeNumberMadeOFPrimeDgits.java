package Strings;

public class NthPrimeNumberMadeOFPrimeDgits {
	public static int primeDigits(int n)
    {
        int num=n;
        int a=2;
        int p=0;
        int m , d;
        while(p!=num)
        {
            m=a;
            while(m!=0)
            {
                d=m%10;
                if(d==2 || d==3|| d==5 ||d==7)
                {
                    m=m/10;
                }
                else
                {
                    break;
                }
            }
            //Yaha tak hogya nmatlab dono number prime hai 
            if(m==0)
            {
                p++;
            }
            a++;
        }
        return a-1;
    }
}
