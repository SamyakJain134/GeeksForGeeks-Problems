import java.util.Scanner;



public class RotateaLinkedListbyKNodeskTimes {
	public static Node<Integer> rotate(Node<Integer> head, int k)	
    {
		if(k==0)
		{
			//we dont need to rotate
			return head;
		}
        if(head==null)
        {
        	return null;
        }
        Node<Integer> curr=head;
        int count =1;
        while(count<k && curr!=null)
        {
        	curr=curr.next; //it will reach to kTh node by now 
        	count++;
        }
        if(curr==null)
        {
        	return head;
        }
        //agar curr==null ho jata hai that mean k zyada hai number of nodes k ya barabar hai
        Node<Integer> kThNode=curr; // isme kth node hoga 
        while(curr.next!=null) // end tak traverse karne ke liye 
        {
        	curr=curr.next;
   //Here curr will point to last node of linked list 
        }
        curr.next=head; // last node ke next me head dal denge 
        head=kThNode.next; // head shuru karege kth node k agli node se 
        kThNode.next=null; //kth node ki algi node null kar denge kyuki ll yaha khatm hogi
        return head;
    }
	public static Node<Integer> takeInput()
	{
		Node<Integer> head=null;
		Scanner s=new Scanner(System.in);
		int data=s.nextInt();
		while(data != -1)
		{
			Node<Integer> newNode=new Node<Integer>(data);
			if(head==null)
			{
				head=newNode;
			}
			else
			{
				Node<Integer> temp= head;
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
	public static void print(Node<Integer> head)
	{
		while(head!=null)
		{
			System.out.print(head.data+"  ");
			head=head.next;
		}
		System.out.println();
	}
	public static void main(String[] args) {
		Node<Integer> head=takeInput();
		Node<Integer> head2=rotate(head, 3);
		print(head2);

	}

}
