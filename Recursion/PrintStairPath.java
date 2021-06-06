package Recursion;

import java.util.Scanner;

public class PrintStairPath {
//N stair se zero ana hai 
	public static void printStairPath(int n, String path)
	{
		if(n<0)
		{
			return;
		}
		if(n==0)
		{
			System.out.println(path); // sahi rasta hai ye 
			return;
		}
		printStairPath(n-1 , path+ "1");
		printStairPath(n-2,  path+ "2");
		printStairPath(n-3,  path+ "3");
	}

	public static void main(String[] args) {
		Scanner s= new Scanner(System.in);
		System.out.println("Enter Number for stairs");
		int n=s.nextInt();
		printStairPath(n,"");

	}

}
