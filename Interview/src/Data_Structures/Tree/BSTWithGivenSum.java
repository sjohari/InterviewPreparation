package Data_Structures.Tree;

import java.util.Stack;

public class BSTWithGivenSum {
	public static void main(String args[]){
		BSTNode root = new BSTNode(15);
		BinarySearchTree.insert(root, 10);
		BinarySearchTree.insert(root, 20);
		BinarySearchTree.insert(root, 8);
		BinarySearchTree.insert(root, 12);
		BinarySearchTree.insert(root, 16);
		BinarySearchTree.insert(root, 25);
		
		verifySum(root , 34);
	}

	private static void verifySum(BSTNode root, int sum) {
		BSTNode root1 = root;
		BSTNode root2 = root;
		boolean increment = true;
		boolean decrement = true;
		Stack<BSTNode> s1 = new Stack<>();
		Stack<BSTNode> s2 = new Stack<>();
		int val1 = 0;
		int val2 = 0;
		int i=12;
		while(i>0){
			i--;
			while(increment){
				if(root1 != null){
					s1.push(root1);
					root1 = root1.left;
				}
				else if(s1.isEmpty()){
					increment = false;
				}
				else{
					BSTNode temp = s1.pop();
					val1 = temp.val;
					root1 = temp.right;
					increment = false;
				}
			}
			
			while(decrement){
				if(root2 != null){
					s2.push(root2);
					root2 = root2.right;
				}
				else if(s2.isEmpty()){
					decrement = false;
				}
				else{
					BSTNode temp = s2.pop();
					val2 = temp.val;
					root2 = temp.left;
					decrement = false;
				}
			}
			
			if((val1+val2) == sum){
				System.out.println("Exist");
				return;
			}
			else if(val1 >= val2){
				System.out.println("Not possible");
				return;
			}
			
			else if((val1+val2) < sum){
				increment = true;
			}
			
			else if((val1+val2) > sum){
				decrement = true;
			}
			
			
		}
		
	}
}
