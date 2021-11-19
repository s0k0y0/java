package p05.api;

import java.util.function.BiConsumer;
import java.util.function.Consumer;

public class consumerEx {
	public static void main(String[] args) {

		Consumer<String> c = new Consumer<String>() {

			@Override
			public void accept(String t) {
				System.out.println(t + "8");
			}
		};
		c.accept("a");

		// 위의 익명객체의 람다식 버전
		Consumer<String> c2 = (t) -> {// 파라미터있는 메소드라면 반드시 변수명이 들어가야함.데이터타입은 생략되도 됨
			System.out.println(t + "8");
		};
		
		//익명 구현객체
		BiConsumer<String, Integer> c3 = (t, u) -> {// 두 개매의 맥변수를 사용할 수 있다.
			System.out.println(t + u);
		};
		c3.accept("java", 8);
		
		

	}

}
