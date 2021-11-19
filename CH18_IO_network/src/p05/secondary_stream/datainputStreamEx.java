package p05.secondary_stream;

import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class datainputStreamEx {
	public static void main(String[] args) {

	FileInputStream f=null;
	DataInputStream d=null;
	
	try {
		
		f = new FileInputStream("data.dat");//주 스트림을 이용해 파일 내용을 가져온다
		d=new DataInputStream(f);//이건 reader,writer보조가 없음으로 안에든 데이터를 byte로 변환하고 출력할 수 있는 스트림
		

		while(true) {//값이 여러개라 반복문 돌려서 출력해야함
			
			int data=d.readInt();//??write read both int 제거했는데 오류남....->애초에 int,byte밖에 출력 못해서 그럼. 그리고 배열이 int인데 그냥 read()는 byte타입임
			System.out.println(data);
	
		}
		
	} catch (FileNotFoundException e) {
		System.out.println("file 없음");
	} catch (IOException e) {
		System.out.println("포괄적 예외 발생(file 읽을 수 없음)");
	} finally {
		
		try {
			
			d.close();
		} catch (IOException e) {
			System.out.println("file 종료 오류");
		}
		
	}
	
	
	
	
	
	
	
	}
}
