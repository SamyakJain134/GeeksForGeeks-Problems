package Tree;

public class CountNumberofNodesinBinaryTree {
	int countNodes(Node root)
	{
	    int count =  1;             //Root itself should be counted
	    if (root ==null)
	        return 0;
	    else
	    {
	        count +=countNodes(root.left);
	        count += countNodes(root.right);
	        return count;
	    }
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
