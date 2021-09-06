package LinkedList;

import java.util.Scanner;

public class FindKthElementfromLastofLinkedList {
	public static void findKthElement(Node head , int k)
	{
		if(head==null)
		{
			return ;
		}
		int length=0;
		Node curr=head;
		while(curr!=null)
		{
			length++;
			curr=curr.next;
		}
		Node curr2=head;
		for(int i=0;i<length-k;i++)
		{
			curr2=curr2.next;
		}
		System.out.println(curr2.data);
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
		findKthElement(head, 3);
	}

}
