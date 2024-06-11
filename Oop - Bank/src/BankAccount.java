
public class BankAccount {
	float balance;
	long  acntNo;
	String acntHolderName;
	public BankAccount(long acntNo, float bal, String acntHolderName) {
		this.acntNo = acntNo;
		this.balance = bal;
		this.acntHolderName = acntHolderName;
		
	}
	public void deposit(float amount) {
		balance = balance + amount;
	}
	public void withdraw(float amount) {
		balance = balance - amount;
	}
	public void showBalance() {
	    System.out.println("Current Balance:"+balance);
	}

}
//the keyword "this" belongs to current object and "this" is the local variable"
