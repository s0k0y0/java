package p03.systeminEx;

import java.io.IOException;
import java.io.InputStream;

public class systemInEx2 {
	public static void main(String[] args) {
		
		InputStream i=System.in;
		
		byte [] b=new byte[100];//들어갈 수 있는 문자의 바이트 크기 수
		
		System.out.println("이름: ");
		
		int name=0;
		
		try {
			name=i.read(b);//키보드 입력 문자 저장하고 읽음
			String result=new String(b, 0, name);
			System.out.println(result);
		} catch (IOException e) {
			
		}
		
		
		
		
		
		
		
		
	}

}
