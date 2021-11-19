package p00.arraylist;

import java.util.Hashtable;
import java.util.Iterator;
import java.util.Set;

public class hashtable {

	public static void main(String[] args) {
		
		Hashtable<String, String> h=new Hashtable<>();
		//hashmap과 달리 동기화기능이 남아있어 데이터 처리 속도 느림
		
		h.put("driver", "orcle.jdbc.driver.OracleDriver");
		h.put("url", "jdbc:oracle:thin:@localhost:1521:orcl");
		h.put("username", "java");
		h.put("password", "java");

		System.out.println("출력방법1");
		
		System.out.println(h.get("driver"));
		System.out.println(h.get("url"));
		System.out.println(h.get("username"));
		System.out.println(h.get("password"));
		

		//ket로 출력하기
		System.out.println("출력방법2");
		
		Set<String> key=h.keySet();//key값을 츨력하는 방법???
		Iterator<String> i=key.iterator();
		
		while(i.hasNext()) {
			System.out.println(i.next());
		}
		
 		

	}

}
