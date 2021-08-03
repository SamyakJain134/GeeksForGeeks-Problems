package Strings;

public class SumOfNumbersinString {
	 public static long findSum(String str)
	    {
	        int sum=0;
	        int num=0;
	        for(int i=0;i<str.length();i++)
	        {
	            if(str.charAt(i)>='0' && str.charAt(i) <='9')
	            {
	            	//System.out.println(str.charAt(i)+"    "+(str.charAt(i)-0));
	                num=num*10+(int)(str.charAt(i)-'0');
	            }
	            else
	            {
	                sum=sum+num;
	                num=0; 
	                
	            }
	        }
	        return sum+num;
	    }
	    
	 public static void main (String args[])
	 {
	 	String s="Hi1Samyak23asan67";
	 	long n=findSum(s);
	 	System.out.println(n);
	 	
	 	
	 }
}
