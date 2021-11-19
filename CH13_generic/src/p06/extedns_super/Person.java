package p06.extedns_super;

public class Person {
	
	private String name;

	public Person(String name) {
		super();
		this.name = name;
	}
	
	public String getName() {
		return name;
	}
	
	@Override
	public String toString() {
		return name;
	}
	
	

}


class worker extends Person{

	public worker(String name) {
		super(name);
	}
	
}


class student extends Person{

	public student(String name) {
		super(name);
		
	}
}

class highstudent extends Person{

	public highstudent(String name) {
		super(name);
	}
}
