package p03.systeminEx;

import java.io.IOException;
import java.io.InputStream;

public class systemInEx {

	public static void main(String[] args) {
		
		
		System.out.println("1.예금 조회");
		System.out.println("2.예금 출금");
		System.out.println("3.예금 입금");
		System.out.println("4.종료 하기");
		System.out.println("-----------");

		InputStream i=System.in;//키보드 입력 기능
		
		
		char num =0;
		try {
			num=(char)i.read();//입력 문자 아스키 코드로 읽어 저장하자
		} catch (IOException e) {
			System.out.println("keyboard not read");
		}
		
		
		switch(num) {
		case '1':
			System.out.println("예금 조회");
			break;
		
		case '2':
			System.out.println("예금 출금");
			break;
		
		case '3':
			System.out.println("예금 입금");
			break;
		
		default:
			System.out.println("종료");
			break;
	
		}
		
		
		

	}

}
