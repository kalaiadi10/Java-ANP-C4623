package corejava;

public class BankAccount 
{

	
	//variable Declaration
	
		private double balance;
		private String accountNumber;
		
	//parametried constrctor for BankAccount
		
		public BankAccount(double balance, String accountNumber) 
		{
			super();
			this.balance = balance;
			this.accountNumber = accountNumber;
			
		}
     //create getters and setters of balance & accountNumber
		public double getBalance() 
		{
			return balance;
		}

		public void setBalance(double balance)
		{
			this.balance = balance;
		}

		public String getAccountNumber() 
		{
			return accountNumber;
		}

		public void setAccountNumber(String accountNumber) 
		{
			this.accountNumber = accountNumber;
		}
		
		//method creating for deposit
		public void deposit(double amount) 
		{
			System.out.print("Balance After Deposited into the Account : ");
			System.out.println(amount =amount +balance);
		}
		
		//method creating for Withdraw
		public void withdraw(double amount)
		{
			System.out.println("Balance After Withdrwn from the Account: ");
			System.out.println(amount = balance-amount);
		}
		
		
		

}


