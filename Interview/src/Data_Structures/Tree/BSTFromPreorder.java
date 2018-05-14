package Data_Structures.Tree;

import java.util.Stack;

public class BSTFromPreorder {

	
	public static void main(String[] args) {
		
		int A[] = {6,4,3,5,8,7,9};
		
		BSTNode root = convertToBST(A);
		BinarySearchTree.printInOrder(root);
	}

	private static BSTNode convertToBST(int[] a) {
		Stack<BSTNode> s = new Stack<BSTNode>();
		BSTNode root = new BSTNode();
		int l = a.length -1;
		int i=0;
		root.val = a[i];
		s.push(root);
		i++;
		while(i<=l){
			while(s.peek().val > a[i]){
				BSTNode x = new BSTNode(a[i]);
				i++;
				s.peek().left = x;
				s.push(x);
			}
			BSTNode y = null;
			while(!s.empty() && s.peek().val < a[i]){
				y = s.pop();
			}
			BSTNode z = new BSTNode(a[i]);
			if(y!=null){
				y.right = z;
				i++;
				s.push(z);
			}
		}
		return root;
	}

}
