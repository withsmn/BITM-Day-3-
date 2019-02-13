package bankexample;

public class SavingsAccount extends BankAccount{
	private double interestRate;
	
	public SavingsAccount(String ac_name, String ac_number, double balance, double interestRate) {
		super(ac_name, ac_number, balance);
		this.interestRate = interestRate;
	}

	public double getInterestRate() {
		return interestRate;
	}

	public void setInterestRate(double interestRate) {
		this.interestRate = interestRate;
	}

	@Override
	public String withdraw(double amount) {
		if(super.getBalance() - amount >= 500) {
			/*
			 * double remainingBalance = super.getBalance() - amount;
			 * super.setBalance(remainingBalance);
			 */
			super.setBalance(super.getBalance() - amount);
			return "Your account has been debited with TK. "+amount;
		}
		return "Insufficient fund!!!";
	}
	
	
}
