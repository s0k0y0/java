package p06.protectedd;

public class B {
	public void method() {//접근 제한 전혀 없음
		A a=new A();//같은 패키지 내임으로 접근 가능
		a.field="value";
		a.method();
	}
}
