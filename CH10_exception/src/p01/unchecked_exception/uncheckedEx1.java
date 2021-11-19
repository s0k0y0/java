package p01.unchecked_exception;

//exception's unchecked:컴파일시 예와발생(코드 작성시 바로 예외로 처리되는 것)
//exception's checked:실행시 예외처리
//ArithmeticException:연산의 예외 발생(0으로 나누려 할때)

public class uncheckedEx1 {
	
	public static void main(String[] args) {
	
		int num1=2, num2=0;//컴파일 상의에러는 없지만 실행시 에러생김	
		try {
			int result=num1/num2;
			System.out.println(result);
			
		}catch (ArithmeticException e) {//어떤 숫자를 0으로 나누려고 할때 발생하는 에러. 즉, try문장을 실행할려 했지만 에러 발생으로 catch문장 시행
			System.out.println("숫자를 0으로 나눌 수 없다");
//			e.printStackTrace();
		}catch (Exception e) {
			System.out.println("일반적인 예외처리 경우");
//			e.printStackTrace();
		}
		
		System.out.println("프로그램 종료");
		
		
		
		
		
		
		
		
		
		
		
		
	}	
}
