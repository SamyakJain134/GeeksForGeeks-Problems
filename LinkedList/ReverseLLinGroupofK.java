package LinkedList;

import java.util.Scanner;

public class ReverseLLinGroupofK {
	public static Node reverinGroupRecursive(Node head,int k)
	{
		Node curr=head;
		Node prev=null;
		Node next=null;
		int count=0;
		while(curr.next!=null && count< k)
		{
			next=curr.next;
			curr.next=prev;
			prev=curr;
			curr=next;
			count++;
		}
		if(next!=null) //ae bhi hai
		{
			Node newHEad=reverinGroupRecursive(next, k);
			head.next=newHEad;
		}
		//Node restHEad=reverinGroup(prev.next, k);
		//restHEad.next=head;
		return prev;
	}
	///////////////////////////
/////////Iterative
	/////////////////
	
	public static Node reverseinGRoupIterative(Node head , int k)
	{
		Node curr=head;
		Node prevFirst=null;
		boolean isFirstPass=true;
		while(curr!=null)//curr pointing to main linked list
		{
			Node first=curr;
			Node prev=null;
			Node next=null;
			int count=0;
			while(curr!=null && count < k)
			{
				next=curr.next;
				curr.next=prev;
				prev=curr;
				curr=next;
				count++;
			} 
			if(isFirstPass) //After first pass the previos value of ll will be head always
			{
				head=prev;
				isFirstPass=false;
				//after setting isFirstfalse it never comes inside this loop .
				//head will remain same 
			}
			else //length of ll is bigger 
			{
				prevFirst.next=prev;
			}
			prevFirst=first;
		}
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
		Node head2= reverseinGRoupIterative(head,3);
		//if k is smaller then or equal to length of linked list then k will be new head of linked list 
		print(head2);
				
	}

}
