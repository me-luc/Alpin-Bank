package bank;

import java.sql.Date;
import java.util.ArrayList;

import javax.management.RuntimeErrorException;

public class Bank {
	public String bankName, phone, adress;
	private ArrayList<User> users = new ArrayList<>();
	
	//CONSTRUCTORS
	public Bank(String bankName, String phone, String adress) {
		this.bankName = bankName;
		this.phone = phone;
		this.adress = adress;
	}
	public Bank(String bankName, String phone, String adress, ArrayList<User> users) {
		this.bankName = bankName;
		this.phone = phone;
		this.adress = adress;
		this.users = users;
	}
	
	
	public void createUser(String password, String name, char gender, String id, String phone, 
			String email, Date birthdate, String adress, String country, String town, String postcode, int number) {
		User newUser = new User();
		try {
			newUser.setName(name);
			newUser.setEmail(email);
			newUser.setPassword(password);
			newUser.setId(id);
			newUser.setCountry(country);
			newUser.setTown(town);
			newUser.setAdress(adress);
			newUser.setPostcode(postcode);
			newUser.setNumber(number);
			newUser.setBirthdate(birthdate);
			newUser.setGender(gender);
			newUser.setPhone(phone);
			this.users.add(newUser);
		} catch (RuntimeException e) {
			throw new RuntimeException("Error while creating new user, try again");
		}
	}
	
	public void addUser(User newUser) {
		if(isEmailRegistered(newUser.getEmail())) {
			throw new RuntimeException("E-mail already registered");
		} else if (isPhoneRegistered(newUser.getPhone())) {
			throw new RuntimeException("Phone already registered");
		} else {
			this.users.add(newUser);
		}
		if(users.contains(newUser)) {
			throw new RuntimeException("User registered");
		} else {
			throw new RuntimeException("Error: User not registered");
		}
	}
	
	public ArrayList<User> getUsers() {
		return users;
	}
	public boolean isEmailRegistered(String email) {
		for(int i=0; i<users.size(); i++) {
			if(users.get(i).getEmail().equals(email)) {
				return true;
			}
		}
		return false;
	}
	
	public boolean isPhoneRegistered(String phone) {
		for(int i=0; i<users.size(); i++) {
			if(users.get(i).getPhone().equals(phone)) {
				return true;
			}
		}
		return false;
	}
	
	public User getUser(String email) {
		for (int i = 0; i < users.size(); i++) {
			if(users.get(i).getEmail().equals(email)) {
				return users.get(i);
			}
		}
		throw new RuntimeException("E-mail not found");
	}
	
	public boolean login(String email, String password) {
		for (int i = 0; i < users.size(); i++) {
			if(users.get(i).getEmail().equals(email)) {
				if(users.get(i).validatePassword(password)) {
					return true;
				} else {
					throw new RuntimeException("Incorrect password");
				}
			}
		}
		throw new RuntimeException("E-mail not found");
	}
}
