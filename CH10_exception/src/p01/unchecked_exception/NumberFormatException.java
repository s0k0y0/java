package p01.unchecked_exception;

public class NumberFormatException {

	public static void main(String[] args) {
		String data1 = "100";
		String data2 = "a100";

		int a = Integer.parseInt(data1);// 문자열을 숫자로 변환

		try {

			int b = Integer.parseInt(data2);
			int result = a + b;
			System.out.println(data1 + " " + data1 + "=" + result);

		} catch (java.lang.NumberFormatException e) {
			System.out.println("data2를 숫자변환할 수 없음");
		}

		
		
		// 배열로 입력해서 결과 나오기
//		String[] we = new String[2];
//		we[0] = new String("100");
//		we[1] = new String("a100");

		try {
			int c = Integer.parseInt(args[0]);//argumetns에 값을 넣어 결과 처리하기
			int d = Integer.parseInt(args[1]);
			int result = c + d;
			System.out.println(result);
		} catch (java.lang.NumberFormatException e) {
			System.out.println("숫자로 변환할 수 없음");
		}
		
		
		
		
		
		
		

	}

}
