package p01.intefaces;

public class interface_Main {

	public static void main(String[] args) {

		// 1.객체생성
		interface_Sub all = new interface_Sub();
		System.out.println(all.a);
		all.add();// override한 메소드를 사용한다.
		all.add2();
		interfaceEx1.add3();// static method는 절대 가이드 라인을 부모 클래스에서 호출해야 함
		all.subtract();

		// 2.인터페이스의 다향성:다향화 하는 건 부모의 데이터 타입으로 자식 클래스를 instance화 하기
		interfaceEx1 i = new interface_Sub();
		System.out.println(i.a);
		i.add();// override한 메소드를 사용한다.
		i.add2();
		interfaceEx1.add3();// static method는 호출이 달라야 한다
		((interface_Sub) i).subtract();// 자식 클래스에 있어 강제 형변환 실행해야 함.

		// 3.인터페이스의 다형성2:
		interfaceEx1 i2 = new interface_Sub();
		interface_Sub ii = (interface_Sub) i2;// 위의 method자체를 강제변환 것과 다르게 class 자체를 casting 함.
		System.out.println(ii.a);
		ii.add();// override한 메소드를 사용한다.
		ii.add2();
		interfaceEx1.add3();
		ii.subtract();

		// 4.Anonymous(익명) 구현 객체:자식 클래스를 만들지 않고 인터페이스라도 객체를 만들어 쓸 수 있는 유일한 방법?
		//일반 클래스,추상 클래스, 인터페이스에서 씀
		interfaceEx1 i3 = new interfaceEx1() {

			@Override
			public void add() {// 자식클래스는 없지만 이 안에 내용으로 객체 생성을 대신함??
				System.out.println("Anonymous method");

			}
		};
		System.out.println(i3.a);
		i3.add();
		i3.add2();
		interfaceEx1.add3();
		// ((interface_Sub) i3).subtract();

		// null:알 수 없는 어떤 값. 0도 아니고 공백도 아닌
		interfaceEx1 it2 = null;
		it2 = new interface_Sub();
		System.out.println(it2.a);
		it2.add();// override한 메소드를 사용한다.
		it2.add2();
		interfaceEx1.add3();

	}

}
