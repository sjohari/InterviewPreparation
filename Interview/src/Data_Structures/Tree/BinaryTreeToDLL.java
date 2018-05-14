package Data_Structures.Tree;

public class BinaryTreeToDLL {

	static BSTNode prev = null;
	static BSTNode head = null;
	static BSTNode tail = null;
	public static void main(String[] args) {
		BSTNode root = null;
		root = BinarySearchTree.insert(root,9);
		root = BinarySearchTree.insert(root,5);
		root = BinarySearchTree.insert(root,7);
		root = BinarySearchTree.insert(root,8);
		root = BinarySearchTree.insert(root,15);
		root = BinarySearchTree.insert(root,17);
		root = BinarySearchTree.insert(root,11);
		root = BinarySearchTree.insert(root,13);



		/**Code to convert binary tree to DLL*/
		//	convertToDLL(root);
		//	print(head);


		/**Code to create sum tree*/
		//createSumTree(root);
		//BinarySearchTree.printInOrder(root);


		/**Convert an arbitrary Binary Tree to a tree that holds Children Sum Property*/
//		BSTNode x = new BSTNode(90);
//		x.left =root;
//		root =x;
//		covertToChildrenSumTree(root);
//		BinarySearchTree.printInOrder(root);
		
		/**Given a binary tree, how do you remove all the half nodes*/
		
		root = removeHalfNodes(root);
		BinarySearchTree.printInOrder(root);
	}

	private static BSTNode removeHalfNodes(BSTNode root) {
		if(root==null){
			return null;
		}
		if(removeHalfNodes(root.left)!=null && removeHalfNodes(root.right)!=null || 
				(removeHalfNodes(root.left) ==null && removeHalfNodes(root.right) == null)){
			return root;
		}else{
			BSTNode x = removeHalfNodes(root.left)==null?removeHalfNodes(root.right):removeHalfNodes(root.left);
			root.val = x.val;
			root.left = null;
			root.right= null;
		}
		return root;
		
	}

	private static int covertToChildrenSumTree(BSTNode root) {
		if(root==null){
			return 0;
		}
		int left = covertToChildrenSumTree(root.left);
		
		int right = covertToChildrenSumTree(root.right);
		int diff = root.val - (left+right);
		if(diff < 0){
			root.val = root.val - diff;
		}else{
			BSTNode temp = root.left;
			while(temp!=null){
				temp.val+=diff;
				temp=temp.left;
			}
		}
		
		return root.val;
		
	}

	private static int createSumTree(BSTNode head2) {
		if(head2==null){
			return 0;
		}
		int left = createSumTree(head2.left);
		int right = createSumTree(head2.right);
		int val = head2.val;
		head2.val = (left + right);
		return (val +head2.val) ;
	}

	private static void print(BSTNode head2) {
		BSTNode temp = head;
		while(temp!=null){
			System.out.print(temp.val + " ");
			temp=temp.right;
		}
		System.out.println();
		System.out.println();
		temp = tail;
		while(temp!=null){
			System.out.print(temp.val + " ");
			temp=temp.left;
		}
	}

	private static void convertToDLL(BSTNode root) {
		if(root==null){
			return;
		}
		convertToDLL(root.left);
		root.left = prev;
		if(prev==null){
			head = root;
		}else{
			prev.right = root;
		}
		tail = root;
		prev= root;
		convertToDLL(root.right);
	}

}
