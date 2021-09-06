package Strings;

import java.util.Stack;

public class BackSpaceCharacterQuestion {
	public static boolean backsapce(String S,String s2)
	{

	    Stack<Character> q = new Stack<Character>();
	 
	    for (int i = 0; i<S.length();++i)
	    {
	        if (S.charAt(i) != '#')
	            q.push(S.charAt(i));
	        else if (!q.isEmpty())
	            q.pop();
	    }
	 
	    // build final string
	    String ans = "";
	 
	    while (!q.isEmpty())
	    {
	        ans += q.pop();
	    }
	 System.out.println(ans);
	 Stack<Character> c=new Stack<Character>();
	 for(int i=0;i<s2.length();i++)
	 {
		 if(s2.charAt(i)!='#')
		 {
			 c.push(s2.charAt(i));
		 }
		 else if(!c.isEmpty())
		 {
			 c.pop();
		 }
	 }
	 String ans2="";
	 while(!c.isEmpty())
	 {
		 ans2=ans2+c.pop();
	 }
	    // return final string
	    String answer = "";
	    for(int j = ans.length() - 1; j >= 0; j--)
	    {
	        answer += ans.charAt(j);
	    }
	    System.out.println(answer);
	    return ans.equals(ans2);
	}
	public static void main(String[] args) {
		 String S = "##geeks##for##geeks#";
		 
		    // function call to print
		    // required answer
		  System.out.println( backsapce("geee#e#ks","gee##eeks"));
	}
}
