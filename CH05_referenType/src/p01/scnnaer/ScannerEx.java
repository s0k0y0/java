package p01.scnnaer;

import java.util.Scanner;

public class ScannerEx {

	public static void main(String[] args) {
		//결과 
		System.out.println("입력하세요");
		Scanner s=new Scanner(System.in);//입력 클래스로:System.in은 키보드 입력할 수 있는 기능(?)/System.in은 static 클래스이다.
		String number =s.nextLine();//하나의 라인을 입력받아 문자열로 저장하겠다. 키보드로 사과라는 쓴다면 문자열 사과로 받아들이겠다.숫자로 문자열로 받아들임
		System.out.println(number+10);
		
		int Num5=Integer.parseInt(number);//입력받은 내용을 숫자로 바꿔주는 형변환 메소드. 즉, 4를 쓰면 410이 아닌 14로 연산할 수 있게됨
		System.out.println(Num5+10);
		
		for(int i=0; i<Num5; i++) {
				for(int a=0; a<=i; a++) 
					System.out.print("*");
				System.out.println();
		}

	}

}
