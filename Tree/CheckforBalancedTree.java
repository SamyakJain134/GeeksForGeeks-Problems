package Tree;

public class CheckforBalancedTree {
	public static boolean isBalanced(Node root)
    {
	if(root==null)
	{
		return true;
	}
	int height=height(root);
	int lh=height(root.left);
	int rh=height(root.right);
	if(Math.abs(lh-rh)<=1 && isBalanced(root.left) && isBalanced(root.right))
	{
		return true;
	}
	return false;
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
