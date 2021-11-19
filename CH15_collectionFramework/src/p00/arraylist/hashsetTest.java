package p00.arraylist;

import java.util.HashSet;
import java.util.Iterator;

public class hashsetTest {

	public static void main(String[] args) {
		
		HashSet<String> h=new HashSet<String>();
		
		if(h.add("korea")) {
			System.out.println("first korea add success");
			
		} else {
			System.out.println("fires korea add fail");
		}
		
		if(h.add("japan")) {
			System.out.println("first japan add success");
			
		} else {
			System.out.println("fires japan add fail");
		}
		
		if(h.add("america")) {
			System.out.println("first america add success");
			
		} else {
			System.out.println("fires america add fail");
		}
		
		if(h.add("britain")) {
			System.out.println("first britain add success");
			
		} else {
			System.out.println("fires britain add fail");
		}
		
		if(h.add("korea")) {
			System.out.println("second korea add success");
			
		} else {
			System.out.println("second korea add fail");
		}
		
		//출력방법2
		Iterator<String> i=h.iterator();//hashcodelist 출력방법 중 하나
		while(i.hasNext()) {
			System.out.println(i.next());
		}
		

	}

}


class hash{//이거는 우리가 만든 클래스를 넣을때 같이 겹칠때 겹치는 걸 인식하기 위한 장치
	
	String name;

	public hash(String name) {
		super();
		this.name = name;
	}
	
	@Override
	public int hashCode() {
		return this.name.hashCode();
	}
	
	@Override
	public boolean equals(Object o) {
		if(o instanceof hash) {
			hash p=(hash)o;
			return this.name.equals(p.name);
		}
		return false;
	}
	
	
	
	
	
	
}