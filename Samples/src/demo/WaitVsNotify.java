package demo;

class Q {
	int num;
	boolean valueSet=false;
	
	public synchronized void setNum(int num)  {
		while(valueSet) {
			try {wait();} catch (InterruptedException e) {	}
		}
		System.out.println("put: " + num);
		this.num = num;
		valueSet = true;
		notify();

	}
	public synchronized void getNum() {
		while(!valueSet) {
			try {wait();} catch (InterruptedException e) {	}
		}
		System.out.println("get: "+ num);
		valueSet=false;
		notify();
	}

}

class Producer implements Runnable {

	Q q;

	public Producer(Q q) {
		this.q = q;
		Thread t = new Thread(this, "producer");
		t.start();
	}

	public void run() {
		int i = 0;
		while(true) {
			q.setNum(i++);
			 try {Thread.sleep(500);} catch (InterruptedException e) {}
		}
	}

}

class Consumer implements Runnable {
	Q q;

	public Consumer(Q q) {
		this.q = q;
		Thread t = new Thread(this, "consumer");
		t.start();
	}

	public void run() 
	{
		while(true)
		{
			q.getNum();
//			System.out.println(Thread.currentThread().getName());
			 try {Thread.sleep(5000);} catch (InterruptedException e) {}
		}
	}

}

public class WaitVsNotify{
	public static void main(String []args) {
	Q q= new Q();
	new Producer(q);
	new Consumer(q);
}}
