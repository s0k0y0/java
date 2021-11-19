package p01.unchecked_exception;

//Exception들이 밑과 같이 여러개 있을 경우는 자식 Exception이 상단에 오고, 부모 Exception이 하단에 위치하도록 한다

public class ArrayExceptionEx1 {
	public static void main(String[] args) {
		int arr[] = { 5, 4, 3, 2, 1, 0 };

		for (int i = 0; i < 10; i++) {
			try {//try문장이 에러날 경우 예외처리로 catch의 문장을 시행하겠다
				
				int result = 100 / arr[i];
				System.out.println(result);
				
			} catch (ArrayIndexOutOfBoundsException e) {//예외 경우에도 순서가 존재한다!!!밑에 0나누기 에러랑 배열 예외 에러 클래스는 서로 위치 바꿔도 됨
				
				System.out.println("배열 첨자의 예외발생");
			
				
			}catch (ArithmeticException e) {//catch:에러명 및 예외처리로 나올 문장이나 다른 조건
				
				System.out.println("숫자를 0으로 나눌때 에러 발생");
				
				
			} catch (Exception e) {//Exception은 예외 처리 클래스 중 가장 상위 부모클래스이므로 가장 하단에 위치해야 한다
				
				System.out.println("일반적인 예외");
				
			}
//			System.out.println("Done");
		}

	}
}
