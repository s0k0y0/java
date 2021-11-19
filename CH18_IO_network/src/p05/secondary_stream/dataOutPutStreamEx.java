package p05.secondary_stream;

import java.io.DataOutput;
import java.io.DataOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class dataOutPutStreamEx {

	public static void main(String[] args) {
		
		FileOutputStream f=null;
		DataOutputStream d=null;

		try {

			f = new FileOutputStream("data.dat");// 주 stream
			d = new DataOutputStream(f);// 보조 stream. dataoutputStream은 기본형 타입 ( int , foalt ,long 등)을 byte 스트림으로 만들어서 출력하도록 한다
			//즉, data는 byte로 변환하여 저장. file은 file내용 출력
			
			int arr[] = { 0, 1, 2, 3, 4, 5 };

			for (int i=0; i<arr.length; i++) {//배열을 dat안에 저장해 주기 위해선 값 하나하나 write method로 저장해야함. 향상된 for문으로 하니까 실행되지도 않음ㅠㅜ
				d.writeInt(arr[i]);//int와 byte로 밖에 저장 못함. write와 read의 형식이 일치해야하는가 봄
			}

		} catch (FileNotFoundException e) {
			System.out.println("file not exist");
		} catch (IOException e) {//상위 클래스 exception일수록 가장 밑에 위치 해야함
			System.out.println("포괄적인 error 발생");
		} finally {
			
			try {
				d.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			
		}

	}

}
