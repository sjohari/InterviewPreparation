package Data_Structures.Tree;

class BSTNode{
	int val;
	BSTNode left;
	BSTNode right;
	
	BSTNode(int val){
		this.val = val;
	}
	BSTNode(){
	}
}

public class BinarySearchTree {
	
	static BSTNode insert(BSTNode root , int data){
		if(root==null){
			root = new BSTNode(data);
			return root;
		}
		
		if(root.val >= data){
			root.left = insert(root.left ,data);
		}else{
			root.right = insert(root.right ,data);
		}
		return root;
	}
	
	static BSTNode delete(BSTNode root, int data){
		
		if(root==null){
			return root;
		}
		
		if(root.val==data){
			if(root.left != null){
				BSTNode prev = root;
				BSTNode temp = root.left;
				while(temp.right!=null){
					prev = temp;
					temp = temp.right;
				}
				root.val = temp.val;
				if(prev==root){	
					prev.left = temp.left;
				}else{
					prev.right = temp.left;
				}
			}else if(root.right != null){
				BSTNode temp = root.right;
				root.right = null;
				return temp;
			}else{
				return null;
			}
		}else{
			root.left = delete(root.left, data);
			root.right = delete(root.right, data);
		}
		return root;
		
	}
	
	static boolean search(BSTNode root,int data){
		if(root==null){
			return false;
		}
		if(root.val == data){
			return true;
		}
		return (search(root.left,data) || search(root.right,data));
	}
	
	public static void main(String args[]){
		BSTNode root = null;
		root = insert(root,9);
		root = insert(root,15);
		root = insert(root,17);
		root = insert(root,11);
		root = insert(root,13);
		
		printInOrder(root);
		System.out.println();
		if(search(root, 23)){
			System.out.println("FOUND");
		}else{
			System.out.println("NOT FOUND");
		}
		
		root = delete(root , 9);
		
		System.out.println(root.val);
		
		printInOrder(root);
		
	}

	static void printInOrder(BSTNode root) {
		if(root==null){
			return;
		}
		printInOrder( root.left);
		
		System.out.print(root.val + " ");
		
		printInOrder( root.right);
	}

}
