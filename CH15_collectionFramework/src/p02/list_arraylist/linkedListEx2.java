package p02.list_arraylist;
//linkedlist를 이용한 Queue 만들기
import java.util.LinkedList;

public class linkedListEx2 {
	public static void main(String[] args) {
		
		LinkedList<String> l=new LinkedList<String>();
		l.offer("토끼");
		l.offer("lion");
		l.offer("banbi");
		
		while(!(l.isEmpty())) {//비어있지 않다면 반복문 실행
			String s1=l.peek();//출력 후 다시 넣으라는 메소드
			String s2=l.poll();//출력 후 제거하라는 메소드
			System.out.println(s2);
		}
		
		
		
		
	}
}
