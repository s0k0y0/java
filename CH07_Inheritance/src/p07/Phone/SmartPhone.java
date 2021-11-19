package p07.Phone;

public class SmartPhone implements Phone {
	public String owner;
	
	
	public SmartPhone() {
		// TODO Auto-generated constructor stub
	}
	
	public SmartPhone(String owner) {
		this.owner=owner;
	}

	public void Search() {
		System.out.println(owner+"Search");
	}
	
}
