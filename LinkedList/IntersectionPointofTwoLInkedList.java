package LinkedList;

import java.util.HashSet;
import java.util.Scanner;

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
	//Method 2 using Size of both linked List
	public static int IntersectionPointmethod2(Node head1, Node head2)
	{
		if(head1==null||head2==null)
		{
			return -1;
		}
		int size1=0;
		int size2=0;
		for(Node curr=head1;curr!=null;curr=curr.next)
		{
			size1++;
		}
		for(Node curr=head2;curr!=null;curr=curr.next)
		{
			size2++;
		}
		if(size1>size2)
		{
			//System.out.println(size1);
			Node curr=head1;
			for(int i=0;i<Math.abs(size1-size2);i++)
			{
				curr=curr.next;
			}
			//System.out.println(curr.data);
			while(curr.next!=null && head2.next!=null)
			{
				//System.out.println(curr.data);
				curr=curr.next;
				head2=head2.next;
				if(curr.data==head2.data)
				{
					return curr.data;
				}
			}
		}
		else
		{
			//System.out.println(size2);
			Node curr=head2;
			for(int i=0;i<Math.abs(size1-size2);i++)
			{
				curr=curr.next;
			}
			//System.out.println(curr.data);
			while(curr.next!=null && head1.next!=null)
			{
				curr=curr.next;
				head1=head1.next;
				if(curr==head1)
				{
					return curr.data;
				}
			}
		}
		return -1;
	}
	public static Node takeInput()
	{
		Node head=null;
		Scanner s=new Scanner(System.in);
		int data=s.nextInt();
		while(data != -1)
		{
			Node newNode=new Node(data);
			if(head==null)//first node 
			{
				head=newNode; 
			}
			else
			{
				Node temp= head;
				while(temp.next!=null)
				{
					temp=temp.next;
					//jese hi last node par pahuch gai
				}
				//yahan par new node latest wali ka address daal denge
				temp.next=newNode;
				
			}
			data=s.nextInt();
		}
		return head;
	}
	public static void print(Node head)
	{
		while(head!=null)
		{
			System.out.print(head.data+"  ");
			head=head.next;
		}
		System.out.println();
	}
	public static void main(String[] args) {
		Node head=takeInput();
		Node head2=takeInput();
		System.out.println(IntersectionPointmethod2(head, head2));
	}

}
