package bank;

public class Loan extends Transaction {
	public Loan() {
		setTransactionType("Loan");
	}
	@Override
	public void makeTransaction(Bank bank, double value) {
		
	}
}
