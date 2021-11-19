package p06.classclass;

class Car {
};

public class classclass {
//?: ? extends Car를 의미하고 있음. car,car자식 클래스가 물음표에 해당됨
	public static void main(String[] args) {

		Car c = new Car();
		Class<?> we = c.getClass();

		System.out.println(we.getName());//해당 페이지 클래스 의미

		System.out.println("----------------");
		
		try {
			Class<?> we2 = Class.forName("p06.classclass.Car");//해당 페이지의 클래스를 이름 찾아서 출력
			System.out.println(we2.getName());
		} catch (ClassNotFoundException e) {
			System.out.println("Class not Found");
		}

	}

}
