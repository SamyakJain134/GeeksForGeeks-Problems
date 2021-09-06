package Tree;

public class DiameterofaTree {
	// Function to return the diameter of a Binary Tree.
	static int maxdiameter;
   public static int diameter(Node root) {
	   maxdiameter=Integer.MIN_VALUE;
        int x=height(root);
        return maxdiameter;
    }
private static int height(Node root) {
		if(root==null)
		{
			return 0;
		}
		
	int left=height(root.left);
	int right=height(root.right);
	
	maxdiameter=Math.max(maxdiameter, left+right+1);
	return Math.max(left, right)+1;
}


///////////////////////////////////////////////
int diameter=0;
public  int diameter2(Node root)
{
	helper(root);
	return diameter;
}
private int helper(Node root) {
	if(root==null)
	{
		return 0;
	}
	int leftheight=helper(root.left);
	int rightheight=helper(root.right);
	if(leftheight+rightheight+1>diameter)
	{
		diameter=leftheight+rightheight+1;
	}
	return 1+Math.max(leftheight, rightheight);
	
}
///////////////////////////////////////////////
}
