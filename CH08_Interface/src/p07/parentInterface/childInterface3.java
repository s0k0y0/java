package p07.parentInterface;

public interface childInterface3 extends ParentInterface{
	
	
	@Override
	public void method2();//부모 클래스에 있던 디폴트 메소드를 추상메소드로 오버라이딩 했음
	
	
	public void method3();//child1,2와 다른 메소드. 즉, 서로 이름만 같은 다른 메소드이다.
	
	
}
