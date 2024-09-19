package sep19;

public class Main {
	    public static void main(String[] args) {
	        BankAccount account = new BankAccount(1000);

	        DepositThread depositThread = new DepositThread(account);
	        WithdrawThread withdrawThread = new WithdrawThread(account);

	        depositThread.start();
	        withdrawThread.start();
	    }
}
