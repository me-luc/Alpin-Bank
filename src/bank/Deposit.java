package bank;

public class Deposit extends Transaction {
	
	public Deposit(double value) {
		setTransactionType("Deposit");
		setDate(getCurrentDate());
		setValue(value);
	}
	@Override
	public void makeTransaction(BankAccount bank, double value) {
		bank.setTotal(bank.getTotal()+value);
	}
}
