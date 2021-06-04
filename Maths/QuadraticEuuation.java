package Maths;

import java.util.ArrayList;

public class QuadraticEuuation {
	public ArrayList<Integer> quadraticRoots(int a, int b, int c) {
	int x1, x2 ;
    ArrayList<Integer>aa=new ArrayList<Integer>();
    int q = (int)(Math.pow(b,2) - 4*a*c) ;
    if(q<0)
    {
       aa.add(-1);
    }
    else
    {
        x1= (int)(Math.floor((-1*b + Math.sqrt(q ))/(2*a))) ;
        x2 =(int)(Math.floor((-1*b-Math.sqrt(q))/(2*a )));
        aa.add(Math.max(x1,x2));
        aa.add(Math.min(x1 ,x2));
        
        
    }
    return aa ;
}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
