package Maths;

public class GPTerm {
	 public double termOfGP(int A,int B,int N)
	    {
	        double r=((double) B)/((double) A);
	        return A*Math.pow(r,N-1);
	    }
	

}
