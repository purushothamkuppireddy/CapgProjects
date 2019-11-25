package demo;

class A{
	int count;
	public synchronized void increment() {
		 count++;
		 
	 }
}
public class MultiThreadSyncronisation {

	public static void main(String []args) throws InterruptedException {
		
		A a=new A();
		
	Thread t1=new Thread(new Runnable()
	{
		public void run() {
	
	for(int i=0;i<1000;i++) {
		
	
		a.increment();
		
	}
	}
	});
	Thread t2=new Thread(new Runnable()
	{
		public void run() {
	
	for(int i=0;i<1000;i++) {
		
	
		a.increment();
		
	}
	}
	});
	t1.start();
	t2.start();
	t1.join();// we are asking our main thread to wait until thread t completes
	
	
	t2.join();
System.out.println(a.count);
	}
	
}
