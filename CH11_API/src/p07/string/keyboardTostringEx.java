package p07.string;

import java.io.IOException;

public class keyboardTostringEx {
	public static void main(String[] args) throws IOException {
		
		byte[] b=new byte[100];
		int re=System.in.read(b);
		//여기서 읽은 바이트를 저장하기 위해 위의 배열이 생성된. 즉, 읽고 저장이 주체
		//1.키보드 입력내용을 배열(b)에 저장한다  2.키보드 입력내용의 총 바이트수 변수(re)에 저장
		
		System.out.println(re-2);//엔터 10,13때문에 +2의 바이트 갯수로 출력됨
		
		for(int i=0; i<b.length; i++) {
			System.out.println(b[i]);
		}
		
		System.out.println("-----------------");
		
		String we2=new String(b,0,re-2);//re-2는 엔터를 침으로써 나오는 아스키 코드 13,10을 없애기 위해. 근데 문자갯수보다 +2로 계속 출력됨 왜지ㅠㅜㅠㅜ
		System.out.println(re);
		
	}

}
