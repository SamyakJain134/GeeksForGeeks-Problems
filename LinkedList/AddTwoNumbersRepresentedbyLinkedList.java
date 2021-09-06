package LinkedList;

public class AddTwoNumbersRepresentedbyLinkedList {
	public static Node reverseList(Node head)
    {
        if(head.next==null||head==null)
        {
            return head;
        }
        Node curr=head;
        Node prev=null;
        while(curr!=null)
        {
            Node next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;
        }
        head=prev;
        return head;
    }
    static Node addTwoLists(Node first, Node second){
        first=reverseList(first);
        second=reverseList(second);
        Node dummy=new Node(0); //head of ll
        Node temp=dummy;
        int carry=0;
        while(first != null || second!= null || carry==1)
        {
        	int sum=0;
        	if(first!=null)
        	{
        		sum=sum+first.data;
        		first=first.next;
        	}
        	if(second!=null)
        	{
        		sum=sum+second.data;
        		second=second.next;
        	}
        	sum=sum+carry;
        	carry=sum/10;
        	Node newNode=new Node(sum%10);
        	//carry=sum/10;
        	temp.next=newNode;
        	temp=temp.next;
        	
        }
        return reverseList(dummy.next);
    }
}
