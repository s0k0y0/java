package p00.arraylist;

import java.util.ArrayList;

public class arraylistTest {

	public static void main(String[] args) {
		
		ArrayList<String> a=new ArrayList<String>();

		
		System.out.println("요소 추가");
		a.add("홍길동1");
		a.add("홍길동2");
		a.add("홍길동3");
		a.add("홍길동4");
		
		//출력방법1
		for(int i=0; i<a.size(); i++) {
			System.out.println(a.get(i));//get을 반드시 넣어줘야함!!!
		}
		
		
		
		
		
		System.out.println("요소 제거");
		
		a.remove(0);//0번 인덱스 변수값 제거. 빈자리채우려 앞으로 순차적으로 당김
		
		for(int i=0; i<a.size(); i++) {
			System.out.println(a.get(i));//get을 반드시 넣어줘야함!!!
		}

	}

}
