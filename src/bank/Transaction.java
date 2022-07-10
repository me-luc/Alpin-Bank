package bank;

import java.sql.Date;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class Transaction {
	private String transactionType;
	private Date date;
	private double value;
	private String id;
	
	public String getTransactionType() {
		return transactionType;
	}
	public void setTransactionType(String transactionType) {
		this.transactionType = transactionType;
	}
	public Date getDate() {
		return this.date;
	}
	public Date getCurrentDate() {
		Date date = new Date(System.currentTimeMillis());
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	public void makeTransaction(Bank bank, double value) {
	}
	public double getValue() {
		return value;
	}
	public void setValue(double value) {
		this.value = value;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	
}
