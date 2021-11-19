package p15.format;

import java.text.ChoiceFormat;

public class ChoiceformatEx {
	public static void main(String[] args) {
		double[] limits= {60,70,80,90};
		String[] grades= {"D","C","B","A"};
		int[] scores= {100,95,88,70,52,60,70};
		
		ChoiceFormat form=new ChoiceFormat(limits,grades);
		for(int i=0; i<=8.0; i++) {
			System.out.println(scores[i]+":"+form.format(scores[i]));//form이 제한과 제한에 맞는 등급을 설정하는 역할로 변수로 score을 넣으면 자동으로 등급을 매겨준다
			
			
		}
		
		
		
		
		
	}
}
