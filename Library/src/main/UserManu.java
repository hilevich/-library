package main;

import java.util.Scanner;

public class UserManu {

		public void mainManu(){
			
			System.out.println("1 - Users");
			System.out.println("2 - Books");
			System.out.println("3 - Rents");
			System.out.println("4 - Exit");
			
		}
		public void secondManu(){
			System.out.println("1 - Create");
			System.out.println("2 - Delete");
			System.out.println("3 - Show");
			System.out.println("4 - back");
			
		}
		
		public void choseManu(){
			System.out.println("1 - File");
			System.out.println("2 - DB");
			System.out.println("3 - back");
			
		}
		
		public void rentsManu(){
			System.out.println("1 - Rent a book");
			System.out.println("2 - Return a book");
			System.out.println("3 - Show history of rents for user");
			System.out.println("4 - Show history of rents for book");
			System.out.println("5 - back");
			
		}
		
		public void useMainManu(){
			boolean flag=true;
			
			while(flag){
				mainManu();
				Scanner sc = new Scanner(System.in);
				System.out.println("make your choice");
				
				switch (sc.nextLine()) {
				case "1":{
					useSecondManuUsers();
					
					break;
				}
					
				case "2":{
					useSecondManuBooks();
					
					break;
				}
				case "3":{
					useRentsManu();
	
					break;
				}
				case "4":{
					System.out.println("Exit");
					flag = false;
					break;
				}
				default:{
					System.out.println("Your choise is not correct");
				
					break;
				}
				}
			}
		}	
		
		public void useSecondManuUsers(){
			boolean flag=true;
			
			while(flag){
				secondManu();
				Scanner sc = new Scanner(System.in);
				System.out.println("make your choice");
				
				switch (sc.nextLine()) {
				case "1":{
					Users us = new UserClass();
					
					boolean flagIn=true;
					while(flagIn){
						choseManu();
						System.out.println("make your choice");
						switch (sc.nextLine()) {
						case "1":{
							System.out.println("User saved in FIle");
							us.createUsers();
							flagIn = false;
							break;
						}
						case "2":{
							System.out.println("User saved on DB");
							/*------------------------------------------------------------------*/
							flagIn = false;
							break;
						}
						case "3":{
							System.out.println("back");
							
							flagIn = false;
						}
						default:{
							System.out.println("Your choise is not correct");
							break;
						}
						}
					}
					break;
				}
					
				case "2":{
					Users us = new UserClass();
					
					boolean flagIn=true;
					while(flagIn){
						choseManu();
						System.out.println("make your choice");
						switch (sc.nextLine()) {
						case "1":{
							System.out.println("User deleted in FIle");
							us.deleteUsers();
							flagIn = false;
							break;
						}
						case "2":{
							System.out.println("User deleted on DB");
							/*------------------------------------------------------------------*/
							flagIn = false;
							break;
						}
						case "3":{
							System.out.println("back");
							
							flagIn = false;
						}
						default:{
							System.out.println("Your choise is not correct");
							break;
						}
						}
					}
					
					break;
				}
				case "3":{
					
					Users us = new UserClass();
					
					boolean flagIn=true;
					while(flagIn){
						choseManu();
						System.out.println("make your choice");
						switch (sc.nextLine()) {
						case "1":{
							System.out.println("Show Users in FIle");
							us.showUsers();
							flagIn = false;
							break;
						}
						case "2":{
							System.out.println("Show User on DB");
							/*------------------------------------------------------------------*/
							flagIn = false;
							break;
						}
						case "3":{
							System.out.println("back");
							/*------------------------------------------------------------------*/
							flagIn = false;
						}
						default:{
							System.out.println("Your choise is not correct");
							break;
						}
						}
					}
					
				
					break;
				}
				case "4":{
					flag = false;
					System.out.println("back");
					break;
				}
				
				default:{
					System.out.println("Your choise is not correct");
				
					break;
				}
				}
			}
		}	
		
		public void useSecondManuBooks(){
			boolean flag=true;
			
			while(flag){
				secondManu();
				Scanner sc = new Scanner(System.in);
				System.out.println("make your choice");
				
				switch (sc.nextLine()) {
				case "1":{
					Item it = new BooksClass();
					boolean flagIn=true;
					while(flagIn){
						choseManu();
						System.out.println("make your choice");
						switch (sc.nextLine()) {
						case "1":{
							
							it.createItems();
							System.out.println("Book saved in FIle");
							flagIn = false;
							break;
						}
						case "2":{
							
							/*----------------------------------------------------------*/
							System.out.println("Book saved on DB");
							flagIn = false;
							break;
						}
						
						case "3":{
							
							System.out.println("back");
							flagIn = false;
							break;
						}
						default:{
							System.out.println("Your choise is not correct");
							break;
						}
						}
					}
					
					break;
				}
					
				case "2":{
					Item it = new BooksClass();
					boolean flagIn=true;
					while(flagIn){
						choseManu();
						System.out.println("make your choice");
						switch (sc.nextLine()) {
						case "1":{
							System.out.println("Book deleted in FIle");
							it.deleteItems();
							flagIn = false;
							break;
						}
						case "2":{
							System.out.println("Book deleted on DB");
							/*------------------------------------------------------------------*/
							flagIn = false;
							break;
						}
						case "3":{
							System.out.println("back");
							flagIn = false;
						}
						default:{
							System.out.println("Your choise is not correct");
							break;
						}
						}
					}
					break;
				}
				case "3":{
					
					
					Item it = new BooksClass();
					boolean flagIn=true;
					while(flagIn){
						choseManu();
						System.out.println("make your choice");
						switch (sc.nextLine()) {
						case "1":{
							System.out.println("Show Book in FIle");
							it.showItems();
							flagIn = false;
							break;
						}
						case "2":{
							System.out.println("Show Book on DB");
							/*------------------------------------------------------------------*/
							flagIn = false;
							break;
						}
						case "3":{
							System.out.println("back");
							flagIn = false;
						}
						default:{
							System.out.println("Your choise is not correct");
							break;
						}
						}
					}
					
				
	
					break;
				}
				case "4":{
					flag = false;
					System.out.println("back");
					break;
				}
				
				default:{
					System.out.println("Your choise is not correct");
				
					break;
				}
				}
			}
		}	
		
		public void useRentsManu(){
			boolean flag=true;
			
			while(flag){
				rentsManu();
				Scanner sc = new Scanner(System.in);
				System.out.println("make your choice");
				
				switch (sc.nextLine()) {
				case "1":{
					
					
					break;
				}
					
				case "2":{
					
					
					break;
				}
				case "3":{
					
	
					break;
				}
				case "4":{
					
					
					break;
				}
				case "5":{
					flag = false;
					System.out.println("back");
					break;
				}
				
				default:{
					System.out.println("Your choise is not correct");
				
					break;
				}
				}
			}
		}	
		
}
