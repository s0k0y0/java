package p02.list_arraylist;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

//list 계열:

public class ArraylistEx {
	public static void main(String[] args) {
		
		//기존 배열:처음 배열만들때, 배열의 크키를 고정해아함. 자료가 순차적이고 중복적일떄 사용하게 됨
		String[] s= {new String("홍길동1"), new String("홍길동2")};//배열2로 고정
		for(int i=0; i<s.length; i++) {
			System.out.println(s[i]);
		}
		
		//arraylist: 배열의 크기가 고정되지 않고 언제든 변화 가능하다. 자료를 수정,삭제를 할떄 유리하다. list를 상속받은 클래스
		ArrayList<String> a1=new ArrayList<String>();
		a1.add(new String("홍길동1"));
		a1.add(new String("홍길동2"));//a1[0]=new String("홍길동")이 아니라 해당 형식으로 작성
		
		List<String> a2=new ArrayList<String>();//부모의 눈으로 다형성
		
		
		for(int i=0; i>a1.size(); i++) {
			System.out.println(a1.get(i));//a2[i]이 아니라 get형식으로 해야지 해당 숫자의 인텍스 내용 출력됨
		}
		
		
		for(String i:a1) {
			System.out.println(i);//a1.get(i)는 i번째 인덱스 가리키는 거임
		}
		
		
		//여기밑에 두개....
		//static<1> 
		
		//iterator
		Iterator<String> it=a1.iterator();//밑의 메소드 둘다 iterator클래스의 메소드로 iterator은 arraylist를 상속받기 때문에 변수에 넣는게 가능?
		while(it.hasNext()) {//배열안에 읽을 요소가 있는지 boolean으로 확인하는 메소드. true면 while안의 메소드를 실행
			System.out.println(it.next());//next는 데이터를 반환한다
		}
		
		//static<T> method
		List<String> a3=Arrays.asList(s);//static method를 호출하여 사용. arrays.aslist는 단순한 메소드로 arrays 속한 메소드로 static이라 바로 사용가능
		System.out.println(a3);
		for(String a:a3) {
			System.out.println(a);
		}
		
		
		//arraylist와 vector의 차이점은 arraylist는 동기화와 과정이 없어 처리 속도 빠르다
		
		
	}
}
