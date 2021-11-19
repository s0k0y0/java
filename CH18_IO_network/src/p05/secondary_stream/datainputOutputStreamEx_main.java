package p05.secondary_stream;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;

public class datainputOutputStreamEx_main {

	public static void main(String[] args) {

		PrintStream p = null;
		FileOutputStream f = null;

		try {

			f = new FileOutputStream("tem4.txt");
			p = new PrintStream(f);

			char[] arr = new char[100];

			while (true) {
				p.print(arr);
			}
		} catch (FileNotFoundException e) {
			System.out.println("File Not Found");
		} finally {

			try {
				f.close();
				p.close();

			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		}

	}

}
