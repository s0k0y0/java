package p07.userdefine;

public class invalid_main {
	public static void main(String[] args) {

		try {
			
			int result = subtract(5, 10);//3단계 오류
			System.out.println(result);
		} catch (invaildException e) {
			
			System.out.println(e.getMessage());//우리가 만든 예외처리명의 기본생성자안에 있는 super String문장이 출력되는 메소드:get.message
			
		}
	}

	static int subtract(int a, int b) throws invaildException {//2단계 오류
		if (a < b)//맞는 틀리든 무조건 try로 감. 거기서 맞으면 숫자 출력/틀리면 getmessage출력
			throw new invaildException();//맞든 틀리든 무조건 예외처리 하겠다 1단계 오류

		return b;

	}

}
