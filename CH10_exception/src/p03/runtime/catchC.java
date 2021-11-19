package p03.runtime;

public class catchC {
	public static void main(String[] args) {

		try {

			String data1 = args[0];
			String data2 = args[1];

			int a=Integer.parseInt(data1);
			int b=Integer.parseInt(data2);
			
			int result=a+b;
			System.out.println(result);

		} catch (ArrayIndexOutOfBoundsException|NumberFormatException e) {
			//실행값 부족하거나 숫자로 캐스팅할 수 없을 경우 모두 포함해서 에러 캐치
			
			System.out.println("실행 값 부족or문자열로 캐스팅 불가");

		} catch (Exception e) {
			System.out.println("알 수 없는 발생");
		} finally {// 항상 실행되는 블록
			System.out.println("다시 실행");
		}

	}
}
