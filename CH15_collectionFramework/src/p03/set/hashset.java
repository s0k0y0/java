package p03.set;

import java.util.HashSet;
import java.util.Iterator;

//set 계열:주머니 속에 데이터를 넣고,가지고 오는 것. 데이터 저장순서가 없고 데이터값이 중복이 없다.
//hashSet은 hashtable과 관계가 있다.

public class hashset {

	public static void main(String[] args) {
		HashSet<Object> h=new HashSet<Object>();
		h.add("abc");//중복이 없으므로 첫번째 값이 이걸로 대체되서 결국은 크기 1의 배열값 하나임
		h.add(new String("abc"));
		h.add(new Person("홍길동", 20));//하지만 우리가 만든 클래스는 같은 값이라고 자바가 알아채지 못해 배열의 크기가 3이 나옴.
		h.add(new Person("홍길동", 20));//정상적으로 같은 내용을 하나로 인식하게 만들기 위해 hashcode,equals재정의 해줌
		
		//iterator()
		Iterator<Object> i=h.iterator();
		while(i.hasNext()) {
			System.out.println(i.next());
		}
			
		
		
		
		

	}

}

class Person{
	String name;
	int age;
	
	public Person(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	
	@Override
	public int hashCode() {
		return (name+age).hashCode();
	}
	
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Person) {
			Person p=(Person) obj;
			return this.name.equals(p.name)&&this.age==(p.age);
		}
		return false;
	}
	
	@Override
	public String toString() {
		return name+age;
	}
	
}