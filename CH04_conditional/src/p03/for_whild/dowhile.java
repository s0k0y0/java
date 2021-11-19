package p03.for_whild;

import java.util.Scanner;

public class dowhile {

	public static void main(String[] args) {
		
		System.out.println("메세지 입력");
		System.out.println("프로그램 종료=q");
		
		Scanner s=new Scanner(System.in);//키보드 입력(System.in) 스캔하기(Scanner)

		String some;
		
		do {
			System.out.println(">");
			some=s.nextLine();//키보드 입력문장을 문자열로 출력시킨다. 전의 콘솔라인을 출력해준다?밑에 print보면 출력은 안되고 문자열 저장까지 인 것 같음
			System.out.println(some);
		} while(!some.equals("q"));//some밖에서 선언해줘야지 object메소드를 쓸 수 있었음
		
		
		

	}

}
