package p15.format;

import java.text.MessageFormat;

public class messageFormatEx {

	public static void main(String[] args) {

		String name = "cust_info";
		String m = "inser into " + name + " values(''{0}'',''{1}'',''{2}'',''{3}'');";// arguments 한줄의 배열의 내용을 하나씩 순서대로
																						// 넣겠다
		Object[][] aruguments = { 
				{ "홍길동1", "283473", "27", "07-09" },
				{ "홍길동2", "283473", "27", "07-09" },

		};

		for (int i = 0; i < aruguments.length; i++) {

			String result = MessageFormat.format(m, aruguments[i]);
			System.out.println(result);
		}

	}

}
