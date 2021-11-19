package p04.fileInputStream;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class fileOutputStreamEx2 {

	public static void main(String[] args) {

		FileOutputStream f = null;
		try {

			f = new FileOutputStream("tem.txt");

			int[] arr = { 1, 2, 3, 3, 4, 5 };

			for (int i = 0; i < arr.length; i++) {//write는 한번에 하나씩 밖에 못 저장해서 저장 회로 돌려야 함
				
				f.write(arr[i]);// write method의 데이터 타입으로 올 수 있는 건 int와 byte. 다른 건 저장할 수 없음. 
				//그리고 입력값 하나씩 밖에 저장 못함. 마지막으로 integer타입을 저장할 수 있긴 한데 하나의 4byte라서 1byte만 읽는 outstream으로는 문자 정상 출력 불가임
								
			}

			

		} catch (FileNotFoundException e) {
			System.out.println("file not found");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				f.close();
			} catch (IOException e) {
				System.out.println("close error");
			}
		}

	}

}
