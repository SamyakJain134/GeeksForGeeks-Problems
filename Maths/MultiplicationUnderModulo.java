package Maths;

public class MultiplicationUnderModulo {
	public  static long multiplicationUnderModulo(long a, long b)
	    {
	        long M=(long)Math.pow(10,9)+ 7;
	        long c=(long)(a%M);
	        long r=(long)(b%M);
	        return (long)((c*r)%M);
	    }
}
