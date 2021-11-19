package class9_30;

public class Dog {

	String name;
	String kind;
	
	public Dog(){
		
	}
	
	//파라미터가 있는 생성자(생정자:객체를 생성할떄 값을 넣어놓고 값을 저장하겠다!)
	public Dog(String name, String kind) {
		//super();
		this.name = name;
		this.kind = kind;
	}
	
	@Override
	public String toString() {
		return name+kind;
	}

}
