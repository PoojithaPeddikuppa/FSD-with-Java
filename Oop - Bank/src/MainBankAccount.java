
public class MainBankAccount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BankAccount savingsAccount = new BankAccount(1254965874L,15236.24f,"Poojitha");
        //invoke the methods
		savingsAccount.showBalance();
		savingsAccount.deposit(10000.00f);
		savingsAccount.showBalance();
		savingsAccount.withdraw(5000.00f);
		savingsAccount.showBalance();
		//recurring Account
		BankAccount rdAccount = new BankAccount(2458966L, 50000.00f,"Peddikuppa");
		//invoke the methods
				rdAccount.showBalance();
				rdAccount.deposit(10000.00f);
				rdAccount.showBalance();
				rdAccount.withdraw(5000.00f);
				rdAccount.showBalance();
     }
}
//reusability and extendability of the existing resources is known as inheritance
//manager will have additional method and property compared to employee i.e, team size and controls the team