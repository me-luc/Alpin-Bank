package bank;

import java.sql.Date;

public class Transaction {
	private String transactionType;
	private Date date;
	private double value;
	
	public String getTransactionType() {
		return transactionType;
	}
	public void setTransactionType(String transactionType) {
		this.transactionType = transactionType;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	public void newDeposit() {
	}
	
}
