package p00.arraylist;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class listKind {

	public static void main(String[] args) {
		
		LinkedList<String> ll = new LinkedList<String>();
		ll.add("santafe");
		ll.add("sonata");
		ll.add("k9");
		ll.add("sorento");
		ll.add("oudi");
		ll.add("eikuse");

		System.out.println("출력방법1");
		
		for (int i= 0; i < ll.size(); i++) {
			System.out.println(ll.get(i));
		}
		
		
		
		//linkedlist를 통해서 queue를 구성가능
		
		
		Queue<String> q=new LinkedList<>();//queu자체적으로 생성해도되고 어차피 linkedlist랑 상속관계이기 때문에 다형성 객체로 생성된 거임
		q.add("강남구");
		q.add("노원구");
		q.add("은평구");
		q.add("도봉구");
		q.add("서초구");
		
		System.out.println("출력방법1");
		
		for(String r:q) {
			System.out.println(r);
		}
		
		
		System.out.println("출력방법2");
		
		while(!(q.isEmpty())) {//배열안이 비어있지 않다면 while내용 실행
			System.out.println(q.poll());//값을 완전히 꺼내서 출력한다는 queue method-pull
		}
		
		
		System.out.println("출력방법3");
		
		for(int i=0; i<q.size(); i++) {
			System.out.println(q.poll());
			//즉, 여기 풀은 하나씩 출력할 때마다 배열 하나가 없어짐. 그렇기에 위의 pull때문에 이for 문장을 배열이 없어 실행할 수 없음
		}
		
		
		
		Stack<String> s= new Stack<>();
		s.push("이문동");//push도 데이터 저장 메소드이지만 add도 먹힘
		s.push("불광동");
		s.push("서초동");
		s.push("상계동");
		
		System.out.println("출력방법1");
		
		for(String i:s) {
			System.out.println(i);
		}
		
		System.out.println("출력방법2");
		
		while(!(s.isEmpty())) {//배열 안의 값이 비어있지 않다면 while실행
			System.out.println(s.pop());
		}
		

	}

}
