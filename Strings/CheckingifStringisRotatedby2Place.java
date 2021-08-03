package Strings;

public class CheckingifStringisRotatedby2Place {
	public static boolean isRotated(String str1, String str2)
    {
		if(str1.length() <= 2 || str2.length() <= 2)
            if(str1.equals(str2)) return true;
            else return false;
            
        if(str1.length() != str2.length()) return false; 
        String s=str1.substring(0,2);
        String t=str1.substring(2);
        String p=str1.substring(0,str1.length()-2);
        String q=str1.substring(str1.length()-2,str1.length());
       
        
        String a=t.concat(s);
        String b=q+p;
       
        return (a.equals(str2)||b.equals(str2));
        
    }
	 public static boolean isRotated2(String str1, String str2)
	    {
	        
	        if(str1.length() <= 2 || str2.length() <= 2)
	            if(str1.equals(str2)) return true;
	            else return false;
	            
	        if(str1.length() != str2.length()) return false;    
	        
	        int bt = 0;
		    char temp,temp1;
		    int flag = 0;
		    char c1[] = str1.toCharArray();
		    char c2[] = str2.toCharArray();
	        char ck[] = new char[c1.length];
	        char ak[] = new char[c1.length]; 
		    
		    //storing anti-clockwise rotation of string by concatenating 
	        //substring of size two from end to the starting of the string.
	        for(int a=0; a<c1.length-2; a++){
	            ck[a] = c1[a+2];
	        }
	        ck[c1.length-2] = c1[0];
		    ck[c1.length-1] = c1[1];
		    
		    //storing clockwise rotation of string by concatenating substring
	        //of size two from beginning to the end of the string.
		    for(int a=2; a<c1.length; a++){
	            ak[a] = c1[a-2];
	        }
	        ak[0] = c1[c1.length-2];
		    ak[1] = c1[c1.length-1];
	        
	        //checking if any of them is equal to string, we return true.
	        for(int a=0; a<c1.length; a++){
	            if(ck[a]!=c2[a]&&ak[a]!=c2[a]){
	                flag = 1;
	                break;
	            }
	        }
	        if(flag == 0){
	            bt = 1;
	            
	        }
	        flag = 0;
	        
	        if(bt == 1)
	            return true;
	        else
	            return false;
	        
	    }
	public static void main(String args[])
	{
		
		System.out.println(isRotated("amazon", "azonam"));
	}
	

}
