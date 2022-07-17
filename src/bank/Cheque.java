package bank;

public class Cheque extends Transaction {
	User receiverUser;
	public Cheque(double value, User receiverUser) {
		setValue(value);
		setTransactionType(getTransactionType());
		setDate(getDate());
		this.receiverUser = receiverUser;
	}
	
	//GETTERS AND SETTERS
	public User getReceiverUser() {
		return receiverUser;
	}
	public void setReceiverUser(User receiverUser) {
		this.receiverUser = receiverUser;
	}
}
