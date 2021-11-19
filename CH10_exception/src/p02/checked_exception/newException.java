package p02.checked_exception;

public class newException {
	public static void main(String[] args) throws Exception {
		int sum = 1 + -2;// 1+(-2)라는 뜻
		
		if (sum < 0)//0보다 작을 경우 try와 catch를 실행. catch까지 실행되는 이유는 try가 throw즉 예외로 처리되는 문장이라서
			try {
				throw new Exception("Checked Exception 발생");
			} catch (Exception e) {
				System.out.println("throw로 던진것을 catch로 받음");
				System.out.println(e.getMessage());
			}
		
		
			System.out.println(sum);

		System.out.println();
	}
}
