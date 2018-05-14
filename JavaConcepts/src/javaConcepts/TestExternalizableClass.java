package javaConcepts;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class TestExternalizableClass {

	public static void main(String args[]){
		try {
			FileOutputStream out = new FileOutputStream("pqr.txt");
			ObjectOutputStream ob = new ObjectOutputStream(out);
			TestExternizable test = new TestExternizable("shivam",27);
			ob.writeObject(test);
			out.close();
			System.out.println(test.name + " " + test.age);
			FileInputStream in = new FileInputStream("pqr.txt");
			@SuppressWarnings("resource")
			ObjectInputStream objIn = new ObjectInputStream(in);

			TestExternizable test1  = (TestExternizable) objIn.readObject();
			System.out.println(test1.name + " " + test1.age);

		} catch (FileNotFoundException e) {
			System.out.println("File Not Found");
		} catch (IOException | ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
