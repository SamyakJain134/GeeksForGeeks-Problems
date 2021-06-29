package Sorting;

import java.util.Arrays;
import java.util.Comparator;

class Pair 
{
	int x;
	int y;
	Pair(int x , int y)
	{
		this.x=x;
		this.y=y;
	}

}
public class SortbyAbsoulteDifference 
{
	public static void sortABS(int arr[], int n, int k)
	{
		Pair p[]= new Pair[n];
		for(int i=0;i<n;i++)
		{
			p[i]=new Pair(Math.abs(arr[i]-k),arr[i]);
		}
		 //Comparator to sort array accoding to the difference with k.
        Arrays.sort(p, new Comparator<Pair>() {
            @Override public int compare(Pair p1, Pair p2)
            { 
                //returning p1 if difference with k
                //is greater than the difference of p2 with k.
                return p1.x - p2.x;
            }
        });
        
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < n; i++)
            sb.append(p[i].y + " ");
        System.out.print(sb);
		
	}
}
