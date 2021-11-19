package p05.subStream;

import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class inputStreamEx2 {

	public static void main(String[] args) {

		InputStream i = System.in;// 주 스트림. 키보드 입력
		InputStreamReader i2 = new InputStreamReader(i);// 보조 스트림. 문자로 입력할 수 있어 문자 저장

		int name = 0;// 키보드 입력 문자 저장할 변수?

		char[] arr = new char[200];// 글자 제한

		
		try {
			
			while ((name=i2.read(arr)) != -1) {//이중 조건임. 1.읽어오는 내용은 arr다가 아닌 name크기만 2.arr이면서 동시에 name이 빈칸이 아니라면 while문장 지속 실행
				String data = new String(arr, 0, name);
				System.out.println(data);
			}
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				i2.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

	}

}
