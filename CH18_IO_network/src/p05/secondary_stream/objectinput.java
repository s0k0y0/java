package p05.secondary_stream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class objectinput {
	public static void main(String[] args) {
		
		FileInputStream f=null;
		ObjectInputStream o=null;
		
		try {
			
			f=new FileInputStream("tem5.txt");
			o=new ObjectInputStream(f);
			
			String result=(String)o.readObject();
			
			System.out.println(result);
		
			
			
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				o.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}

	
	
	
	}

}
