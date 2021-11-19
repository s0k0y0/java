package p13.access;

public class A {//class는 public과 default만 사용가능 +추가적으로 abstract,final도 있음
				//static은 원래 안되지만 중첩클래스에서는 static가능해짐
	
	//젼역변수 접근
	public int a;//암나 사용
	protected int c;//같은 패키지 or 상속관계에서만
	int b;//같은 패키지 안에서만
	private int d;//클래스 안만 가능
	
	//메소드 접근
	public void we1() {

	}
	protected void we2() {

	}
	private void we3() {

	}
	void we4() {

	}
	
	//생성자 접근
	public A() {
		// TODO Auto-generated constructor stub
	}
	protected A(int a) {
		// TODO Auto-generated constructor stub
	}
	private A(String a) {
		// TODO Auto-generated constructor stub
	}
	A(float a) {
		// TODO Auto-generated constructor stub
	}
	
	
	
	
}
