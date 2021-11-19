package p02.nested_class;

//outer class
class A {// 중첩 클래스:하나의 클래스안에 또 다른 클래스가 있는 것.내부와 외부 클래스로 나뉘고 3가지 이너 클래스가 존재
//inner class

	public A() {
		System.out.println("A기본 생성자");
	}

	class B {// instance inner class

		public B() {
			System.out.println("B기본 생성자");
		}

		int field1;
		//static int field2;..중첩 클래스안에 static은 사용할 수 없음

		void method1() {
		};

		//static void method2() {};

	}

	static class C {// static inner class. out class에서는 static이 붙을 수 없음.중첩클래스만 static가능!
		public C() {
			System.out.println("C기본 생성자");
		}

		int field1;
		static int field2;//static class이어야지만 사용 가능

		void method1() {
		};

		static void method2() {
		};

	}

	void method() { // 로컬 변수:메소드 안에서 선언된 변수.초기화 반드시 해야함
		class D {// local inner class:method 안에 들어있는 클래스
			public D() {
				System.out.println("D기본 생성자");
			}

			int field1;
			//static int field2;

			void method1() {
			};

			//static void method2() {}; method안의 클래스라도 static은 사용 불가능

		}

		D d = new D();
		System.out.println(d.field1);
//		System.out.println(d.field2);
		d.method1();
//		d.method2();

	}
}

class external {// 중첩 클래스가 아님

}