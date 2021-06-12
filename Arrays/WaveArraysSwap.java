package Arrays;

public class WaveArraysSwap {
//Given a sorted array arr[] of distinct integers. 
//	Sort the array into a wave-like array and return it. 
//	In other words, arrange the elements into a sequence such 
//that a1 >= a2 <= a3 >= a4 <= a5..... 
//	(considering the increasing lexicographical order).
public static void convertToWave(int arr[], int n){
        
	 for(int i=0;i<n-1;i=i+2)
     {
     	int temp=arr[i];
     	arr[i]=arr[i+1];
     	arr[i+1]=temp;
     			
     }
     
    } 
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
