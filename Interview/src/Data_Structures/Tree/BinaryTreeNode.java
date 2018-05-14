package Data_Structures.Tree;

public class BinaryTreeNode {

	int val;
	BinaryTreeNode left;
	BinaryTreeNode right;
	
	BinaryTreeNode(int val){
		this.val = val;
		left = null;
		right = null;
	}
	

	static void printInOrder(BinaryTreeNode root) {
		if(root==null){
			return;
		}
		printInOrder( root.left);

		System.out.print(root.val + " ");

		printInOrder( root.right);
	}

}
