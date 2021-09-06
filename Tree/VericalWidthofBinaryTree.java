package Tree;

import java.util.HashSet;

public class VericalWidthofBinaryTree {
	static HashSet<Integer> set=new HashSet<>(); //because hashset contains unique value and only key not value
	public static int verticalWidth(Node root)
	{
	    set.clear(); //claring the hashset
	    Width(root,0); //update the size of hashset
	    return set.size(); 
	}
	private static void Width(Node root, int hd) {
		if(root==null)
		{
			return; 
		}
		Width(root.left, hd-1);
		set.add(hd);
		Width(root.right, hd+1);
		
	}

}
