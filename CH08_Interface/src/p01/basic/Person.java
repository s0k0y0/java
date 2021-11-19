package p01.basic;

class child {
	String name1;
	String name2;

	public child(String name1, String name2) {
		this.name1 = name1;
		this.name2 = name2;
	}

	public void getname1(String name1) {//저장된 내용을 가져오기 
		this.name1 = name1;
	}

	public String putname1() {//저장된 내용을 출력하기
		return name1;
	}
	
	public void getname2(String name2) {
		this.name2= name2;
	}

	public String putname2() {
		return name2;
	}
	
	
	

}

class child2 {
	String name3;
	String name4;
}

public class Person {

	public static void main(String[] args) {

		// 변수저장 및 출력
		child2 key = new child2();
		key.name3="홍길동1";
		key.name4="홍길동10";
		System.out.println(key.name3);
		System.out.println(key.name4);

		// 생정자 저장 및 출력
		child s1 = new child("홍길동2", "홍길동20");
		System.out.println(s1.name1+","+s1.name2);//s1만 적을 경우, 주소값이 출려되기에 항상 정확한 변수나 메소드 한가지를 가르켜줘야함

		// 메소드를 통한 저장과 출력
		s1.getname1("홍길동3");
		System.out.println(s1.putname1());
		s1.getname2("홍길동30");
		System.out.println(s1.putname2());
		
	}
	
	//super. :부모 클래스에 속해있다는 표시
	//super():부모 클래스에 생성자 메소드를 호출한다. 

}
