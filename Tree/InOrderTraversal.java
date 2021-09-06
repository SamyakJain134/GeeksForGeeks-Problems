package Tree;

public class InOrderTraversal {
	 // Print inorder traversal of given tree.
    void printInorderTraversal(Node root) 
    { 
        if (root == null) 
            return; 

        //first traverse to the left subtree
        printInorderTraversal(root.left); 

        //then print the data of node
        System.out.print(root.data + " "); 

        //then traverse to the right subtree
        printInorderTraversal(root.right); 
    }
}
