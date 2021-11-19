package p04.fileInputStream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class fileInputStreamEx2 {

	public static void main(String[] args) {

		FileInputStream f = null;

		try {

			f = new FileInputStream("tem.txt");
			
			byte[] arr=new byte[10];//출력할 문자의 갯수? 크기?
			
			
			for(int i=0; i<arr.length; i++) {
			f.read(arr);//tem.txt의 내용 읽어오기. 출력까지는 아님
			System.out.println(arr[i]);
			}
			
			
		} catch (FileNotFoundException e) {
			System.out.println("file error");
		} catch (IOException e) {
			System.out.println("error");
		} finally {
			try {
				f.close();
			} catch (IOException e) {
				System.out.println("close error");
			}
		}

	}

}
