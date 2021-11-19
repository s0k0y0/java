package p08.Tokenizer;

import java.util.StringTokenizer;

public class StringTokenizerEx {
	public static void main(String[] args) {

		String[] a = "자몽,오렌지,키위".split(",");// ()자를 구간

		for (int i = 0; i < a.length; i++) {
			System.out.println(a[i]);
		}

		System.out.println("-----------------");

		String b = "사과=10|초콜릿=3|샴페인=1";

		StringTokenizer we = new StringTokenizer(b, "=|", true);//(토큰으로 만들것, 구분자, 구분자를 토큰의 일부로 보겠다?)
		while (we.hasMoreTokens()) {
			String t = we.nextToken();//b의 토큰형대를 변수에 삽입
			if (t.equals("=")) {//=토큰을 만날때 true문장을 실행한다
				System.out.print("\t");
			} else if (t.equals("|")) {//|토큰을 만날때 true문장을 실행한다
				System.out.print("\n");
			} else {
				System.out.print(t);
			}

		}//응용버전!!!!
		
		
		
		

	}

}
