package p01.generic_no;

import java.util.ArrayList;

public class generic_yesEx {
	public static void main(String[] args) {

		System.out.println("-------강제변환 없이 배열 데이터 수정하기-------");

		ArrayList a1 = new ArrayList();// 배열생성. 크기나 타입이 정해진 것 같진 않음. 즉, 맘대로 배열크기나 데이터 타입 첨가
		a1.add("홍길동");// 배열 데이터값 넣기
		a1.add(1);
		a1.add(12.55);
		a1.add(true);
		a1.add('a');
		a1.add(12.55f);

		// generic:데이터 타입을 정해주는 것. casting 안해도 됨. 메모리 절약.
		ArrayList<String> a2 = new ArrayList<String>();// 배열안에 있는 문자만 넣겠다
		a2.add("홍길동1");
		a2.add("홍길동2");
		a2.add("홍길동3");

		for (String i : a2) {
			System.out.println(i);
		}

		ArrayList<Integer> a3 = new ArrayList<Integer>();
		a3.add(1);
		a3.add(2);
		a3.add(3);

		for (Integer i : a3) {
			System.out.println(i);
		}

		System.out.println("-------Person Generic---------");

		ArrayList<Person> we = new ArrayList<Person>();
		we.add(new Person());
		we.add(new Person("radioactive"));

		for (Person i : we) {
			System.out.println(i);
		}

	}
}
