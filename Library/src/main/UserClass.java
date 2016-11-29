package main;


import java.io.Serializable;
import java.util.ArrayList;
import java.util.Scanner;



public class UserClass implements Users, Serializable{
	
	/**
	 * 
	 */

	private static final long serialVersionUID = -8925475493187910199L;
	private static final String address = "C:\\Books\\Users.txt";
	private String surName;
	private String name;
	
	
	@Override
	public void createUsers() {
		ArrayList<UserClass> arl = new ArrayList<UserClass>();
		String surName = null;
		boolean nameUser = false;
		boolean flag = true;
		InOut io = new InOutFile();
		arl = io.readUsers(address);
		
	
		Scanner sc = new Scanner(System.in);
		while(flag){
			nameUser = false;
			System.out.println("Enter surName of User");
			surName = sc.nextLine();
			for (UserClass user : arl) {
			if (user.getSurname().equalsIgnoreCase(surName)){
				nameUser = true;
			}	
		}
			if(nameUser==false){
				System.out.println("User SurName  is correct");
				flag = false;
			}else{
				System.out.println("User SurName is not correct change User SurName");
			}
		}
		System.out.println("Enter User name");
		String name = sc.nextLine();
		io.writeUsers(new UserClass(surName, name), arl, address);
		
	}
	
	@Override
	public void deleteUsers() {
		ArrayList<UserClass> arl = new ArrayList<UserClass>();
		
		int index = 0;
		String surName = null;
		boolean surNameUser = false;
		boolean flag = true;
		InOut io = new InOutFile();
		arl = io.readUsers(address);
		
	
		Scanner sc = new Scanner(System.in);
		while(flag){
			surNameUser = false;
			System.out.println("Enter User SurName");
			surName = sc.nextLine();
			for (UserClass array : arl) {
				
			if (array.getSurname().equalsIgnoreCase(surName)){
				 arl.remove(index);
				 surNameUser = true;
			}	
			index++;
		}
			if(surNameUser==true){
				System.out.println("User is deleted");
				flag = false;
			}else{
				System.out.println("SurName is not correct change user SurName");
			}
		}
		
		
	}
	@Override
	public void showUsers() {
		
		ArrayList<UserClass> arl = new ArrayList<UserClass>();
		InOut io = new InOutFile();
		arl = io.readUsers(address);
		arl.add(new UserClass("surname", "name"));
		for (UserClass userArray : arl) {
			System.out.println(userArray);
		}
		
		
		
	}
	public String getSurname() {
		return surName;
	}
	public void setSurname(String surname) {
		this.surName = surname;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public UserClass(String surname, String name) {
		super();
		this.surName = surname;
		this.name = name;
		
	}
	public UserClass() {
		super();
		
	}
	@Override
	public String toString() {
		return "UserFile [surname=" + surName + ", name=" + name
				+ ", historyOfRentsBook="  + "]";
	}
	
	
	
	
}
