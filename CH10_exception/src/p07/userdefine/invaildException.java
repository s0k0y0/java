package p07.userdefine;

public class invaildException extends Exception {
	//super.:부모 클래스에 속한 메소드나 변수 불러오기
	//super():부모의 기본생성자 불러오기 
	public invaildException() {
		super("잘못된 명령입니다");
		
		
	}

}
