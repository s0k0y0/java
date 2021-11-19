package p05.secondary_stream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.Calendar;
import java.util.GregorianCalendar;

public class ObjectInputStreamEx {

	public static void main(String[] args) {
		
		FileInputStream f=null;
		ObjectInputStream o=null;
		
		try {
			
			f = new FileInputStream("data2.dat");//input을 내기위해 반드시 outputStream이 필요한 것 같음
			o=new ObjectInputStream(f);
			
			while(true) {
			
			//GregorianCalendar serializable:직렬화가 가능한 GregorianCalendar클래스라는 뜻
			GregorianCalendar result=(GregorianCalendar) o.readObject();//gregori로 읽어온 코드값 강제변환.
	
			int year=result.get(Calendar.YEAR);//이게 주임
			int month=result.get(Calendar.MONTH);
			int date=result.get(Calendar.DATE);
			System.out.println(year+"/"+month+"/"+date);
			
			}
			
			
		} catch (FileNotFoundException e) {
			System.out.println("File Not Found");
		} catch (ClassNotFoundException e) {
			System.out.println("Class Not Found");
		} catch (IOException e) {
			System.out.println("Exception");//예외처리가 없어도 발생?
		} finally {
			try {
				o.close();
			} catch (IOException e) {
				System.out.println("close Exception");
			}
		}
	
		
		
		

	}

}
