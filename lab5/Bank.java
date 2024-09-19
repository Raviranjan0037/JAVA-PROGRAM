package lab5;

public class Bank {
	public double amount;
	Bank(double am){
		this.amount=am;
	}
	
	void withdraw(double withdrawalAmount){
		if(withdrawalAmount<=amount){
			amount=amount-withdrawalAmount;
		}
		else{
			System.out.println("you dont have that much money");
		}
		
	}
	 void deposit(double depositAmount){
		amount=amount+depositAmount;
		
	}
	 void display(){
		 System.out.println(amount);
	 }
	 
	 public static void main(String[] args) {
		Bank b = new Bank(10000);
		b.withdraw(30000);
		b.deposit(5000);
		b.display();
	}
}
