package LinkedList;

public class MergeTwoSortedLL {
	public static Node sortedMerge(Node head1, Node head2) {
	     if(head1==null)
	     {
	         return head2;
	     }
	     if(head2==null)
	     {
	    	 return head1;
	     }
	     Node newHead=null;
	     Node newTail=null;
	     if(head1.data > head2.data)
	     {
	    	 newHead=head2;
	    	 newTail=head2;
	    	 head2=head2.next;
	     }
	     else
	     {
	    	 newHead=head1;
	    	 newTail=head1;
	    	 head1=head1.next;
	     }
	     while(head1!=null && head2!=null)
	     {
	    	 if(head1.data > head2.data)
	    	 {
	    		 newTail.next=head2;
	    		 newTail=newTail.next; //aage badhana hai new Tail ko 
	    		 head2=head2.next; //head2 ko aage badhane ke liye 
	    	 }
	    	 else
	    	 {
	    		 newTail.next=head1;
	    		 newTail=newTail.next;
	    		 head1=head1.next;
	    	 }
	     }
	     if(head1!=null)
	     {
	    	 newTail.next=head1;
	    	// newTail=newTail.next;
	     }
	     if(head2!=null)
	     {
	    	 newTail.next=head2;
	    	// newTail=newTail.next;
	     }
	     return newHead;
	}
	//Easy Method
	public static Node sortedMerge2(Node head1, Node head2) {
		Node one=head1;
		Node two=head2;
		return two;
	}
	}
