package last.practic;

public class Child {
	
	private String name;
	
	private Child() {
		this("홍길동");
		System.out.println("Child() call");
	}

	public Child(String name) {
		super();
		this.name = name;
		System.out.println("Child(Stirng name) call");
	}
	
	
	
	
}
