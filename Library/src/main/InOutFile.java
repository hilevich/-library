package main;


import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;

public class InOutFile  implements InOut, Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID =-8925475493187910199L;

	@Override
	public void writeItem(BooksClass books, ArrayList<BooksClass> array, String address) {
		
		try {
		      FileOutputStream fos = new FileOutputStream(address);
		      ObjectOutputStream serial = new ObjectOutputStream(fos);
		     for (BooksClass booksClass : array) {
		    	 serial.writeObject(booksClass);
		    	 
		     }
		     serial.flush();
		     serial.close();
		    } catch (Exception ex) {
		      System.out.println("Ошибка при сериализации объекта");
		}
		
	}

	

	@Override
	public void writeRents() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public ArrayList<BooksClass> readItem(String address) {

		ArrayList<BooksClass> books2 = new ArrayList<BooksClass>();
		try (FileInputStream fin = new FileInputStream(address)){
            ObjectInputStream ois = new ObjectInputStream(fin);
          
            BooksClass bk;
            do{
            
            bk = (BooksClass) ois.readObject();
            books2.add(bk);
                      
            }while (bk!=null);
             ois.close();
        } catch (FileNotFoundException ex) {
        	System.out.println(" error1");
        } catch (IOException | ClassNotFoundException ex) {
           System.out.println("error2");
        }

		return books2;
	}

	

	@Override
	public ArrayList<Rents> readRents(String address) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ArrayList<UserClass> readUsers(String address) {
		// TODO Auto-generated method stub
		return null;
	}



	@Override
	public void writeUsers(UserClass user, ArrayList<UserClass> array,
			String address) {
		try {
		      FileOutputStream fos = new FileOutputStream(address);
		      ObjectOutputStream serial = new ObjectOutputStream(fos);
		     for (UserClass userArra : array) {
		    	 serial.writeObject(userArra);
		    	 
		     }
		     serial.flush();
		     serial.close();
		    } catch (Exception ex) {
		      System.out.println("Ошибка при сериализации объекта");
		}
		
	}

	

	
}
