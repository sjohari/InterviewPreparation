package Data_Structures.Tree;

public class MaxHeightWithAnyNodeAsParent {
	
	static int inHeight[];
	static int outHeight[];
	
	public static void main(String args[]) throws Exception{
		
		NnaryTree node1 = new NnaryTree(1);
		NnaryTree node2 = new NnaryTree(2);
		NnaryTree node3 = new NnaryTree(3);
		NnaryTree node4= new NnaryTree(4);
		NnaryTree node5 = new NnaryTree(5);
		NnaryTree node6 = new NnaryTree(6);
		NnaryTree node7 = new NnaryTree(7);
		NnaryTree node8 = new NnaryTree(8);
		NnaryTree node9 = new NnaryTree(9);
		NnaryTree node10 = new NnaryTree(10);
		NnaryTree node11 = new NnaryTree(11);
		node1.child.add(node2);
		node1.child.add(node3);
		node1.child.add(node4);
		node2.child.add(node5);
		node2.child.add(node6);
		node4.child.add(node8);
		node4.child.add(node9);
		node3.child.add(node7);
		node7.child.add(node10);
		node7.child.add(node11);
		inHeight = new int[12];
		outHeight = new int[12];
		printMaxHeightWithAnyNodeAsTree(node1);
		
	}

	private static void printMaxHeightWithAnyNodeAsTree(NnaryTree node1) {
		
		calculateInHeight(node1);
		
		calculateOutHeight(node1 , node1);
		
		for(int i=1;i<inHeight.length;i++){
			System.out.println("Max height with "+ i + " as root is "+ max(inHeight[i],outHeight[i]) );
		}
			
	}

	private static void calculateOutHeight(NnaryTree node1 ,  NnaryTree parent) {
		if(node1 == parent){
			outHeight[node1.val] = 0;
		}		
		
		int max1 = 0;
		int max2 = 0;
		for(NnaryTree childNode :  node1.child){
			if(inHeight[childNode.val] >= max1){
				max2=max1;
				max1 = inHeight[childNode.val];
			}else if(inHeight[childNode.val] > max2){
				max2 = inHeight[childNode.val];
			}
		}
		int longest = 0;
		for(NnaryTree childNode :  node1.child){
			longest = max1;
			if(longest == inHeight[childNode.val]){
				longest = max2;
			}
			outHeight[childNode.val] = 1 + max(outHeight[node1.val] , 1 + longest);
			calculateOutHeight( childNode ,  node1);
		}
	}

	private static int calculateInHeight(NnaryTree node1) {
		
		for(NnaryTree childNode :  node1.child){
			calculateInHeight(childNode);
			inHeight[node1.val]  =  max(inHeight[node1.val] ,1 + inHeight[childNode.val] );
		}
		
		return 0;
	}

	private static int max(int i, int j) {
		if(i<j){
			return j;
		}
		return i;
	}

}
