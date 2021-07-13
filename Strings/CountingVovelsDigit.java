package Strings;

import java.util.Scanner;

public class CountingVovelsDigit {
	 public static void main(String args[])
	  {
	    Scanner s= new Scanner(System.in);
	    String str=s.nextLine();
	    int Vowels=0;
	    int Consonants=0;
	    int WhiteSpaces=0;
	    int Digits=0;
	    int Symbols=0;
	    
	    for(int i=0;i<str.length();i++)
	    {
	    	if(str.charAt(i)=='a'||str.charAt(i)=='e'||str.charAt(i)=='i'||str.charAt(i)=='o'||str.charAt(i)=='u'||str.charAt(i)=='A'||str.charAt(i)=='E'||str.charAt(i)=='I'||str.charAt(i)=='O'||str.charAt(i)=='U')
	    	{
	    		Vowels++;
	    	}
	    	else if(str.charAt(i)>='a' && str.charAt(i)<='z' || str.charAt(i)>='A' && str.charAt(i)<='Z' )
	    	{
	    		Consonants++;
	    	}
	    	else if(str.charAt(i)==' ')
	    	{
	    		WhiteSpaces++;
	    	}
	    	else if(str.charAt(i)>='0' && str.charAt(i)<='9')
	    	{
	    		Digits++;
	    	}
	    	else
	    	{
	    		Symbols++;
	    	}
	    }
	    System.out.println("Vowels:"+Vowels);
	    System.out.println("Consonants:"+Consonants);
	    System.out.println("White Spaces:"+WhiteSpaces);
	    System.out.println("Digits:"+Digits);
	    System.out.println("Symbols:"+Symbols);
	   
	  
	  }
}
