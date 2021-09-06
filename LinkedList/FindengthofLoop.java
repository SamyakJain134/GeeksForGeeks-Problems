package LinkedList;

public class FindengthofLoop {
	 static int countNodesinLoop(Node head)
	    {
	        Node slowPointer=head;
			Node fastPointer=head;
			while(fastPointer!=null && fastPointer.next!=null)
			{
				slowPointer=slowPointer.next;
				fastPointer=fastPointer.next.next;
				
				if(slowPointer==fastPointer)
				{
				    int count=1;
				    Node newNode=slowPointer;
				    while(newNode.next!=slowPointer)
				    {
				        newNode=newNode.next;
				        count++;
				    }
				    return count;
				}
			}
			return 0;
	    }
}
