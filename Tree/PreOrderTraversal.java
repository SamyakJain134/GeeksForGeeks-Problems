package Tree;

public class PreOrderTraversal {
	 // Print preorder traversal of given tree.
    void printPreorderTraversal(Node root) 
    { 
        if (root == null) 
            return; 
        //first print the data of node
        System.out.print(root.data + " "); 

        //then traverse to the left subtree
        printPreorderTraversal(root.left);                    

        //then traverse to the right subtree
        printPreorderTraversal(root.right); 
    }
}
