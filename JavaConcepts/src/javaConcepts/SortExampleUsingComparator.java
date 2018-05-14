package javaConcepts;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class SortExampleUsingComparator implements Comparator<ComparatorInterfaceExample>{
		
	public static void main(String[] args) {
		List<ComparatorInterfaceExample> objList = new ArrayList<>();	
		
		objList.add(new ComparatorInterfaceExample("asdfjhv" ,23));
		objList.add(new ComparatorInterfaceExample("jfkef",43));
		objList.add(new ComparatorInterfaceExample("rr23",76));
		objList.add(new ComparatorInterfaceExample("fewfw",54));
		
		Collections.sort(objList,new SortExampleUsingComparator());
		
		for(int i = 0;i<objList.size();i++){
			System.out.println(objList.get(i).name);
		}

	}
	
	@Override
	public int compare(ComparatorInterfaceExample o1, ComparatorInterfaceExample o2) {
		return o1.name.compareTo(o2.name);
	}
}