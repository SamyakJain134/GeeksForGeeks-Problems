package PractiseQuestions;

import java.util.HashMap;

public class Fraction2RecurringDecimal {
	//Given a fraction. Convert it into a decimal. 
	//If the fractional part is repeating, 
	//enclose the repeating part in parentheses.
	 public static String  fractionToDecimal(int numerator, int denominator)
	    { 
		   StringBuilder answer= new StringBuilder(); 
		 //String answer="";
		    int quotient=numerator/denominator;
	         int remainder=numerator % denominator;
	         answer.append(quotient);
	         
	         
	         if(remainder==0)
	         {
	        	 return answer.toString();
	         }
	         else
	         {
	        	 answer.append(".");
	        	 HashMap<Integer, Integer> map =new HashMap<>();
	        	 
	        	 while(remainder != 0)
		         {
	        		 if(map.containsKey(remainder))
	        		 {
	        			 int pos=map.get(remainder);
	        			 answer.insert(pos, "(");
	        			 answer.append(")");
	        			 break;
	        		 }
	        		 else
	        		 {
	        			 map.put(remainder, answer.length());
	        			 remainder=remainder*10;
			        	  quotient=remainder/denominator;
				          remainder=remainder % denominator;
				          answer.append(quotient);
	        		 }
		           }	
	         }
	                 
	         return answer.toString();
	    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(fractionToDecimal(47,18));
	}

}
