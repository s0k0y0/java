package p07.parentInterface;

public interface childInterface2 extends ParentInterface {
	
	
	
	@Override
	default void method2() {//부모 클래스의 디폴트 메소드 그대로 가져옴
		
		
	}
	
	
	
	public void method3();//child1과는 이름은 같지만 다른 메소드 같음
	
	
	
	
}
