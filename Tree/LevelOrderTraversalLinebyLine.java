package Tree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class LevelOrderTraversalLinebyLine {
	public static void printLevelOrderTraversal(Node root)
	{
		if(root==null)
		{
			return;
		}
		Queue<Node> q=new LinkedList<>();
		q.add(root);
		q.add(null);
		while(q.size()>1)
		{
			Node curr=q.poll();
			if(curr==null)//reached end of current level
			{
				System.out.println();
				q.add(null);
				continue;
			}
			System.out.println(curr.data+" ");
			if(curr.left!=null)
			{
				q.add(curr.left);
			}
			if(curr.right!=null)
			{
				q.add(curr.right);
			}
		}
		
	}
	public static ArrayList<ArrayList<Integer>> levelOrder(Node node) 
	    {
	      //creating an empty queue for level order traversal.
		  Queue<Node> q = new LinkedList<>();
		  q.add(node);
		  ArrayList<ArrayList<Integer>> result = new ArrayList<ArrayList<Integer>>();
		  
		  while(true)
		  {
		      int size = q.size();
		      if(size == 0)
		         break;
		       
		       //creating a list to store the nodes at a particular level.
		       ArrayList<Integer> level = new ArrayList<Integer>();
		       
		       while(size >0)
		       {
		           //storing front element of queue in list and 
		           //removing it from queue.
		           node = q.peek();
		           q.poll();
		           level.add(node.data);
		           
		           //storing the left child of the parent node in queue.
		           if(node.left != null)
		            q.add(node.left);
		            
		           //storing the right child of the parent node in queue.
		           if(node.right != null)
		            q.add(node.right);
		            size--;
		       }
		       //adding the level list in answer.
		       result.add(level);
		  }
		  //returning the final list.
		  return result;

	  }
}
