package testThread;

public class ThreadTest extends Thread{
	
	 public void run() {
		 
		    System.out.println("This code is running in a thread");
     }

	public static void main(String[] args) {
		
		
		 ThreadTest thread = new ThreadTest();
		 thread.start();
		 System.out.println("This code is outside of the thread");
		

	}

}
