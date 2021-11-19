package p03.for_whild;

import java.io.IOException;
import java.util.Scanner;

public class ScannerEx {

	public static void main(String[] args) throws IOException {
		
		boolean run=true;
		int balance=0;
		
		Scanner s=new Scanner(System.in);
		String input;
		
		while(run) {
			
			System.out.println("1.예금 | 2.출금 | 3.잔고 | 4.종료");
			System.out.println("선택>");
			input=s.nextLine();//System.in.read()는 숫자타입밖에 안됨

			System.out.println("예금액");
			int input2=System.in.read();
			
			if(input.equals("예금")) {
				balance=balance+input2;
				System.out.println(input2);
			}
			
			if(input.equals("출금")) {
				balance=balance-input2;
				System.out.println(input2);
			}
			
			if(input.equals("출금")) {
				balance=balance-input2;
			}
			
		}
		
		
		
		
		
	}

}
