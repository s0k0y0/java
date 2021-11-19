package p01.unchecked_exception;

class Animal {
}

class Dog extends Animal {
}

class Cat extends Animal {
}

public class ClassCastException {
	public static void main(String[] args) {

		Dog d = new Dog();
		changeDog(d);
		Cat c = new Cat();
		changeDog(c);     //Dog와는 형제관계라서 형변환 불가능

	}

	public static void changeDog(Animal a) {// 본인 포함 자식의 모든 메소드와 변수가 들어올 수 있는 파라미터의 다형성. 다형성의 대표적인 장점
		if (a instanceof Dog) {// Dog클래스로 변환할 수 있냐?
			Dog d = (Dog) a;// a에 들어오는 변수가 Cat을 제외하고는 모두 형변환 가능
			System.out.println("0");
		} else {
			System.out.println("X: ClassCastingException");
		}

	}

}
