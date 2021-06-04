package Maths;

public class AdditionUnderModulo {
	public static long sumUnderModulo(long a, long b){
        long d=(long)Math.pow(10,9)+ 7;
        long c=(long)(a%d);
        long r=(long)(b%d);
        return (long)((c+r)%d);
    }  

	

}
