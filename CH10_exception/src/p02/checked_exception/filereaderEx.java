package p02.checked_exception;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

//Checked Exception:바로 에러 표시가 나는 것. 컴파일시 예외발생으로 반드시 try-catch로 처리해야 함

public class filereaderEx {

	public static void main(String[] args) {
		
		BufferedReader b=null;
		try {
			FileReader f=new FileReader("text.txt");//txt파일을 불러와서 읽으려고 했지만 text 파일이 없을 경우 catch내용을 시행
			b=new BufferedReader(f);//파일을 인터넷에서 가져와서 임시 저장한다
			String str=null;
			do {
				str=b.readLine();//txt파일의 내용을 불러오기
				System.out.println(str);	
			}while(!(str==null));//값이 없을때가 아니면 다시 do문 실행. 즉, txt파일의 한줄이 값이 없을때까지 출력해줄 수 있음
		} catch (FileNotFoundException e) {
			System.out.println("파일이 위치에 없음");
		} catch (IOException e) {
			
		} 
		System.out.println("Done");
		try {
			b.close();
		} catch (IOException e) {
			
		}
		
		
		//FileReader 객체 생성>객체 생성과 동시에 불러올 파일 작성
		//budder:임시저장하고 수정삭제가능
		
		
	}

}
