package p10.static_;

public class Bank {
		//singleton pattern:유일한 하나의 객체만 생성해서 사용.해당 클래스에 메소드를 만들어 놓고, 계속해서 생성된 객체만 호출
		String name;

		private Bank(String name) {
			this.name = name;
		}
		
		private static Bank b=new Bank("신한은행");
		//singletone:static을 붇인 객체 생성으로 해당 클래스의 다른 객체를 생성해도 위의 최초로 생성된 static객체를 반환해준다
		//어차피 객체 생성을 다시 하게 되면 기존의 있는 클래스를 또 따로 공간을 만들어 복사하는 것과 같아서 메모리의 공간을 줄이기 위해 static객체를 사용하도록 한다.
		
		public String getName() {
			return name;
		}
		
		public static Bank getB() {//객체 생성이 불가하기에 객체 생성 대신 호출해서 출력해주는 역할??
			return b;//주소값만 넘겨줌
		}
		
		
}

