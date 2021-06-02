import java.util.Iterator;
import java.util.PriorityQueue;
import java.util.Scanner;

public class NearlySortedAlgorithm {
	public static void main (String[] args) {
		Scanner c =new Scanner(System.in);
		int n=c.nextInt();
		int k=c.nextInt(); 
		int arr[]=new int[n];
        for(int i=0;i<n;i++)
        {
            
            arr[i]=c.nextInt();
        }
        kSort(arr, n, k);
        System.out.println("Following is sorted array");
        printArray(arr, n);
	}
	private static void kSort(int[] arr, int n, int k)
    {
 
        // min heap
        PriorityQueue<Integer> priorityQueue
            = new PriorityQueue<>();
 
        // add first k + 1 items to the min heap
        for (int i = 0; i < k + 1; i++) {
            priorityQueue.add(arr[i]);
        }
 
        int index = 0;
        for (int i = k + 1; i < n; i++) {
            arr[index++] = priorityQueue.peek();
            priorityQueue.poll();
            priorityQueue.add(arr[i]);
        }
 
        Iterator<Integer> itr = priorityQueue.iterator();
 
        while (itr.hasNext()) {
            arr[index++] = priorityQueue.peek();
            priorityQueue.poll();
        }
    }
     private static void printArray(int[] arr, int n)
    {
        for (int i = 0; i < n; i++)
            System.out.print(arr[i] + " ");
    }
}
