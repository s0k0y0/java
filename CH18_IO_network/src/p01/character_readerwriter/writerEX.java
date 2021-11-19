package p01.character_readerwriter;

import java.io.FileWriter;
import java.io.IOException;

public class writerEX {

	public static void main(String[] args) {
		
		FileWriter fw=null;//main method 안이라서 반드시 변수 초기화 해줘야 해서 null값 넣음.객체 생성 쪼개서 한 버전1
		
		try {
			fw=new FileWriter("fw.txt");//파일 지정 객체 생성2
			
			char[] arr= {'j','a','v','a','O','r'};//char의 아스키 코드갑으로 저장되기에 char타입이 적당하지만 String로 아스키 코드로 저장되고 출력되어 String도 이용할 수 있음
			
			for(int i=0; i<arr.length; i++) {
				fw.write(arr[i]);//배열에 있는 내용을 fw.txt에 저장하겠다
			}
		} catch (IOException e) {
			System.out.println("예외발생");
		}
		
		try {
			fw.close();//f가 아닌 fw값으로 움직이는 데 왜지?
		} catch (IOException e) {
			System.out.println("fw.close(); 오류남");
		}
		
		
		
	}

}
