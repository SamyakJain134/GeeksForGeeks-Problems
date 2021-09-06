package Tree;

public class LoweshCommonAncestorinBinaryTree {
	Node lca(Node root, int n1,int n2)
	{
		if(root==null) //pura tree traverse krne aur n1, n2 na mile
		{
		    return null;
		}
		if(root.data==n1 || root.data==n2) //kooi bhi node pr mile toh vo node return kar denge 
		{
		    return root;
		}
		Node left=lca(root.left,n1,n2); 
		Node right=lca(root.right,n1,n2);
		if(left!=null && right!=null) //dono null nahi hai toh vahi hai lowest commen ancstor
		{
		    return root;
		}
		if(left!=null) //left se koi value aa rahi hai 
		{
		    return left;
		}
		else
		{
		    return right;//left se koi value aa rahi hai
		}
	}
}
