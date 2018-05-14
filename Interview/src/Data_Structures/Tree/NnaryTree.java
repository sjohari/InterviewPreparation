package Data_Structures.Tree;

import java.util.ArrayList;
import java.util.List;

public class NnaryTree {
	int val;
	List<NnaryTree> child;
	NnaryTree(int val){
		this.val = val;
		child = new ArrayList<NnaryTree>();
	}
	
}
