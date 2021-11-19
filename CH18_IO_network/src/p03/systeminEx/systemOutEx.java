package p03.systeminEx;

import java.io.IOException;
import java.io.OutputStream;

public class systemOutEx {
	public static void main(String[] args) throws IOException {

		OutputStream o = System.out;

		for (byte b = 48; b < 58; b++) {

			o.write(b);// 아스키 코드 써서 저장하자
		}
		
		o.flush();

	}
}
