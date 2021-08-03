package LinkedList;

import java.util.HashSet;

public class DetectaLoopinLinkedList {
	public static boolean detectloopinaLinkedList(Node head)
	{
		Node temp=new Node(0);
		Node curr=head;
		while(curr!=null)
		{
			if(curr.next==null)
			{
				return false;
			}
			else if(curr.next==temp)
			{
				return true;
			}
			Node currNext=curr.next;
			curr.next=temp;
			curr=curr.next;
		}
		return false;
	}
	//Using hashSet	
	public static boolean detectLoopUsingHashset(Node Head)
	{
		HashSet<Node> set=new HashSet<>();
		Node curr=Head;
		while(curr!=null)
		{
			if(set.contains(curr))
			{
				return true;
			}
			set.add(curr);
			curr=curr.next;
		}
		return false;
	}
	//Detect loop using floyd cycle detection
	public static boolean detectusingFastandSlowPointer(Node head)
	{
		Node slowPointer=head;
		Node fastPointer=head;
		while(fastPointer!=null && fastPointer.next!=null)
		{
			slowPointer=slowPointer.next;
			fastPointer=fastPointer.next.next;
			if(slowPointer==fastPointer)
			{
				return true;
			}
		}
		return false;
	}

}
