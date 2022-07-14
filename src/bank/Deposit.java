package bank;

public class Deposit extends Transaction {
	
	private Deposit(double value) {
		setValue(value);
		setTransactionType(getTransactionType());
	}
	
	public void makeDeposit() {
		
	}
}
