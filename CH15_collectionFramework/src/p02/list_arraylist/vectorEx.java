package p02.list_arraylist;

import java.util.Enumeration;
import java.util.Vector;

//vector:arraylist와 마찬가지고 list를 상속받은 list를 계열이다. 자료가 순서적이고 중복적으로 이루어짐. 동기화 프로세스로 속도가 느림
public class vectorEx {
	public static void main(String[] args) {

		Vector<emp> v = new Vector<emp>();// String 배열값인 배열 만듬?
		v.add(new emp("name", "3635", "263646"));
		v.add(new emp("name2","46457","453543"));
		
		for (emp i : v) {//
			
			String ename=i.name;
			String etel=i.tel;
			String ead=i.address;
			System.out.println(ename+"."+etel+"."+ead);
			//System.out.println(i); 내용이 나올려면 내가 만든 클래스라서 toString이 나와야 함. 자바 개발자가 만든 String, Integer는 toString이 없어도 바로 출력될 수 있다.
		}
		
		//백텨의 용량
		int a=v.capacity();
		System.out.println(a);
		
		//백터의 크기
		int a2=v.size();
		System.out.println(a2);
		
		Enumeration<emp> e=v.elements();//!!!!!!어떤 프로세슨지 이해하고 넘어가기ㅠㅜ
		while(e.hasMoreElements()) {
			emp result=e.nextElement();
			String ename=result.name;
			String etel=result.tel;
			String ead=result.address;
			System.out.println(ename+"."+etel+"."+ead);
			
		}
		
		

	}
}

class emp {
	String name;
	String tel;
	String address;

	public emp(String name, String tel, String address) {
		super();
		this.name = name;
		this.tel = tel;
		this.address = address;
	}
	

}