package p04.fileInputStream;

import java.io.FileWriter;
import java.io.IOException;

public class filewriterEx2 {

	public static void main(String[] args) {
		
		FileWriter f=null;
		
		try {
			
			f=new FileWriter("tem2.txt");
			
			String a="hongkil";
			f.write(a);
			
		} catch (IOException e) {
			
		} finally {
			try {
				f.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		
		
		
		
		
		
		
		

	}

}
