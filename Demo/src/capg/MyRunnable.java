package capg;

//public class MyRunnable implements Runnable {
//
//	public void run() {
//        System.out.println("in run method of thread");
//    }
//}

class ThreadDemo {

	public static void main(String[] args) throws InterruptedException {

// using lambda expressions
		Runnable r = () -> System.out.println("in child runnablethread--1");
		Thread t = new Thread(r);

// or using anonymous class
		Runnable r2 = new Runnable() {
			public void run() {
				System.out.println("in run method of thread--2");
			}
		};
		 Thread t2=new Thread(r2);

// or using anonymous class
		Thread t3 = new Thread(new Runnable() {
			public void run() {
				System.out.println("in run method of thread--3");
			}});

// or using anonymous and lambda expression
		Thread t4 = new Thread(() -> {
			System.out.println("in child thread--4");
		});

		t4.start();

		System.out.println("main thread");

	}
}
