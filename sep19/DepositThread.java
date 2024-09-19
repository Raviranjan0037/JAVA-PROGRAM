package sep19;


public class DepositThread extends Thread {
	    private BankAccount account;

	    public DepositThread(BankAccount account) {
	        this.account = account;
	    }

	    @Override
	    public void run() {
	        for (int i = 0; i < 5; i++) {
	            account.deposit(100);
	            try {
	                Thread.sleep(100);
	            } catch (InterruptedException e) {
	                e.printStackTrace();
	            }
	        }
	    }
}
	                
	           