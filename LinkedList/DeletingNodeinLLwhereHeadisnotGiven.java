package LinkedList;

public class DeletingNodeinLLwhereHeadisnotGiven {
//head is not given 
	//delete a note in ll
	
	public static void main(String[] args) {
		Node head=new Node(0);
		head.data=head.next.data;
		head.next=head.next.next;
		
	}
}
