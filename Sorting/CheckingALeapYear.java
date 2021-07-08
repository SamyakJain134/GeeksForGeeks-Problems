package Sorting;

import java.util.Scanner;

public class CheckingALeapYear {
	public static void main(String args[])
	  {
	    Scanner s=new Scanner(System.in);
	    int x1=s.nextInt();
      if(x1%4==0)
      {
        if(x1%100==0)
        {
          if(x1%400==0)
          {
            System.out.print("Vicky can celebrate his birthday.");
          }
          else
          {
			System.out.print("Vicky can't celebrate.");
          }
        }
        else
        {
          System.out.print("Vicky can celebrate his birthday.");
        }
      }
      else
      {
        System.out.print("Vicky can't celebrate.");
      }
	    
	  }
	
			
	  public static void maxRun()
	  {
		  Scanner s=new Scanner(System.in);
		  int totalball=s.nextInt();
		  int totalrun=s.nextInt();
		  int runscored=s.nextInt();
		  int ballscored=s.nextInt();
		  float over =totalball/6;
		  int valueofCurrBall=ballscored/6;
		  float pointervalue=(float) ((ballscored%6)*0.1);
		  float currOverDelivered= pointervalue+valueofCurrBall;
		  float currrunrate=runscored/currOverDelivered;
		  
	  }
}
