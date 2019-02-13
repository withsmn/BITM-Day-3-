package bankexample;

public abstract class BankAccount {
	private String ac_name;
	private String ac_number;
	private double balance;
	public static final String bankName = "UCBL";
	
	
	public BankAccount(String ac_name, String ac_number, double balance) {
		this.ac_name = ac_name;
		this.ac_number = ac_number;
		this.balance = balance;
	}
	public String getAc_name() {
		return ac_name;
	}
	public void setAc_name(String ac_name) {
		this.ac_name = ac_name;
	}
	public String getAc_number() {
		return ac_number;
	}
	public void setAc_number(String ac_number) {
		this.ac_number = ac_number;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	
	public String deposit(double amount) {
		balance += amount;
		return "Your account has been credited with TK. "+amount;
	}
	
	public static String getBankAddress() {
		return "12 kazi nazrul islam ave, kawranbazar, dhaka";
	}
	
	public final String getAccountHolderAddress() {
		// this method cannot be overriden by child classes
		return "Dhaka";
	}
	
	public abstract String withdraw(double amount);
}
