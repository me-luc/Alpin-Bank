package bank;

public class Loan extends Transaction {
	public Loan() {
		setTransactionType("Loan");
	}
	@Override
	public void makeTransaction(BankAccount bank, double value) {
		
	}
}
