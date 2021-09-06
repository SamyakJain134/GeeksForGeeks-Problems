package LinkedList;

public class RotateLinkedListbyKNodesCoounterClockWise {
	public Node rotate(Node head, int k) {
        if(k==0)
		{
			//we dont need to rotate
			return head;
		}
        if(head==null)
        {
        	return null;
        }
        Node curr=head;
        Node prev=null;
        for(int i=1;i<k && curr!=null ;i++)
        {
            prev=curr;
            curr=curr.next;//it will reach to kTh node by now 
        }
        //agar curr==null ho jata hai that mean k zyada hai number of nodes k ya barabar hai
        Node kthNode=curr;
        while(curr.next!=null)
        {
            curr=curr.next;
        }
        curr.next=head;
        head=kthNode.next;
        kthNode.next=null;
        return head;
    }
}
