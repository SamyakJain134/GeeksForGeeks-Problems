package PractiseQuestions;

import java.util.Scanner;

public class KaprekarNumber {
	 public static void main(String args[])
	  {
	    Scanner s=new Scanner(System.in);
		int x=s.nextInt();
	    int sqr=x*x;
	    int c=sqr;
	    int countdigit=0;
	    while(c>0)
	    {
	      countdigit++;
	      c=c/10;
	    }
	    int sum=0;
	    for(int i=1;i<countdigit;i++)
	    {
	      int parts = (int) Math.pow(10, i);
	             // To avoid numbers like 10, 100, 1000 (These are not
	             // Karprekar numbers
	             if (parts == sqr)
	             {
	               continue;
	             }
	             sum = sqr/parts + sqr % parts;
	             
	    }
	    if (sum == sqr)
	             {
	               System.out.print("Kaprekar Number");
	             }
	 				else
	                {
	                  System.out.print("Not a Kaprekar Number");
	                }   
	  }

}
