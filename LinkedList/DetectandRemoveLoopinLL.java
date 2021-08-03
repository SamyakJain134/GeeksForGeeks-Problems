package LinkedList;

public class DetectandRemoveLoopinLL {
	public static void removeloop(Node head)
	{
		Node slow=head;
		Node fast=head;
		while(fast!=null && fast.next!=null)
		{
			slow=slow.next;
			fast=fast.next.next;
			if(slow==fast)
			{
				break;
			}
		}
		if(slow!=fast)
		{
			return;
		}
		slow=head;
		while(slow.next!=fast.next)
		{
			slow=slow.next;
			fast=fast.next;
		}
		fast.next=null;
	}

}
