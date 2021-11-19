package p03.hashcode;

import java.util.HashMap;

public class keyEx {

//Map<key,value>:자료가 key와 value쌍으로 되어 있는 경우 ex)key:홍길동. value:20으로 홍길동 값으로 value를 찾음
//인터페이스를 구현한 클래스

	public static void main(String[] args) {

		HashMap<key, String> Map = new HashMap<>();// key,value는 모두 클래스===객체임. 객체 생성시, 데이터 타입을 지정해야함
		Map.put(new key(1), new String("홍길동"));//hashmap클래스의 put메소드로 key와 value값 넣어주기
		String result=Map.get(new key(1));
		System.out.println(result);
		
		System.out.println("---------------------");
		
		HashMap<String, Integer> Ma=new HashMap<>();
		Ma.put(new String("sky"), new Integer(20) );
		
		Integer result2=Ma.get(new String("sky"));
		System.out.println(result2);
		System.out.println(Ma.hashCode());
		

	}

}
