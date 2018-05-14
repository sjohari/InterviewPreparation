package javaConcepts;

import java.io.Externalizable;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class TestExternizable implements Externalizable {
	String name;
	int age;

	private static final long serialVersionUID = -1992203396770215331L;

	public TestExternizable(String name, int age) {
		this.name = name;
		this.age = age;
	}
	public TestExternizable(){
		
	}
	
	@Override
	public void writeExternal(ObjectOutput out) throws IOException {
		//out.writeInt(age);
		out.writeObject(name);
		
	}

	@Override
	public void readExternal(ObjectInput in) throws IOException, ClassNotFoundException {
		//this.age = in.readInt();
		this.name = (String) in.readObject();
		
	}
	
//	public static void main(String args[]){
//		try {
//			FileOutputStream out = new FileOutputStream("abc.txt");
//			ObjectOutputStream ob = new ObjectOutputStream(out);
//			TestSerialization test = new TestSerialization("shivam",27);
//			ob.writeObject(test);
//			out.close();
//			
//			FileInputStream in = new FileInputStream("abc.txt");
//			@SuppressWarnings("resource")
//			ObjectInputStream objIn = new ObjectInputStream(in);
//			
//			TestSerialization test1  = (TestSerialization) objIn.readObject();
//			System.out.println(test1.name + " " + test1.age);
//			
//		} catch (FileNotFoundException e) {
//			System.out.println("File Not Found");
//		} catch (IOException | ClassNotFoundException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//	}


}
