package p04.fileInputStream;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class filereaderEx2 {

	public static void main(String[] args) {
		
		
		FileReader f=null;
		
		try {
			
			f=new FileReader("tem2.txt");
			
			
//			for(int i=0; i<10; i++) {//byte가 없어질때까지 실행
			while(true) {//while이나 for 둘중하나면 됨. 둘다 byte가 없어질 때까지 출력하는 건 똑같음
			int result=f.read();//문자가 담긴 숫자 코드를 불러온 것
			char result2=(char)result;//그 숫자 코드를 char 형식으로 바꿔주면 그 안에 담긴 문자를 출력할 수 있게됨
			System.out.print(result2);
			
			}
			
			
		} catch (FileNotFoundException e) {
			System.out.println("File Not Found");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				f.close();
			} catch (IOException e) {
				
			}
		}
		
		
		
				
		
		
		
		

	}

}
