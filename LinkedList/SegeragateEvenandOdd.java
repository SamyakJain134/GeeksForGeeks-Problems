package LinkedList;

public class SegeragateEvenandOdd {
	//Relative rder must be maintained 
	//Even numbers first and then odd
	public static Node segerateEvenandOdd(Node head)
	{
		Node evenStart=null;
		Node evenEnd=null;
		Node oddStart=null;
		Node oddEnd=null;
		for(Node curr=head;curr!=null;curr=curr.next)
		{
			int x=curr.data;
			if(x % 2==0)
			{
				if(evenStart==null)
				{
					evenStart=curr;
					evenEnd=evenStart;
				}
				else
				{
					evenEnd.next=curr;
					evenEnd=evenEnd.next;
				}
			}
			else
			{
				if(oddStart==null)
				{
					oddStart=curr;
					oddEnd=oddStart;
				}
				else
				{
					oddEnd.next=curr;
					oddEnd=oddEnd.next;
				}
			}
		}
		if(oddStart ==null || evenStart==null)
		{
			return head;
		}
		evenEnd.next=oddStart;
		oddEnd.next=null;
		return evenStart;
	}
}
