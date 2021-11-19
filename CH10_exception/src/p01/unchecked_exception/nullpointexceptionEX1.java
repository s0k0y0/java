package p01.unchecked_exception;

public class nullpointexceptionEX1{

	public static void main(String[] args) {

		String data = null;

		try {
			System.out.println(data);//data는 null값으로 출력되고 밑의 toString은 에러가 남으로 에러대신 catch의 문장 출력
			System.out.println(data.toString());
		} catch (NullPointerException e) {
			System.out.println("값이 들어있지 않음");
			// e.printStackTrace();
		} 

	}
}
