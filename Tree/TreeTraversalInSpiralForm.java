package Tree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class TreeTraversalInSpiralForm {
	public static void findSpiral2(Node root) 
    {
       if(root==null)
       {
    	   return;
       }
       Queue<Node> q=new LinkedList<>();
       Stack<Integer> s=new Stack<>();
       boolean reverse=false; //initially false hi hoga 
       q.add(root);  
       while(q.isEmpty()==false)
       {
    	   int count=q.size();
    	   for(int i=0;i<count;i++)
    	   {
    		   Node curr=q.poll();
    		   if(reverse)
    		   {
    			   s.add(curr.data);
    		   }
    		   else
    		   {
    			   System.out.print(curr.data);
    		   }
    		   if(curr.left!=null)
    			   	q.add(curr.left);
			   
			   if(curr.right!=null)
				   q.add(curr.right); 
    	   }
    		   if(reverse)
    		   {
    			   while(s.isEmpty()==false)
    			   {
    				   System.out.print(s.pop());
    			   }
    		   }
    		   reverse=!reverse;
    		   //System.out.println();
       }
     }
	public static void main(String args[]) 
    { 
        Node root=new Node(1);
    	root.left=new Node(2);
    	root.right=new Node(3);
    	root.left.left=new Node(4);
    	root.left.right=new Node(5);
    	root.right.left=new Node(6);
    	root.right.right=new Node(7);
    	
    	findSpiral2(root);
    	 
    }  
	public static ArrayList<Integer> findSpiral(Node root) 
    {
	
      ArrayList<Integer> result=new ArrayList<>();
  		if(root==null)
  		{
  		return result;
  		}
  		int h=height(root);
  		int i;
      	boolean reverse=false;
      	for( i=1;i<=h;i++)
      	{
      		printTree(result,root,i,reverse);
      		reverse=!reverse;
      	}
      	return result;
    }
	public static void printTree(ArrayList<Integer> result, Node root, int level, boolean reverse) 
	{
		if(root==null)
		{
			return;
		}
		if(level==1)
		{
			result.add(root.data);
		}
		else if(level>1)
		{
			if(reverse!=false)
			{
				printTree(result, root.left, level-1, reverse);
				printTree(result, root.right, level-1, reverse);
			}
			else
			{
				printTree(result, root.right, level-1, reverse);
				printTree(result, root.left, level-1, reverse);
			}
		}
	}
	private static int height(Node root) {
		if(root==null)
		{
			return 0;
		}
		int left=1+height(root.left);
		int right=1+height(root.right);
		if(left>right)
		{
			return left;
		}
		else
		{
			return right;
		}
		
	} 

}
