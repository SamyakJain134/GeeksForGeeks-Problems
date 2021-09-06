package Tree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class LeftViewOfBinaryTree {
	private static void printLeftView(Node root)
    {
        if (root == null)
            return;
 
        Queue<Node> queue = new LinkedList<>();
        queue.add(root);
 
        while (queue.isEmpty()==false) {
            // number of nodes at current level
            int n = queue.size();
 
            // Traverse all nodes of current level
            for (int i = 1; i <= n; i++) {
                Node temp = queue.poll();
 
                // Print the left most element at
                // the level
                if (i == 1)
                    System.out.print(temp.data + " ");
 
                // Add left node to queue
                if (temp.left != null)
                    queue.add(temp.left);
 
                // Add right node to queue
                if (temp.right != null)
                    queue.add(temp.right);
            }
        }
    }
	ArrayList<Integer> leftView2(Node root)
    {
      ArrayList<Integer> arr=new ArrayList<Integer>();
      Queue<Node> q=new LinkedList<>();
      q.add(root);
      while(q.isEmpty()==false)
      {
          int size=q.size();
          for(int i=1;i<=size;i++)
          {
              Node curr=q.poll();
              if(i==1)
              {
                  arr.add(curr.data);
              }
               if(curr.left!=null)
    			   	q.add(curr.left);
			   
			   if(curr.right!=null)
				   q.add(curr.right); 
          }
      }
      return arr;
    }
	 //////////////////////////////////////////////////////////////////
	///////////////////////////////////////////////////////////////////
	////////////////////////////////////////////////////////////////////
	    ArrayList<Integer> leftView(Node root)
	    {
	      ArrayList<Integer> arr=new ArrayList<Integer>();
	       leftViewHelper(arr,root,1);
	       return arr;
	    }
	    int maxlevel=0;
		void leftViewHelper(ArrayList<Integer> arr, Node root, int level) 
		{
			if(root==null)
			{
				return;
			}
			if(maxlevel<level)
			{
				arr.add(root.data);
				maxlevel=level;
			}
			leftViewHelper(arr, root.left, level+1);
			leftViewHelper(arr, root.right, level+1);
		}
		////////////////////////////////////////////////////////////////
		//////////////////////////////////////////////////////////////////
}
class Tree
{
    int max_level = 0;
    
    //Function to get the left view of the binary tree.
    void leftViewUtil(ArrayList<Integer> result, Node node, int level)
    {
        //if root is null, we simply return.
        if (node==null) return;
        
        //if this is the first node of its level then it is in the left view.
        if (max_level < level)
        {
            //storing data of current node in list.
            result.add(node.data);
            max_level = level;
        }
        
        //calling function recursively for left and right 
        //subtrees of current node.
        leftViewUtil(result, node.left, level+1);
        leftViewUtil(result, node.right, level+1);
    }
    
    //Function to return list containing elements of left view of binary tree.
    ArrayList<Integer> leftView(Node root)
    {
        ArrayList<Integer> result = new ArrayList<Integer>();
		leftViewUtil(result, root, 1);
		//returning the list.
		return result;
    }
}
