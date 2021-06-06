package Recursion;

public class PowerofANumber {
	long power(int N,int R)
    {
        final long M = 1000000007;
        if(R==0)// kisiki bhi power zero is 1
        return 1;
        long temp = power(N,R/2);
        temp = (temp * temp)%M; //For calc mod in both case even or odd
        if(R%2==0)
        return (temp); // for even return the same result
        else
        return (temp*N%M); // for odd multiply with mod of N again
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
