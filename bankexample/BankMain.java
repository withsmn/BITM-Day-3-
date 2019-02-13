package bankexample;

public class BankMain {

	public static void main(String[] args) {
		
		BankAccount ba = new BankAccount("sdfs","sdj",328.0) {
			
			@Override
			public String withdraw(double amount) {
				// TODO Auto-generated method stub
				return "returning from parent";
			}
		};
		
		System.out.println(ba.withdraw(3824.0));
		
		SavingsAccount sa = 
				new SavingsAccount("abcd", "sa-93248328", 500.0, 8.0);
		CheckingAccount ca = 
				new CheckingAccount("efgh", "ca-999999", 1000.0, 2500.0, 300000.0);
		
		BankAccount.getBankAddress();
		System.out.println(BankAccount.bankName);
		System.out.println("After account created");
		System.out.println("======================");
		
		System.out.println(sa.getBalance());
		System.out.println(ca.getBalance());
		
		System.out.println("Deposit");
		System.out.println("============");
		
		System.out.println(sa.deposit(2000.0));
		System.out.println(ca.deposit(20000.0));
		
		System.out.println("After Deposit");
		System.out.println("============");
		
		System.out.println(sa.getBalance());
		System.out.println(ca.getBalance());
		
		System.out.println("Withdraw");
		System.out.println("============");
		
		System.out.println(sa.withdraw(10000.0));
		System.out.println(ca.withdraw(150000.0));
		
		System.out.println("After Withdraw");
		System.out.println("============");
		
		System.out.println(sa.getBalance());
		System.out.println(ca.getBalance());

	}

}
