package main;

import java.util.ArrayList;

public interface InOut  {
	
	public void writeItem(BooksClass books, ArrayList<BooksClass> array, String address) ;
	
	public void writeUsers(UserClass user, ArrayList<UserClass> array,
			String address) ;
	
	public void writeRents() ;
		
	public ArrayList<BooksClass> readItem(String address);
	
	public ArrayList<UserClass> readUsers(String address);
	
	public ArrayList<Rents> readRents(String address);
}
