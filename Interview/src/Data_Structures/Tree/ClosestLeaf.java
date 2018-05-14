package Data_Structures.Tree;


public class ClosestLeaf {
	static int INT_MAX = 10000000;
	static int c = 0;
	static int childMin[] ;
	
	static int parentMin[] ;
	
	private static int calculateMinInChild(BSTNode root) {
		
		if(root==null){
			return INT_MAX;
		}
		if(root.left == null && root.right == null){
			
			childMin[root.val] = 0;
			return 1;
		}
		int l = calculateMinInChild(root.left);
		int r = calculateMinInChild(root.right);
		if(root.val==16){
			System.out.println(l + "-- "+ r);
		}
		childMin[root.val] = (l<r)?l:r;
		
		return childMin[root.val]+1;
		
	}
	
	private static void calculateMinInParent(BSTNode root) {
		if(root==null){
			return;
		}
		
		if(root.left != null && root.right !=null){
				parentMin[root.left.val]  = 1 + min(childMin[root.right.val]+1, parentMin[root.val]);
				parentMin[root.right.val]  = 1 + min(childMin[root.left.val]+1, parentMin[root.val]);
				calculateMinInParent(root.left);
				calculateMinInParent(root.right);
		}else if(root.left != null){
			parentMin[root.left.val]  = 1 + parentMin[root.val];
			calculateMinInParent(root.left);
		}else if(root.right !=null){
			parentMin[root.right.val]  = 1 + parentMin[root.val];
			calculateMinInParent(root.right);
		}else{
			return;
		}
		
	}
	
	private static int min(int i, int j) {
		if(i<j)
			return i;
		return j;
	}

	private static void printChild(BSTNode root) {
		if(root != null){
			System.out.print(root.val + "=" + childMin[root.val] + " ");
			printChild(root.left);
			printChild(root.right);
		}
	}
	
	private static void printParent(BSTNode root) {
		if(root != null){
			System.out.print(root.val + "=" + parentMin[root.val] + " ");
			printParent(root.left);
			printParent(root.right);
		}
	}
	
	static int findClosestLeaf(BSTNode root, int data){
		int min=0;
		
		calculateMinInChild(root);
		
		printChild(root);
		
		System.out.println();
		
		parentMin[root.val] = 1000000;
		
		calculateMinInParent(root);
		
		printParent(root);
		
		System.out.println();
		
		return(min(childMin[data], parentMin[data]));
	}

	

	

	public static void main(String[] args) {
		BSTNode root= null;
		root = BinarySearchTree.insert(root, 10);
		root = BinarySearchTree.insert(root, 5);
		root = BinarySearchTree.insert(root, 20);
		root = BinarySearchTree.insert(root, 16);
		root = BinarySearchTree.insert(root, 14);
		root = BinarySearchTree.insert(root, 12);
		root = BinarySearchTree.insert(root, 15);
		root = BinarySearchTree.insert(root, 13);
		root = BinarySearchTree.insert(root, 11);
		root = BinarySearchTree.insert(root, 24);
		root = BinarySearchTree.insert(root, 22);
		root = BinarySearchTree.insert(root, 21);
		root = BinarySearchTree.insert(root, 28);
		root = BinarySearchTree.insert(root, 38);
		root = BinarySearchTree.insert(root, 48);
		root = BinarySearchTree.insert(root, 58);
		root = BinarySearchTree.insert(root, 23);
		root = BinarySearchTree.insert(root, 19);
		BinarySearchTree.printInOrder(root);
		System.out.println();
		childMin = new int[1000];
		parentMin = new int[1000];
		System.out.println(findClosestLeaf(root,10));
	}

}
