package sep19;

public class BankAccount {
	    private int balance;

	    public BankAccount(int initialBalance) {
	        this.balance = initialBalance;
	    }

	    public synchronized void deposit(int amount) {
	        balance += amount;
	        System.out.println("Deposited $" + amount + ". New balance: $" + balance);
	    }

	    public synchronized void withdraw(int amount) {
	        if (balance >= amount) {
	            balance -= amount;
	            System.out.println("Withdrew $" + amount + ". New balance: $" + balance);
	        } else {
	            System.out.println("Insufficient balance. Cannot withdraw $" + amount);
	        }
	    }
}
