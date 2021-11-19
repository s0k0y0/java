package p11.arrays;

import java.util.Arrays;
import java.util.Collections;

public class sortEx {
	public static void main(String[] args) {

		// 1.개발자가 만든 내용
		// Asceiding Sort:오름차순
		int[] s = { 99, 97, 98 };
		
		
		Arrays.sort(s);// 낮은 수부터 오름차순에 해당되는 정렬

		
		
		for (int i = 0; i < s.length; i++) {
			System.out.println(s[i]);
		}
		
		
		System.out.println("----------------");
		
		// 2.개발자가 만든 내용
		String[] s2 = { "홍길동4", "홍길동2", "홍길동3" };
		Arrays.sort(s2);// String타입이 없긴한데 적용은 되는 것 같음
		for (int i = 0; i < s.length; i++) {
			System.out.println(s2[i]);
		}
		
		
		System.out.println("----------------");
		
		
		// 3.우리가 만든 클래스
		Member[] s3 = { new Member("홍길동4"), new Member("홍길동5"), new Member("홍길동8") };// 나만의 클래스는 오름차순 불가능
		try {
			Arrays.sort(s3);
			for (int i = 0; i < s.length; i++) {
				System.out.println(s3[i].name);
			}
		} catch (ClassCastException e) {
			System.out.println("클래스 강제변환 불가능. 재정의 필요");
		} catch (Exception e) {

		} finally {
			System.out.println("맞든 틀리든 finally안의 내용은 항상 실행");
		}

		System.out.println("----------------");
		
		
		// Descending:내림차순
		//1
		Integer[] s4 = { 99, 97, 98 };
		Arrays.sort(s4, Collections.reverseOrder());// 낮은 수부터 오름차순에 해당되는 정렬. 위의 배열을 int가 아닌 Integer class유형으로 해야함
		for (int i = 0; i < s.length; i++) {
			System.out.println(s4[i]);
		}

		System.out.println("----------------");
		
		
		// 2
		Arrays.sort(s2, Collections.reverseOrder());
		for (int i = 0; i < s.length; i++) {
			System.out.println(s2[i]);
		}
		
		System.out.println("----------------");
		
		//3
		try {
			Arrays.sort(s3,Collections.reverseOrder());
			for (int i = 0; i < s.length; i++) {
				System.out.println(s3[i].name);
			}
		} catch (ClassCastException e) {
			System.out.println("클래스 강제변환 불가능. 재정의 필요");
		} catch (Exception e) {

		} finally {
			System.out.println("맞든 틀리든 finally안의 내용은 항상 실행");
		}
		
		
		
		

	}

}
