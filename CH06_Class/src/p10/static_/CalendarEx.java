package p10.static_;

import java.util.Calendar;

public class CalendarEx {

	public static void main(String[] args) {
		Calendar cal=Calendar.getInstance();
		//static으로 객체생성이 된 것을 불러와주는 역할? 객체생성 new의 대신인거임?.Calendar에 들은 모든 변수와 메소드를 사용할 수 있음
		//singlton개념을 이용해서 Calendar class안에 있는 모든 변수와 메소드를 사용
		
		int year=cal.get(cal.YEAR);
		System.out.println(year);
		System.out.println(Calendar.MONTH);//왜 밑에 month랑 다르게 나오는 걸까?
		System.out.println(cal.DATE);
		
		
		int month=cal.get(Calendar.MONTH)+1;
		System.out.println(month);
		int date=cal.get(Calendar.DATE);
		System.out.println(date);
		
		
		
	}

}
