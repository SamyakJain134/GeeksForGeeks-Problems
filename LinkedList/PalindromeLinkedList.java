package LinkedList;

import java.util.Stack;

class NodeChar{
	char data;
	NodeChar next;
	NodeChar(char data)
	{
		this.data=data;
		next=null;
	}
}
public class PalindromeLinkedList {
	public static boolean isPalindrome (NodeChar head)
	{
		Stack<Character> stack= new Stack<>();
		for(NodeChar curr=head;curr!=null;curr=curr.next)
		{
			stack.push(curr.data);
		}
		for(NodeChar curr=head;curr!=null;curr=curr.next)
		{
			if(curr.data!=stack.pop())
			{
				return false;
			}
		}
		return true;
	}
	//Efficient Approach 
	public static boolean isPalindromeEfficient(NodeChar head)
	{
		//find the middle of linked list 
		//Reverse the linked list after moiddle elementr 
		//compare every element after the linked list with head, if not equal return false
		
		if(head==null)
		{
			return true;
		}
		NodeChar slow=head;
		NodeChar fast=head;
		while(fast.next!=null && fast.next.next!=null)
		{
			slow=slow.next;
			fast=fast.next.next;
		}
		//Slow will point to middle opf linked list
		NodeChar Reverse=reverseLinkedList(slow.next);
		NodeChar curr=head;
		while(Reverse!=null)
		{
			if(curr.data!=Reverse.data)
			{
				return false;
			}
			curr=curr.next;
			Reverse=Reverse.next;
		}
		return true;
		
		
	}
	private static NodeChar reverseLinkedList(NodeChar head) {
		if(head==null &&  head.next ==null)
		{
			return head;
		}
		NodeChar curr=head;
		NodeChar prev=null;
		while(curr!=null)
		{
			NodeChar next=curr.next;
			curr.next=prev;
			prev=curr;
			curr=next;
		}
		return prev;
	}
	public static void main(String[] args) {
		 NodeChar head=new NodeChar('g');
	    	head.next=new NodeChar('f');
	    	head.next.next=new NodeChar('g');
	    	if(isPalindromeEfficient(head))
	    	    System.out.print("Yes");
	    	else
	    	    System.out.print("No");
	}
}
