package p11.arrays;

import java.util.Arrays;
import java.util.Collections;

public class searchEx {
	public static void main(String[] args) {

		// 1.개발자가 만든 내용
		int[] s = { 99, 97, 98 };
		Arrays.sort(s);// 낮은 수부터 오름차순에 해당되는 정렬
		
		
		int result1 = Arrays.binarySearch(s, 98);// 찾을려는 값
		
		
		System.out.println("index[" + result1 + "]");// 인덱스 순서로 출력

		System.out.println("----------------");

		// 2.개발자가 만든 내용
		String[] s2 = { "홍길동4", "홍길동2", "홍길동3" };
		Arrays.sort(s2);// String타입이 없긴한데 적용은 되는 것 같음
		int result2 = Arrays.binarySearch(s2, "홍길동4");// 결과값이 인덱스 순서이기에 출력값 타입은 int
		System.out.println("index[" + result2 + "]");

		System.out.println("----------------");

		// 3.우리가 만든 클래스
		Member[] s3 = { new Member("홍길동4"), new Member("홍길동5"), new Member("홍길동8") };// 나만의 클래스는 오름차순 불가능
		try {
			Arrays.sort(s3);
			int result3=Arrays.binarySearch(s3, "홍길동8");
				System.out.println("index[" + result3 + "]");
		} catch (ClassCastException e) {
			System.out.println("클래스 강제변환 불가능. 재정의 필요");
		} catch (Exception e) {

		} finally {
			System.out.println("맞든 틀리든 finally안의 내용은 항상 실행");
		}

		System.out.println("----------------");

		// Descending:내림차순
		// 3
		try {
			Arrays.sort(s3, Collections.reverseOrder());
			int result4=Arrays.binarySearch(s3, "홍길동8");
			System.out.println("index["+result4+"]");
		} catch (ClassCastException e) {
			System.out.println("클래스 강제변환 불가능. 재정의 필요");
		} catch (Exception e) {

		} finally {
			System.out.println("맞든 틀리든 finally안의 내용은 항상 실행");
		}

	}

}
