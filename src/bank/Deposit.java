package bank;

public class Deposit extends Transaction {
	public Deposit(double value) {
		setValue(value);
		setTransactionType(getTransactionType());
		setDate(getDate());
	}
}
