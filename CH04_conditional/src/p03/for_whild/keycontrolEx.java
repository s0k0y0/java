package p03.for_whild;

import java.io.IOException;

public class keycontrolEx {

	public static void main(String[] args) throws Exception  {
		
		boolean run=true;
		int speed=0;
		int keycode=0;
		
		while(run) {
			if(keycode!=13&&keycode!=10) {//13,10은 엔터?
				System.out.println("1.증감 | 2.감속 | 3.중지");
				System.out.println("선택값:");
			}
			
		
		
		keycode=System.in.read();
		
		//키보드 입력값을 읽음 system.in>키보드 입력
		
		
		if(keycode==49) {//키보드 입력값 1이 아스키 코드표 49
			speed++;
			System.out.println("현재 속도: "+speed);
			
		} else if(keycode==50) {//키보드 입력값2이 아스키 코드표50
			speed--;
			System.out.println("현재 속도: "+speed);
		} else if(keycode==51) {//키보드 입력값3이 아스키 코드 51
			run=false;//while문 종요하기. break;는 오류뜸
		}
		
		}
		
		System.out.println("done");
		
		

	}

}
