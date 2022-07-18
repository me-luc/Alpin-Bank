package bank;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.AttributedString;
import java.util.ArrayList;

import javax.swing.JOptionPane;

import frames.LoadingPage;
import frames.LoginPage;
import frames.MainMenu;

public class BankApplication {
	
	public static void main(String[] args) {
		
		//creating login page frame
		LoginPage loginPage = new LoginPage();
		
		//loading the login page
		new LoadingPage(loginPage).setVisible(true);
		
		//CREATING DEFINED USERS
		ArrayList<User>users = new ArrayList<>();
		
		User user1 = new User();
		user1.setName("Mark");
		user1.setPassword("12345678");
		user1.setEmail("mark@apil");
		user1.setAccountNumber("1234");
		
		User user2 = new User();
		user2.setName("Maria");
		user2.setPassword("12345678");
		user2.setEmail("maria@apil");
		user2.setAccountNumber("1235");
		
		users.add(user1);
		users.add(user2);
		
		//LOGIN
		loginPage.btnSignIn.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        		//CHECK IF USER EXISTS
        		User user = getUser(loginPage.username.getText(), users);
        		String password = new String(loginPage.passwordField.getPassword());
        		if(login(user, password)) {
        			new MainMenu(user).setVisible(true);
        		}
        	}
        });
	}
	
	private static boolean login(User user, String password) {
		//CHECKING IF USER EXISTS
		if(user == null) {
			JOptionPane.showMessageDialog(null, "User does not exist");
			return false;
		} 
		//CHECKING IF PASSWORD IS VALID
		if(!user.validatePassword(password)) { 
			JOptionPane.showMessageDialog(null, "Wrong password, try again");
			return false;
		}
		return true;
	}
	
	//CREATE USER
	public void createUser() {
		
	}
	
	private static User getUser(String accountNumber, ArrayList<User> users) {
		for (int i = 0; i < users.size(); i++) {
			if(users.get(i).getAccountNumber().equals(accountNumber)) {
				return users.get(i);
			}
		}
		return null;
	}
	
	//DOES USER EXIST
	private static boolean doesUserExist(String accountNumber, ArrayList<User> users) {
		for (int i = 0; i < users.size(); i++) {
			System.out.println(users.get(i).getAccountNumber() + " - " + accountNumber);
			if(users.get(i).getAccountNumber().equals(accountNumber)) {
				System.out.println("User exists");
				return true;
			}
		}
		return false;
	}
	
	//IS EMAIL ALREADY REGISTERED
	private static boolean isEmailRegistered(String email, ArrayList<User> users) {
		for (int i = 0; i < users.size(); i++) {
			if(users.get(i).getEmail()==email)
				return true;
		}
		return false;
	}
	
	//IS PHONE ALREADY REGISTERED
	private static boolean isPhoneRegistered(String phone, ArrayList<User> users) {
		for (int i = 0; i < users.size(); i++) {
			if(users.get(i).getPhone()==phone)
				return true;
		}
		return false;
	}
	
	//DEPOSIT
	
	//

}
