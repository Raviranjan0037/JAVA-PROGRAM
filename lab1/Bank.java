package lab1;

public class Bank { // Create a Class Bank
		    
	    private double amount;  // Create a instance variable name is amount

	    public Bank(double amount) {  // create a Parametrized Constructor
			this.amount = amount;
		}


		public void withdraw(double withdrawalAmount) {  // Create a withdraw method
			
	        // add the condition of ternary operation then the condition true return the message withdraw successful
	        String message = (withdrawalAmount <= amount) ? "Withdraw successful":"Insufficient Amount";
	        
	       
	        amount = (withdrawalAmount <= amount) ? (amount - withdrawalAmount) : amount;

	       
	        System.out.println(message);
	    }

	    
	    public void deposit(double depositAmount) {  // create the deposit method 
	                amount += depositAmount;
	        System.out.println("Deposit successful"); // return the success message
	    }

	    
	    public void displayBalance() { //  create the method of return the Total Amount 
	        System.out.println("Total balance: " + amount);
	    }

	    public static void main(String[] args) {  // create the main method
	        Bank account = new Bank(10000);  // create the object 

	        account.withdraw(2000); // call the withdraw method

	      
	        account.deposit(5000); // call the deposit method
	        
	        account.displayBalance(); // call total balance display
	    }
}