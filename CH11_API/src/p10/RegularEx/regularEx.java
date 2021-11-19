package p10.RegularEx;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class regularEx {

	public static void main(String[] args) {
		String[] data= {"bat","baby","bonus","cA","ca","co","c0",
				"car","combat","count","date","disc"};
		
		
		
		Pattern p= Pattern.compile("c[a-z]*");//c:c로 시작하는 소문자를 출력,[a-z]:영어 한글자 출력 *:없거나 한개 이상 영어 한글자 출력
		for(int i=0; i<data.length; i++) {
			Matcher m=p.matcher(data[i]);//배열에 조건에 맞는 문자열 찾아보기
			if(m.matches()) {
				System.out.print(data[i]+",");
			}
		}
		

	}

}
