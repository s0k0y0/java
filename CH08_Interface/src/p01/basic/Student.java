package p01.basic;

public class Student {
	String name;
	int age;
	String Num;
	String Skill;
	String address;
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getNum() {
		return Num;
	}
	public void setNum(String num) {
		Num = num;
	}
	public String getSkill() {
		return Skill;
	}
	public void setSkill(String skill) {
		Skill = skill;
	}
	public String getAddress() {//address 변수 저장
		return address;
	}
	public void setAddress(String address) {//address 저장된 변수를 출력
		this.address = address;
	}
	
	public void print() {
		System.out.println("name:"+name);
		System.out.println("age: "+getAge());
		System.out.println("phone: "+getNum());
		System.out.println("favorite: "+getSkill());
		System.out.println("address: "+getAddress());
	}
	
	//sourse-generate getter and setter
	
}
