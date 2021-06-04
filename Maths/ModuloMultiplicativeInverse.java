package Maths;

public class ModuloMultiplicativeInverse {
	public static int modInverse(int a, int m)
    {
        int val=0;
        for(int i=0;i<m;i++)
        {
            val=a*i;
            if(val%m==1)
            {
                return i;
            }
        }
        return -1;
    }

}
