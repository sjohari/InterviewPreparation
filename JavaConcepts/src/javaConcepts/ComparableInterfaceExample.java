package javaConcepts;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ComparableInterfaceExample implements Comparable<ComparableInterfaceExample> {
	String name;
	int age;
	
	ComparableInterfaceExample(String name, int age){
		this.name = name;
		this.age = age;
	}
	

	@Override
	public int compareTo(ComparableInterfaceExample o) {
		//return this.age -o.age;
		return this.name.compareTo(o.name);
	}
	
	public static void main(String args[]){
		List<ComparableInterfaceExample> objList = new ArrayList<>();	
		objList.add(new ComparableInterfaceExample("asdfjhv" ,23));
		objList.add(new ComparableInterfaceExample("jfkef",43));
		objList.add(new ComparableInterfaceExample("rr23",76));
		objList.add(new ComparableInterfaceExample("fewfw",54));
		Collections.sort(objList);
		for(int i = 0;i<objList.size();i++){
			System.out.println(objList.get(i).name);
		}
	}

}
