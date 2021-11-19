package p07.parentInterface;

public interface ParentInterface {//interface는 class를 상속받을 수 없다. 즉, 부모역할만 가능한 것
	
	
	public void method1();//추상메소드
	
	
	
	public default void method2() {//default 메소드
		
	}

}
