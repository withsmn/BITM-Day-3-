package bankexample;

public class CheckingAccount extends BankAccount{
	private double serviceCharge;
	private double upperLimit;

	public CheckingAccount(String ac_name, String ac_number, double balance, double serviceCharge, double upperLimit) {
		super(ac_name, ac_number, balance);
		this.serviceCharge = serviceCharge;
		this.upperLimit = upperLimit;
	}
	public double getServiceCharge() {
		return serviceCharge;
	}
	public void setServiceCharge(double serviceCharge) {
		this.serviceCharge = serviceCharge;
	}
	public double getUpperLimit() {
		return upperLimit;
	}
	public void setUpperLimit(double upperLimit) {
		this.upperLimit = upperLimit;
	}
	@Override
	public String withdraw(double amount) {
		if(amount <= upperLimit) {
			super.setBalance(super.getBalance() - amount);
			return "Your account has been debited with TK. "+amount;
		}
		return "Insufficient fund!!!";
	}
	
	
}
