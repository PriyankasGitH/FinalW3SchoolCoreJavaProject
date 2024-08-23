package testThread;

public class RunnableTest implements Runnable {
	
	public void run() {
	    System.out.println("This code is running in a thread");
	  }

	public static void main(String[] args) {
		RunnableTest obj = new RunnableTest();
	    Thread thread = new Thread(obj);
	    thread.start();
	    System.out.println("This code is outside of the thread");

	}

}
