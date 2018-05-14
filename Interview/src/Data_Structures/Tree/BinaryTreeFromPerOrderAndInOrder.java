package Data_Structures.Tree;

public class BinaryTreeFromPerOrderAndInOrder {
	static int i;
	public static void main(String[] args) {
		
		int preOrder[] = {6,4,3,5,8,7,9};
		int inOrder[] = {3,4,5,6,7,8,9};
		i=0;
		int start = 0;
		int end = inOrder.length -1;
		BinaryTreeNode root = convertToBT(preOrder, inOrder , start, end);
	//	System.out.println(root.val);
		BinaryTreeNode.printInOrder(root);
		
	}

	private static BinaryTreeNode convertToBT(int[] preOrder ,int[] inOrder , int start, int end) {
		if(start>end){
			return null;
		}
		BinaryTreeNode root = new BinaryTreeNode(preOrder[i]);
		int inOrderIndex = findIndexInInOrder(preOrder[i] , inOrder , start, end);
		i++;
		root.left = convertToBT(preOrder, inOrder , start, inOrderIndex-1);
		root.right = convertToBT(preOrder, inOrder , inOrderIndex+1, end);
		return root;
	}

	private static int findIndexInInOrder(int j, int[] inOrder, int start,
			int end) {
		int mid = -1;
		while(start<=end){
			mid = (start+end)/2;
			if(inOrder[mid] == j)
				return mid;
			if(inOrder[mid] < j){
				start = mid+1;
				continue;
			}
			end = mid-1;
		}
		return -1;
	}



}
