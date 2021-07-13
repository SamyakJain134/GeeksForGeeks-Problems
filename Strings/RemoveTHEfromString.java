package Strings;

import java.util.Scanner;

public class RemoveTHEfromString {
	 public static void main(String args[])
	  {
	    Scanner s=new Scanner(System.in);
	    String str=s.nextLine();
	    for(int i=0;i<str.length();i++)
	    {
	     if(i<str.length() && (str.charAt(i)=='T'||str.charAt(i)=='t') &&str.charAt(i+1)=='h'&&str.charAt(i+2)=='e') 
	     {
	       str=str.substring(0,i-1)+str.substring(i+3);
	     }       
	    }
	    System.out.println(str);
	  }

}
