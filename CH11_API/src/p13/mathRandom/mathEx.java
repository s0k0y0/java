package p13.mathRandom;

import java.util.Random;

public class mathEx {
	public static void main(String[] args) {


		
	
		int result=(int)(Math.random()*6+1);
		switch(result){
		case 1:
			System.out.println("주사위1");
			break;
		case 2:
			System.out.println("주사위2");
			break;
		case 3:
			System.out.println("주사위3");
			break;
		case 4:
			System.out.println("주사위4");
			break;
		case 5:
			System.out.println("주사위5");
			break;
		default:
			System.out.println("주사위6");
			break;
		}
			
		int lotto=(int)(Math.random()*45+1);
		System.out.println(lotto);
		
		Random a=new Random(1234L);//1234L는 최초 출력값을 유지하도록 함
		System.out.println(a.nextInt(100));//random객체를 만들어서 숫자 설정해주면 무작위 수 출력됨
		
		
		
		
		
	}

}
