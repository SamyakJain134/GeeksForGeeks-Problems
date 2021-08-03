package LinkedList;

import java.util.Scanner;

public class ReversingALL {
	public static Node reverseLL(Node head)
	{
		if(head==null || head.next==null)
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
		Node head2=reverseLL(head);
		print(head2);
				
	}

}
