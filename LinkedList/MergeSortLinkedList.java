package LinkedList;

public class MergeSortLinkedList {
	 static Node mergeSort(Node head)
	    {
	        if(head==null||head.next==null)
	        {
	            return head;
	        }
	         //splitting the list into two halves
	        Node middle=getMiddle(head);
	        Node middleNext=middle.next;
	        middle.next=null;
	        //calling the mergeSort function recursively for both parts separately.
	        Node left=mergeSort(head);
	        Node right=mergeSort(middleNext); 
	        Node sortedList=Merge(left,right); //till now we have to merge both sorted list
	        return sortedList;
	    }
	    public static Node Merge(Node first,Node second)
	    {
	        Node ans=null;
	        if(first==null)
	        {
	            return second;
	        }
	        if(second==null)
	        {
	            return first;
	        }
	        if(first.data<=second.data)
	        {
	            ans=first;
	            ans.next=Merge(first.next,second);
	        }
	        else
	        {
	            ans=second;
	            ans.next=Merge(first,second.next);
	        }
	        return ans;
	    }
	    public static Node getMiddle(Node head)
	    {
	        if(head==null)
	        {
	            return head;
	        }
	        Node slow=head;
	        Node fast=head;
	        while(fast.next!=null && fast.next.next!=null)
	        {
	            slow=slow.next;
	            fast=fast.next.next;
	        }
	        return slow;
	    }
}
