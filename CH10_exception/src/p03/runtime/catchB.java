package p03.runtime;

public class catchB {

	public static void main(String[] args) {

		
		
		try {
			
			String data1=args[0];
			String data2=args[1];
			
			int a=Integer.parseInt(data1);
			int b=Integer.parseInt(data2);
			
			int result=a+b;
			System.out.println(result);
			
		} catch (ArrayIndexOutOfBoundsException e) {//args값이 배열에 비해 부족할 때 에러. 가장 첫번째 에러에서 걸리면 그 다음 catch시행하지 않음
			
			System.out.println("실행 값 부족");
			
		} catch (NumberFormatException e) {//캐스팅 불가 에러명
			System.out.println("숫자로 변환 불가능");
		} finally {//항상 실행되는 블록
			System.out.println("다시 실행");
		}
		
		
		
		
		
		
		
		
		
	}

}
