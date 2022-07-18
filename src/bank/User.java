package bank;

public class User {
	private String name;
	private String id;
	private String password;
	//login method is by account number
	private String accountNumber;
	private String email;
	private String phone;
	BankAccount userAccount;
	
	//GETTERS AND SETTERS
	public String getName() {
		return name;
	}
	public boolean validatePassword(String password) {
		return this.password.equals(password);
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	private String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getAccountNumber() {
		return accountNumber;
	}
	public void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
}
