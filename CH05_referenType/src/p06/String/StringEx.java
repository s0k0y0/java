package p06.String;

public class StringEx {

	public static void main(String[] args) {
		String str1="홀길동";//객체생성
		String str2="홀길동";//객체생성이 아닌 str1을 가리키는 것.
		
		String str3=new String("홀길동");//새로운 객체생성
		String str4=new String("홀길동");//새로운 객체생성
		
		
		
		if(str1==str2) {
			System.out.println("참조 같음");
		} else {
			System.out.println("참조 다름");
		}
		
		
		System.out.println("----------------");
		//==:수치비교, 주소값을 비교하게 됨
		//equal():변수안에 들어있는 객체자체를 비교
		if(str2==str3) {
			System.out.println("참조 같음");
		} else {
			System.out.println("참조 다름");
		}
		if(str2.equals(str3)) {
			System.out.println("참조 같음");
		} else {
			System.out.println("참조 다름");
		}
		
		
		System.out.println("------------------");
		if(str3==str4) {
			System.out.println("참조 같음");
		} else {
			System.out.println("참조 다름");
		}
		//equal():변수가 담고있는 객체 자체와 문자를 비교
		if(str4.equals(str3)) {
			System.out.println("참조 같음");
		} else {
			System.out.println("참조 다름");
		}
		
		
		
		
	}

}
