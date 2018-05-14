package javaConcepts;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class TestSerialization implements Serializable {
	transient String name;
	int age;

	private static final long serialVersionUID = -1992203396770215331L;

	public TestSerialization(String name, int age) {
		this.name = name;
		this.age = age;
	}

	public static void main(String args[]){
		try {
			FileOutputStream out = new FileOutputStream("abc.txt");
			ObjectOutputStream ob = new ObjectOutputStream(out);
			TestSerialization test = new TestSerialization("shivam",27);
			ob.writeObject(test);
			out.close();
			
			FileInputStream in = new FileInputStream("abc.txt");
			@SuppressWarnings("resource")
			ObjectInputStream objIn = new ObjectInputStream(in);
			
			TestSerialization test1  = (TestSerialization) objIn.readObject();
			System.out.println(test1.name + " " + test1.age);
			
		} catch (FileNotFoundException e) {
			System.out.println("File Not Found");
		} catch (IOException | ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
