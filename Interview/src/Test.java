import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

class MyClass implements Comparable<MyClass>{
    public int a;
    public int b;
    
    MyClass(int a, int b){
        this.a = a;
        this.b = b;
    }
    
    @Override
	public int compareTo(MyClass o){
        return (this.a - o.a);
    }
}
public class Test {

    public static void main(String[] args) throws IOException {
        List<MyClass> mylist = new ArrayList<>();
        mylist.add(new MyClass(1,2));
        mylist.add(new MyClass(3,4));
        mylist.add(new MyClass(-1,2));
        mylist.add(new MyClass(0,2));
        
        Collections.sort(mylist);
    }
}
