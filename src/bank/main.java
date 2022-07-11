package bank;

import java.io.IOException;
import java.net.URL;
import java.sql.Connection;
import java.sql.Date;
import java.util.Iterator;
import java.util.Scanner;


public class main {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		String bankName = "Apil Bank";
		String phone = "123-4587";
		String adress = "St.Louis 124";
		
		Bank apilBank = new Bank(bankName, phone, adress);
		User user1,user2,user3;
		
		//MARK USER
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
		
		//ADDING USERS
		try {
			apilBank.addUser(user1);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		try {
			apilBank.addUser(user2);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		try {
			apilBank.addUser(user3);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
		for (int i = 0; i < apilBank.getUsers().size(); i++) {
			System.out.println("User: " + apilBank.getUsers().get(i).getName());
		}
		
		String userString = "";
		String passwordString = "";
		do {
			try {
				do {
					System.out.println("-----LOGIN-----\nE-mail -> ");
					userString = s.next();
				}while(!apilBank.isEmailRegistered(userString));
				
				System.out.println("Password -> ");
				passwordString = s.next();
				apilBank.getUser(userString).validatePassword(passwordString);
			} catch (RuntimeException e) {
				System.out.println(e.getMessage());
			}
			
		} while (!apilBank.login(userString, passwordString));
		
		System.out.println(String.format("Choose an option: \n1 - Transfer \n2 - Deposit \n3 - Withdraw \n-> "));
		int op = s.nextInt();
		
		
	}

}
