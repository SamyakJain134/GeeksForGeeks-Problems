package Tree;

public class ChilrenSumAParent {
	public static int isSumProperty(Node root)
    {
        int leftsum = 0;
        int rightsum = 0;
        if(root==null || (root.left==null && root.right==null))
        {
            return 1;
        }
        else
        {
            if(root.left!=null)
            {
            leftsum=root.left.data;    
            }
            if(root.right!=null)
            {
                rightsum=root.right.data;
            }
            if((root.data==leftsum+rightsum) && isSumProperty(root.left)!=0 && isSumProperty(root.right)!=0)
            {
                return 1;
            }
            else
            {
                return 0;
            }
            
        }
        
    }
}
