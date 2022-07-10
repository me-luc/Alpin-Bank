package bank;

public class Withdraw extends Transaction {
	
	public Withdraw() {
		setTransactionType("Withdraw");
	}
	@Override
	public void makeTransaction(Bank bank, double value) {
		bank.setTotal(bank.getTotal()-value);
	}
}
