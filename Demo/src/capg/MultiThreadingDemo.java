package capg;

public class MultiThreadingDemo extends Thread 
{ 
    public void run() 
    { 
        try
        { 
            // Displaying the thread that is running 
            System.out.println ("Thread "+Thread.currentThread().getName()+ " is running");
  
        } 
        catch (Exception e) 
        { 
            // Throwing an exception 
            System.out.println ("Exception is caught"); 
        } 
    } 
} 
 class MultiThreadingDemo2 extends Thread 
{ 
    public void run() 
    { 
        try
        { 
            // Displaying the thread that is running 
            System.out.println ("Thread " +
                 Thread.currentThread().getName()+ " is running"); 
            
  
        } 
        catch (Exception e) 
        { 
            // Throwing an exception 
            System.out.println ("Exception is caught"); 
        } 
    } 
} 

// Main Class 
 class Multithread 
{ 
    public static void main(String[] args) 
    { 
        int n = 8; // Number of threads 
        for (int i=0; i<8; i++) 
        { 
            MultiThreadingDemo object = new MultiThreadingDemo();
            MultiThreadingDemo2 object2 = new MultiThreadingDemo2(); 
            object.start();
            try {Thread.sleep(1000);} catch (InterruptedException e) {}
				
            	object2.start();
            	
            
        } 
    } 
} 
