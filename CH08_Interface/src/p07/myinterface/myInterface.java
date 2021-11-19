package p07.myinterface;

public interface myInterface {
	public void method1();
	
	public default void method2() {
		System.out.println("mehtod2");
	}
	
}
