package corejava;

public class Main {

	
		public static void main(String[] args)
		{
			//creating a object for BankAccount Class
			BankAccount b = new BankAccount(1000,"123456");
			
			//calling getBalance and getAccountNumber 
			System.out.println("Bank Account NO.: "+b.getAccountNumber());
			b.deposit(500);
			b.withdraw(200);
		    System.out.println("Bank Balance:"+ b.getBalance());
			
		}

	
}

