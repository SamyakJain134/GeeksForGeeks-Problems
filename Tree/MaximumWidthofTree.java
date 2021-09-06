package Tree;

public class MaximumWidthofTree {
	public static int getMaxWidth(Node root) {
		int width=0;
		int Maxwidth=0;
		int height=height(root);
		for(int i=1;i<=height;i++)
		{
			width=getWidth(root,i);
			if(width>Maxwidth)
			{
				Maxwidth=width;
			}
		}
		return Maxwidth;	
	}
	private static int getWidth(Node root, int level) {
		// TODO Auto-generated method stub
		if(root==null)
		{
			return 0;
		}
		if(level==1)
		{
			return 1;
		}
		else if(level>1)
		{
			return getWidth(root.left, level-1)+getWidth(root.right, level-1);
		}
		return 0;
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
