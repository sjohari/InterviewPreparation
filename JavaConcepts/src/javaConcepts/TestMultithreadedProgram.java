package javaConcepts;


public class TestMultithreadedProgram implements Runnable{
	private static volatile int i=10;
	TestMultithreadedProgram t3;
	

	@Override
	public void run() {
		
		try{
			
			print();
			//unsynchronized function, this function will remain unsynchronized after synchronous execution of print()
			printAll();
		}
		catch(NullPointerException e){
			System.out.println(e.toString());
		}
		
	}
	
	
	private void printAll() {
		int sum = 0;
		for(int j=0;j<1000000000; j++){
			sum = sum + j;
		}
		System.out.println("print ALL");
		
	}


	private synchronized void print() {
		//synchronized(TestMultithreadedProgram.class){
			System.out.println(Thread.currentThread());
			System.out.println("i = " + i);
//			int sum = 0;
//			for(int j=0;j<i; j++){
//				sum = sum + j;
//			}
//			System.out.println(sum);
			i++;
		//}	
	}


	public static void main(String args[]){
		
		TestMultithreadedProgram t = new TestMultithreadedProgram();
		TestMultithreadedProgram t1 = new TestMultithreadedProgram();
		//t1.t3 = new TestMultithreadedProgram();
		//t.t3 = new TestMultithreadedProgram();
		Thread thread1 = new Thread(t);
		Thread thread2 = new Thread(t);
		Thread thread3 = new Thread(t);
		Thread thread4 = new Thread(t);
		thread1.start();
		thread2.start();
		thread3.start();
		thread4.start();
		
	}

}
