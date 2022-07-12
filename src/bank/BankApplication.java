package bank;

import java.io.IOException;
import java.net.URL;
import java.sql.Connection;
import java.sql.Date;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Random;
import java.util.Scanner;

import javax.management.loading.PrivateClassLoader;


public class BankApplication {
	
	public static String bankName;
	public static String phone;
	public static String adress;
	private ArrayList<User> users = new ArrayList<>();

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int op  = 0;
		
		//SETTING BANK INFO
		setBankInfo(bankName, phone, adress);
		
		//ADDING PREDEFINED USERS
		definedUsers();
		
		//SIGN UP AND SIGN IN
		System.out.println("1 - Sign up!/n2 - Sign in");
		op = s.nextInt();
		if(op==2) {
			
		} 
		
	}
	
	//add an user
	public int addUser() {
		User newUser = new User();
		if(isEmailRegistered(adress)) {
			return -1;
		} else if(isPhoneRegistered(phone)){
			return -2;
		} else {
			//creating user
			newUser.setAdress(adress);
			newUser.setAdress(adress);
			newUser.setAdress(adress);
			newUser.setAdress(adress);
			newUser.setAdress(adress);
			newUser.setAdress(adress);
			newUser.setAdress(adress);
			newUser.setAdress(adress);
			newUser.setAdress(adress);
			//checking if user is really added
			if(users.contains(newUser)) {
				return 1;
			} else {
				return 0;
			}
		}
	}
	
	//is user already registered
	public boolean isEmailRegistered(String email) {
		for (int i = 0; i < users.size(); i++) {
			if(users.get(i).getEmail().equals(email)) 
				return true;
		}
		return false;
	}
	public boolean isPhoneRegistered(String phone) {
		for (int i = 0; i < users.size(); i++) {
			if(users.get(i).getPhone().equals(phone)) 
				return true;
		}
		return false;
	}
	
	//login
	
	//change password
	
	//deposit
	
	//withdraw
	
	//cheque
	
	//loan (define a random number for interest)
	
	
	public static void setBankInfo(String bankName, String phone, String adress) {
		BankApplication.bankName = bankName;
		BankApplication.phone = phone;
		BankApplication.adress = adress;
	}
	//GETTERS
	public static String getBankName() {
		return bankName;
	}
	public String getPhone() {
		return phone;
	}
	public String getAdress() {
		return adress;
	}
	public ArrayList<User> getUsers() {
		return users;
	}



	public static void definedUsers() {
		User user1, user2, user3;
		//MARK
		user1 = new User();
		user1.setName("Mark Miller");
		user1.setEmail("mark@apil");
		user1.setPassword("mark123");
		user1.setId("12345678");
		user1.setCountry("Brazil");
		user1.setTown("Rio de Janeiro");
		user1.setAdress("Rua da pedra");
		user1.setPostcode("000000");
		user1.setNumber(12);
		user1.setBirthdate(new Date(11,07,1972));
		user1.setGender('M');
		user1.setPhone("+55 00 00000-0000");
		
		//MARIA USER
		user2 = new User();
		user2.setName("Maria Johnson");
		user2.setEmail("maria@apil");
		user2.setPassword("maria123");
		user2.setId("12345678");
		user2.setCountry("Canada");
		user2.setTown("Toronto");
		user2.setAdress("Baptist Street");
		user2.setPostcode("000000");
		user2.setNumber(19);
		user2.setBirthdate(new Date(12,12,2000));
		user2.setGender('F');
		user2.setPhone("+55 00 00000-0000");
		
		//KAY USER
		user3 = new User();
		user3.setName("Kay Wilde");
		user3.setEmail("kay@apil");
		user3.setPassword("kay123");
		user3.setId("87654123");
		user3.setCountry("South Korea");
		user3.setTown("Yecheon");
		user3.setAdress("Sorittma");
		user3.setPostcode("0000000");
		user3.setNumber(365);
		user3.setBirthdate(new Date(10,02,1999));
		user3.setGender('F');
		user3.setPhone("+55 00 00000-0000"); 
	}
}
