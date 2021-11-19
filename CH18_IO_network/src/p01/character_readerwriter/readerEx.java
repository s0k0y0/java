package p01.character_readerwriter;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class readerEx {
	public static void main(String[] args) {

		FileReader f = null;

		try {
			f = new FileReader("fw.txt");
			while (true) {
				int data = f.read();//텍스트 내용의 아스키 코드값 읽어오기
				if (data == -1) {//byte가 없을때 멈춤도록 한다. if 문장빠져나가기 위해 break;
					break;
				}
				char result = (char) data;//data는 int타입의 아스키 코드값을 담고 있는 것으로 이걸 char타입으로 변환해서 문자로 전환해야함
				System.out.println("data: " + data);
				System.out.println("result: " + result);
			}
		} catch (FileNotFoundException e) {

		} catch (IOException e) {
			System.out.println("read에 문제있음");
		} finally {
			try {
				f.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

	}
}