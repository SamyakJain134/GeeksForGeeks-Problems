package Arrays;

import java.util.ArrayList;

public class MaximumandSecondMax {
	public static ArrayList<Integer> largestAndSecondLargest(int sizeOfArray, int arr[])
    {
        int max1=Integer.MIN_VALUE;
        int max2=Integer.MIN_VALUE;
        for(int i=0;i<sizeOfArray;i++)
        {
            if(arr[i]>max1)
            {
                max2=max1; //purani vali max1 ki value max2 me dal denge
                max1=arr[i]; //max value dal denge 
            }
            else if(arr[i]>max2 && arr[i]!=max1)
            {
                max2=arr[i]; //second max 
            }
        }
        if(max2==Integer.MIN_VALUE)
        {
            max2=-1;
        }
        ArrayList<Integer> ary=new ArrayList<>();
        ary.add(max1);
        ary.add(max2);
        return ary;
    }
}
