package LinkedList;

public class PairWiseSwapNode {
	public static void SwapPairwise(Node head)
	{
		Node curr=head;
		while(curr!=null && curr.next!=null)
		{
			int temp=curr.data;
			curr.data=curr.next.data;
			curr.next.data=temp;
			curr=curr.next.next;
		}
	}
	//By switching only with pointers
	public static Node swapbyPointer(Node head)
	{
		if(head==null || head.next==null)
		{
			return head;
		}
		//swapping the first two nodes
		Node curr=head.next.next; 
		Node prev=head;
		head=head.next;
		head.next=prev;
		while(curr!=null && curr.next!=null)
		{
			prev.next=curr.next; //curr ke agla wala iska next ho gya prev ka 
			prev=curr; //same jagah point karega prev 
			Node next=curr.next.next; //hold of linked list 
			curr.next.next=curr; // reverse the link in between curr.next uske phle wale ko point karega 
			curr=next; 
		}
		prev.next=null;
		return head;
	}

}
