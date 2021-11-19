package p00.arraylist;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Vector;

public class vectorTest {
	public static void main(String[] args) {

		Vector<String> v=new Vector<String>();//동기화 내용이 추가가 되서 시스템 내용이 복잡해 속도가 느려 arraylist를 더 자주씀
		
		v.add("서울");
		v.add("춘천");
		v.add("광주");
		v.add("대구");
		v.add("부산");
		
		System.out.println("출력방법1");
		
		for(int i=0; i<v.size(); i++) {
			System.out.println("v.get("+i+")"+v.get(i));
		}
		
		System.out.println("출력방법2");
		
		Iterator<String> i=v.iterator();
		while(i.hasNext()) {
			System.out.println(i.next());
		}
		
		System.out.println("출력방법3");
		
		Enumeration<String> e=v.elements();
		while(e.hasMoreElements()) {
			System.out.println(e.nextElement());
		}
		
		
	}

}
