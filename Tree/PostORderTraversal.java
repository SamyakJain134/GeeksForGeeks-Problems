package Tree;

public class PostORderTraversal {
	// Print postorder traversal of given tree.
	void printPostorderTraversal(Node root) 
	{ 
	  if (root == null) 
	      return; 

	  //first traverse to the left subtree
	  printPostorderTraversal(root.left);                    

	  //then traverse to the right subtree
	  printPostorderTraversal(root.right); 

	  //then print the data of node
	  System.out.print(root.data + " "); 

	}
}
