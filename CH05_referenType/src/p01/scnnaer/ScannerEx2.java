package p01.scnnaer;

import java.util.Scanner;

public class ScannerEx2 {

	public static void main(String[] args) {
		System.out.println("숫자 입력");
		Scanner a = new Scanner(System.in);// ()안에 안채우면 오류
//		String Num = a.nextLine();// 스캐너 클래스에서 next메소드 사용. 기능은 문자를 읽어서 문자열로 바꾸기
//		int num = Integer.parseInt(Num);// 변수에 담긴 값을 숫자로 만들기 integer클래스의 메소드 기능

		int	num=a.nextInt();//next's integer version:문자를 숫자로 읽어 숫자로 바꿔주기. 위의 두줄과 같은 기능을 할 수 있음
		
		if (num == 0) {
			System.out.println("입력숫자 0");
		} else {
			System.out.println("입력숫자 0이 아님");
			System.out.println("입력 숫자" +num+"입니다");
		}
		
		a.close();//스캐너 쓰고나서 반드시 받아줘야 함
	}
	
	

}
