package p05.subStream;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;

public class outputStreamWriter {

	public static void main(String[] args) {

		FileOutputStream f = null;
		OutputStreamWriter o = null;
		try {

			f = new FileOutputStream("tem3.txt");
			o = new OutputStreamWriter(f);

			
			String data = "can";
			o.write(data);//data저장함

			
		} catch (FileNotFoundException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				o.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

	}

}
