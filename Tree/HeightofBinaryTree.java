package Tree;

public class HeightofBinaryTree {
	int heightOfBinaryTree(Node node)  
    { 
        if (node == null) 
            return 0; // If node is null then height is 0 for that node.
        else 
        { 
            // compute the height of each subtree
            int leftHeight = heightOfBinaryTree(node.left); 
            int rightHeight = heightOfBinaryTree(node.right); 

            //use the larger among the left and right height and plus 1 (for the root)
            return Math.max(leftHeight, rightHeight) + 1; 
        } 
    }
}
