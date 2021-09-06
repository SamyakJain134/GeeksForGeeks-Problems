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
	public static void removeLoop(Node head){
	       Node slow=head;
	       Node fast=head;
	       while(fast!=null && fast.next!=null)
	       {
	           slow=slow.next;
	           fast=fast.next.next;
	           if(slow==fast)
	           {
	               int count=1;
	               Node newNode=slow;
	               while(newNode.next!=slow)
	               {
	                   newNode=newNode.next;
	                   count++;
	               }
	               Node one=head;
	               Node two=head;
	               for(int i=0;i<count;i++)
	               {
	                   two=two.next;
	               }
	               while(two.next!=slow)
	               {
	                   two=two.next;
	                   slow=slow.next;
	               }
	               two.next=null;
	           }
	       }

	}
	public static void removeLoop2(Node head){
	       Node slow=head;
	       Node fast=head;
	       while(fast!=null && fast.next!=null)
	       {
	           slow=slow.next;
	           fast=fast.next.next;
	           if(slow==fast)
	           {
	        	   int size = 1;
	               fast = fast.next;
	               //we start iterating the loop with first pointer and continue till 
	               //both pointers point to same node again.
	               while( fast!=slow )
	               {
	                   fast = fast.next;
	                   //incrementing the counter which stores length of loop..
	                   size+=1;
	               }
	               
	               //updating the pointers again to starting node.
	               slow = head;
	               fast = head;
	               
	               //moving pointer (fast) by (size-1) nodes.
	               for(int i=0; i<size-1; i++)
	                   fast = fast.next;
	               
	               //now we keep iterating with both pointers till fast reaches a node such
	               //that the next node is pointed by slow. At this situation slow is at
	               //the node where loop starts and first at last node so we simply 
	               //update the link part of first.
	               while( fast.next != slow )
	               {
	                   fast = fast.next;
	                   slow = slow.next;
	               }
	               //storing null in link part of the last node.
	               fast.next = null;
	           }
	       }

	}
}
