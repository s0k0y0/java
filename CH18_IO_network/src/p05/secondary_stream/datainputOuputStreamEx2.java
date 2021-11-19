package p05.secondary_stream;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class datainputOuputStreamEx2 {

	public static void main(String[] args) {//오류남....값이 출력이 안됨

		FileOutputStream f = null;
		DataOutputStream d = null;
		try {
			f = new FileOutputStream("tem4.txt");
			d = new DataOutputStream(f);

			d.writeUTF("홍길동");
			d.writeUTF("메아리");

		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				d.flush();
				d.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

		
		
		
		FileInputStream f2;
		DataInputStream d2 = null;

		try {

			f2 = new FileInputStream("tem4.txt");
			d2 = new DataInputStream(f2);

			for(int i=0; i<2; i++) {
				String result=d2.readUTF();
				System.out.println(result);
			}

		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				d2.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

	}

}
