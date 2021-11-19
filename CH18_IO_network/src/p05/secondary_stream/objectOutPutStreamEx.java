package p05.secondary_stream;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.GregorianCalendar;

public class objectOutPutStreamEx {
	public static void main(String[] args) {
		
		FileOutputStream f=null;
		ObjectOutputStream o=null;
		
		try {
			
			f = new FileOutputStream("data2.dat");
			o=new ObjectOutputStream(f);//클래스 타입으로 출력하기 위한 스트림
			
			o.writeObject(new GregorianCalendar(2021, 9, 22));
			o.writeObject(new GregorianCalendar(2021, 9, 23));
			o.writeObject(new GregorianCalendar(2021, 9, 24));
			o.writeObject(new GregorianCalendar(2021, 9, 25));
			
			
			
			
			
		} catch (FileNotFoundException e) {
			System.out.println("File Not Found");
		}catch (IOException e) {
			System.out.println("exception");
		} finally {
			try {
				o.close();
			} catch (IOException e) {
				System.out.println("close error");
			}
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
