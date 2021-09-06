package LinkedList;

import java.util.HashSet;

public class RemoveDuplicatesfromUnsortedLinkedList {
	 public Node removeDuplicates(Node head) 
	    {
	        HashSet<Integer> set=new HashSet<>();
	         Node curr=head;
	         Node prev=null;
	         while(curr!=null)
	         {
	            if(set.contains(curr.data))
	            {
	            	prev.next=curr.next;
	            }
	            else
	            {
	            	set.add(curr.data);
	            	
	                prev=curr;
	            }
	            curr=curr.next;
	         }
	         
	        return head;
	    }
}
