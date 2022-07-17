package bank;

import java.util.ArrayList;

import frames.LoadingPage;
import frames.LoginPage;

public class BankApplication {
	
	ArrayList<User> users = new ArrayList<>();
	
	public static void main(String[] args) {
		
		//creating login page frame
		LoginPage loginPage = new LoginPage();
		
		//loading the login page
		new LoadingPage(loginPage).setVisible(true);
		
		//LOGIN
		
	}

}
