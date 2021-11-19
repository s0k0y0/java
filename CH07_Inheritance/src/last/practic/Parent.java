package last.practic;

public class Parent {
	public String nation;
	
	public Parent() {
		this("대한민국");
		System.out.println("Parent() call");
	}
	
	public Parent(String naion) {
		this.nation=naion;
		System.out.println("Parent(String nation) call");
	}
	
	
	
	
}
