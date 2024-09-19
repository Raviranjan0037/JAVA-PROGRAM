package sep19;

public class PrintNumber implements Runnable  {
	 @Override
	    public void run() {
	        for (int i = 1; i <= 10; i++) {
	            System.out.println("Thread " + Thread.currentThread().getName() + ": " + i);
	        }
	    }

	    public static void main(String[] args) {
	        // Create multiple threads
	        Thread thread1 = new Thread(new PrintNumber(), "Thread-1");
	        Thread thread2 = new Thread(new PrintNumber(), "Thread-2");
	        Thread thread3 = new Thread(new PrintNumber(), "Thread-3");

	        // Start the threads
	        thread1.start();
	        thread2.start();
	        thread3.start();
	    }
}
