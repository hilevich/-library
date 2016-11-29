package main;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Scanner;

public class BooksClass implements Item, Serializable {

	
	/**
	 * 
	 */
	private static final long serialVersionUID = -8925475493187910199L;
	private static final String address = "C:\\Books\\Books.txt";
	private String bookName;
	private String bookAutor;
	private String numberOfPage;
	
	
	
	public String getBookName() {
		return bookName;
	}
	
	public String getBookAutor() {
		return bookAutor;
	}
	
	public String getNumberOfPage() {
		return numberOfPage;
	}

	public BooksClass(String bookName, String bookAutor, String numberOfPage) {
		super();
		this.bookName = bookName;
		this.bookAutor = bookAutor;
		this.numberOfPage = numberOfPage;
	}

	public BooksClass() {
		super();
		
	}
	
	@Override
	public String toString() {
		return "BooksClass [bookName=" + bookName + ", bookAutor=" + bookAutor
				+ ", numberOfPage=" + numberOfPage + "]";
	}
	
	
	
	
	@Override
	public void createItems() {
		ArrayList<BooksClass> bc = new ArrayList<BooksClass>();
		String name = null;
		boolean nameBook = false;
		boolean flag = true;
		InOut io = new InOutFile();
		bc = io.readItem(address);
		bc.add(new BooksClass("Yura", "123", "200"));
		Scanner sc = new Scanner(System.in);
		while(flag){
			nameBook = false;
			System.out.println("Enter name of book");
			name = sc.nextLine();
			for (BooksClass booksClass : bc) {
			if (booksClass.getBookName().equalsIgnoreCase(name)){
				nameBook = true;
			}	
		}
			if(nameBook==false){
				System.out.println("name of book is correct");
				flag = false;
			}else{
				System.out.println("name of book is not correct change name of book");
			}
		}
		System.out.println("Enter name Autor");
		String autor = sc.nextLine();
		System.out.println("Enter number of page");
		String page = sc.nextLine();
		io.writeItem(new BooksClass(name, autor, page), bc , address);
		
	}

	@Override
	public void deleteItems() {
		ArrayList<BooksClass> bc = new ArrayList<BooksClass>();
		int index = 0;
		String name = null;
		boolean nameBook = false;
		boolean flag = true;
		InOut io = new InOutFile();
		bc = io.readItem(address);
		bc.add(new BooksClass("Yura", "123", "200"));
		
		Scanner sc = new Scanner(System.in);
		while(flag){
			nameBook = false;
			System.out.println("Enter name of book");
			name = sc.nextLine();
			for (BooksClass booksClass : bc) {
				
			if (booksClass.getBookName().equalsIgnoreCase(name)){
				bc.remove(index);
				nameBook = true;
			}	
			index++;
		}
			if(nameBook==true){
				System.out.println("book is deleted");
				flag = false;
			}else{
				System.out.println("name of book is not correct change name of book");
			}
		}
	}

	@Override
	public void showItems() {
		ArrayList<BooksClass> bc = new ArrayList<BooksClass>();
		InOut io = new InOutFile();
		bc = io.readItem(address);
		for (BooksClass booksClass : bc) {
			System.out.println( booksClass);
		}
	}
	
	
}
