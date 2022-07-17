package bank;

public class Withdraw extends Transaction {
	public Withdraw(double value) {
		setValue(value);
		setTransactionType(getTransactionType());
		setDate(getDate());
	}
}
