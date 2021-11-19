package p02.list_arraylist;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

//linkedlist:list계열로 자료의 삭제와 삽입이 arraylist보다 자주 수정이 일어날떄 사용한다

public class linkedListEx1 {

	public static void main(String[] args) {
		
		LinkedList<String> l=new LinkedList<String>();
		l.add("a");
		l.add("b");
		l.add(2,"k");
		l.set(0, "s");//0번 인덱스에다가 s라는 문자를 집어넣겠다
		l.remove(1);//인덱스1 내용을 지우겠다
		
		System.out.println(l);//개발자 클래스 타입이라서 그냥 출력될 수 있음
		
		for(String s:l) {
			System.out.println(s);
		}
		
		Iterator<String> i=l.iterator();
		while(i.hasNext()) {
			System.out.println(i.next());
		}
		
		

	}

}
