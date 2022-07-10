package bank;

import java.util.ArrayList;

public class Bank {
	ArrayList<Transaction> transactionHistory = new ArrayList<Transaction>();
	ArrayList<Deposit> depositHistory = new ArrayList<>();
	
	//USER BANK ACCOUNT INFO
	private String cardNumber;
	private String accountNumber;
	private double savings;
	private double total;
	
	//GETTERS AND SETTERS
	public ArrayList<Transaction> getTransactionHistory() {
		return transactionHistory;
	}
	public void setTransactionHistory(ArrayList<Transaction> transactionHistory) {
		this.transactionHistory = transactionHistory;
	}
	public ArrayList<Deposit> getDepositHistory() {
		return depositHistory;
	}
	public void setDepositHistory(ArrayList<Deposit> depositHistory) {
		this.depositHistory = depositHistory;
	}
	public String getCardNumber() {
		return cardNumber;
	}
	public void setCardNumber(String cardNumber) {
		this.cardNumber = cardNumber;
	}
	public String getAccountNumber() {
		return accountNumber;
	}
	public void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
	}
	public double getSavings() {
		return savings;
	}
	public void setSavings(double savings) {
		this.savings = savings;
	}
	public double getTotal() {
		return total;
	}
	public void setTotal(double total) {
		this.total = total;
	}
}
