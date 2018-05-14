package Data_Structures.Tree;

public class IsBST {
	
	public static void main(String args[]){
		
		BinaryTreeNode btree = new BinaryTreeNode(10);
		btree.left = new BinaryTreeNode(8);
		btree.right = new BinaryTreeNode(12);
		btree.left.left = new BinaryTreeNode(6);
		btree.left.right = new BinaryTreeNode(4);
		btree.right.left = new BinaryTreeNode(11);
		btree.right.right = new BinaryTreeNode(14);
		btree.printInOrder(btree);
		
		if(isBinarySearchTree(btree)){
			System.out.println("TRUE");
		}else{
			System.out.println("FALSE");
		}
		
	}

	private static boolean isBinarySearchTree(BinaryTreeNode root) {
		if(root==null){
			return true;
		}
		return isBinarySearchTreeUtil(root , 0 , 1000);
	}

	private static boolean isBinarySearchTreeUtil(BinaryTreeNode root, int min, int max) {
		if(root==null){
			return true;
		}
		
		if(root.val < min || root.val > max){
			return false;
		}
		return (isBinarySearchTreeUtil(root.left, min, root.val-1) 
				&& isBinarySearchTreeUtil(root.right, root.val+1, max));
	}
}
