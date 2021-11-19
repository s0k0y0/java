package p01.generic_no;

import java.util.ArrayList;
import java.util.Iterator;

public class generic_noEx {

	public static void main(String[] args) {

		// 배열:장점은 주소를 통해서 여러가지 값을 저장. 단점은 고정

		int[] arr = { 100, 200, 300, 400 };

		// arraylist:가변크기, 자료의 수정, 삭제가 많을 때 사용/ 같은 타입끼리 비교하고 배열만들 수 있음?
		ArrayList a1 = new ArrayList();

		a1.add(new String("홍길동"));
		a1.add(new Integer(1));
		a1.add(new Double(12.55));
		a1.add(new Boolean(true));
		a1.add('a');
		a1.add(12.55f);

		//출력1
		System.out.println(a1);
		
		//출력2
		for (int i = 0; i < a1.size(); i++) {
			System.out.println(a1.get(i));
		}

		//출력3
		for (Object i : a1) {//?왜 데이터 타입이 오브젝트인지 모르겠음...
			System.out.println(i);
		}

		//출력4
		Iterator it=a1.iterator();
		while(it.hasNext()) {//다음에 읽을 배열이 있는가
			System.out.println(it.next());
		}
		
		//출력4
		for(Iterator it2=a1.iterator();it.hasNext();) {
			Object name=it2.next();
			System.out.println(name);
		}
		
		System.out.println("-------배열 데이터 수정하기-------");
		
		Object s1=a1.get(0);//배열값 변환가능 형태 전
		System.out.println(s1);
	
		String s2=(String) a1.get(0);//강제변환 후 배열값 변환 가능
		System.out.println(s2+"a");
		
		Object s3=a1.get(1);//배열값 변환가능 형태 전
		System.out.println(s3);
		
		int s4=(int) a1.get(1);//강제변환 후 배열값 변환 가능
		System.out.println(s4+3);
	
		
		System.out.println("-------Person---------");
		
		ArrayList we=new ArrayList();//?아니 근데 구지 일반 배열이 있는데 어차피 같은 타입써야 하는거면 이걸로 왜하는거냐...
		we.add(new Person());
		we.add(new Person("radioactive"));
		
		Person p1=(Person) we.get(0);//인덱스0을 출력하겠다. 데이터타입을 지정하는 generic을 사용하지 않을 경우, Object크기에서 person 클래스로 강제변환해줘야 함
		
		System.out.println(we);//toString overriding 
		
		for(Object i:we) {//데이터 타입을 정하지 않아서 Object클래스로 넣어줌
			System.out.println(i);
		}
		
		
		
		
		
	}
}
