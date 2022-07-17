package bank;

public class Loan extends Transaction {
	
	private double interest;
	private double remainingDebt;
	
	public Loan(double value) {
		setValue(value);
		setTransactionType(getTransactionType());
		setDate(getDate());
	}
	
	//GETTERS AND SETTERS
	public double getInterest() {
		return interest;
	}
	public void setInterest(double interest) {
		this.interest = interest;
	}
	public double getRemainingDebt() {
		return remainingDebt;
	}
	public void setRemainingDebt(double remainingDebt) {
		this.remainingDebt = remainingDebt;
	}
}
