package p05.System;

import java.io.IOException;
import java.io.InputStreamReader;

public class systemEx {
	public static void main(String[] args) {

		
		InputStreamReader r=new InputStreamReader(System.in);//System.in:키보드 입력
		
		try {
			while(true) {
				int re=r.read();//문자 하나에 대한 ascii 코드값
				System.out.println(re);//아스키 코드값 출력
				char c=(char)re;//casting integer to char
				System.out.println("입력 문자:"+c);
				if(c=='.')//문자가 .으로 끝날 경우 break;로 반복문 탈출
					break;
			}
			
		} catch (IOException e) {
			System.out.println("키보드에 입력된 것을 읽을 수 없다");
		}
		
		
		
		
	}

}
