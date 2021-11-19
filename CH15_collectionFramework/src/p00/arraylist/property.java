package p00.arraylist;

import java.util.Enumeration;
import java.util.Properties;
import java.util.Set;

public class property {

	public static void main(String[] args) {
		
		Properties p=new Properties();
		
		p.put("name", "홍길동");
		p.put("addr", "역삼동");
		p.put("age", "10");
		p.put("nation", "대한민국");
		
		System.out.println("출력방법1");
		
		System.out.println(p.get("name"));
		
		
		
		System.out.println("출력방법2");
		
		//propertyNames
		Enumeration<?> e=p.propertyNames();
		
		while(e.hasMoreElements()) {
			String name=(String) e.nextElement();//next는 오브젝트인데 name은 스트링 클래스이니까 강제변환 필요
			System.err.println(name+":"+p.getProperty(name));
		}
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
