package Tree;

public class CheckifGiventreeisSubtree {
	 public static boolean isSubtree(Node T, Node S) {
	       if(S==null)
	       {
	    	   return true;
	       }
	       if(T==null)
	       {
	    	   return false;
	       }
	       if(isIdentical(T,S))
	       {
	    	   return true;
	       }
	       return isSubtree(T.left, S) || isSubtree(T.right, S); 
	    }

	private static boolean isIdentical(Node t, Node s) {
		if(t==null && s==null)
		{
			return true;
		}
		if(t==null || s==null)
		{
			return false;
		}
		return t.data==s.data && isIdentical(t.left, s.left) && isIdentical(t.right, s.right);
 	}
	
	public boolean isSubTreeOptimized(Node main, int mainTreeNodes, Node sub, int subTreeNodes) {
	    if (sub == null) {
	      return true;
	    }

	    if (main == null) {
	      return false;
	    }

	    int mainInorder[] = new int[mainTreeNodes];
	    inorderFillArray(main, mainInorder);
	    i = 0;

	    int subInorder[] = new int[subTreeNodes];
	    inorderFillArray(sub, subInorder);
	    i = 0;
	    
	    String mainInorderString = arrayToString(mainInorder);
	    String subInorderString = arrayToString(subInorder);
	    
	    if(!mainInorderString.contains(subInorderString)) {
	      return false;
	    }

	    int mainPreorder[] = new int[mainTreeNodes];
	    preorderFillArray(main, mainPreorder);
	    i = 0;

	    int subPreorder[] = new int[subTreeNodes];
	    preorderFillArray(sub, subPreorder);
	  
	    String mainPreorderString = arrayToString(mainPreorder);
	    String subPreorderString = arrayToString(subPreorder);

	    return mainPreorderString.contains(subPreorderString);
	  }

	  int i;

	  public void inorderFillArray(Node node, int a[]) {
	    if (node == null) {
	      return;
	    }

	    inorderFillArray(node.left, a);

	    a[i++] = node.data;

	    inorderFillArray(node.right, a);
	  }

	  public void preorderFillArray(Node node, int a[]) {
	    if (node == null) {
	      return;
	    }

	    a[i++] = node.data;

	    preorderFillArray(node.left, a);
	    preorderFillArray(node.right, a);
	  }

	  public String arrayToString(int a[]) {
	    String s = "";
	    for (int i = 0; i < a.length; i++) {
	      s = s + a[i];
	    }

	    return s;
	  }

}
