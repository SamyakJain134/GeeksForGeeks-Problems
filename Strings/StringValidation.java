package Strings;

public class StringValidation {
	public static boolean validate(String str)
    {
          //Your code here
            boolean flag1=false ;
             boolean flag2=false ; 
              boolean flag3=false ;
               boolean flag4=false ;
                  boolean flag5=false ;
            
   int l = str.length();
   if(l>=10)
   {
       flag1=true;
   }
   for(int i =0;i<l;i++)
   {
       if(str.charAt(i)>='a' && str.charAt(i)<='z')
       {
           flag2=true;
       }
        if(str.charAt(i)>='A' && str.charAt(i)<='Z')
       {
           flag3=true;
       }
        if(str.charAt(i)=='@' || str.charAt(i)=='#' || str.charAt(i)=='$' || str.charAt(i)=='-' || str.charAt(i)=='*' )
       {
           flag4=true;
       }
        if(str.charAt(i)>='0' && str.charAt(i)<='9')
       {
           flag5=true;
       }
     
   }
      return(flag1 && flag2 && flag3 && flag4 && flag5);
}
}
