package bank;

public class main {

	public static void main(String[] args) {
		User mark = new User();
		mark.transactions.add(new Deposit());
		mark.transactions.get(0).getTransactionType();
		mark.transactions.get(0).newDeposit();

	}

}
