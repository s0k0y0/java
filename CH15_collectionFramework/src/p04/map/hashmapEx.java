package p04.map;

import java.util.HashMap;

public class hashmapEx {
	public static void main(String[] args) {

		//개발자가 만든 해쉬맵
		HashMap<String, Integer> h1=new HashMap<String, Integer>();
		h1.put("홍길동", 20);
		h1.put("홍길동2", 30);
		h1.put("홍길동3", 40);
		System.out.println(h1.get("홍길동"));
		System.out.println(h1.get("홍길동2"));
		System.out.println(h1.get("홍길동3"));
		
		
		//내가 만든 해쉬맵
		HashMap<main, String> h2=new HashMap<main, String>();
		h2.put(new main("홍길동","홍"), "20"); 
		h2.put(new main("홍길동2","홍"), "30");
		h2.put(new main("홍길동3","홍"), "40");
		System.out.println(h2.get(new main("홍길동","홍")));
		System.out.println(h2.get(new main("홍길동2","홍")));
		System.out.println(h2.get(new main("홍길동3","홍")));
		

		
		
		
		
		
		
	}
}

class main{
	
	String firstname;
	String lastname;
	
	public main(String firstname, String lastname) {
		this.firstname=firstname;
		this.lastname=lastname;
	}
	
	@Override
	public int hashCode() {//key값에 넣으려는 변수를 리턴해주는 것. 비교하는 것은 변수 자체가 아닌 변수의 해쉬코드 정수값이라는 것
		return this.lastname.hashCode()+this.firstname.hashCode();
	}
	
	@Override
	public boolean equals(Object o) {
		if(o instanceof main) {
			main m=(main)o;
			return this.firstname.equals(m.firstname)&&this.lastname.equals(m.lastname);
		}
		return false;
	}
	
	
	
	
	
	
}