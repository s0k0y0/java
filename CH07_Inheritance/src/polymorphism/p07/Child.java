package polymorphism.p07;

public class Child extends Parent {
	@Override
	public void method2() {
		System.out.println("Child_method2_overriding");
	}
	public void method3() {
		System.out.println("Child_method3_");
	}
}
