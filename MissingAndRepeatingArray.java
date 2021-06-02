package PractiseQuestions;

import java.util.HashMap;

public class MissingAndRepeatingArray {
	public static int[] findTwoElement(int arr[], int n) {
        int [] finalArray=new int[2];
       HashMap<Integer, Boolean> hmap=new HashMap<>();
       for(int i=0;i<arr.length;i++)
       {
    	  if(hmap.get(i)==null) 
    	  {
    		  hmap.put(i, true);
    	  }
    	  else
    	  {
    		  finalArray[1]=arr[i];
    	  }
       }
       int max=n;
       for (int i = 1; i <= max; i++) {
           if (hmap.get(i) == null) {
               finalArray[0]=i;
           }
       }
       return finalArray;
}

	public static void main(String[] args) {
		int ary[]= {2,2};
		int ary2[]=findTwoElement(ary, ary.length);
		for(Integer i : ary2)
		{
			System.out.println(i);
		}

	}

}
