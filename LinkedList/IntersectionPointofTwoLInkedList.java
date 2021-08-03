package LinkedList;

import java.util.HashSet;

public class IntersectionPointofTwoLInkedList {
	//Using Hashset
	public static int interSectionPoint(Node head1, Node head2)
	{
		HashSet<Node> set=new HashSet<>();
		Node curr=head1;
		while(curr!=null)
		{
			set.add(curr);
			curr=curr.next;
		}
		Node curr2=head2;
		while(curr2!=null)
		{
			if(set.contains(curr2))
			{
				return curr2.data;
			}
			curr2=curr2.next;
		}
		return -1;
	}

}
