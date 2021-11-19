package p05.secondary_stream;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class objectouputEx2 {

	public static void main(String[] args) {
		
		ObjectOutputStream o=null;
		
		try {
			
			FileOutputStream f=new FileOutputStream("tem6.txt");
			o=new ObjectOutputStream(f);
		
			
			
			
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		
		
		

	}

}

class A implements Serializable{
	
	int a;
	B b=new B();
	int c;
	int d;
	
	
	
}

class B implements Serializable{
	
	int b;
	
}