package p05.secondary_stream;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.OutputStream;

public class objectoutput {

	public static void main(String[] args) {
		
		FileOutputStream f=null;
		ObjectOutputStream o=null;
		
		try {
			
			f=new FileOutputStream("tem5.txt");
			o=new ObjectOutputStream(f);
			
			o.writeObject(new String("홍길동"));
			
			
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
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
