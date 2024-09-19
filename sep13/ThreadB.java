package sep13;

public class ThreadB extends Thread {
	
	Common ccc  ;
	String name  ;
	
	
	ThreadB (Common c  , String name ) {
		
		this.ccc  = c  ;
		this .name  = name  ;
		
	}
	
   public void run() {
	   ccc.fun1(name);
   }
	

}