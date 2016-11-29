package main;

import java.io.Serializable;
import java.util.ArrayList;

public class InOutDB implements InOut, Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID =-8925475493187910199L;


	@Override
	public void writeUsers(UserClass user, ArrayList<UserClass> array,
			String address) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void writeRents() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public ArrayList<BooksClass> readItem(String address) {
		// TODO Auto-generated method stub
		return null;
	}

	

	@Override
	public ArrayList<Rents> readRents(String address) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void writeItem(BooksClass books, ArrayList<BooksClass> array,
			String address) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public ArrayList<UserClass> readUsers(String address) {
		// TODO Auto-generated method stub
		return null;
	}
	

}
