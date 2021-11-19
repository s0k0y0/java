package p14.data_calendar;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class calendarEx {
	public static void main(String[] args) {

		Calendar c = Calendar.getInstance();// clendar class는 추상클래스로 getinstance로 불러옴
		int year = c.get(Calendar.YEAR);// 추상 클래스이므로 항상 get메소드를 통해 불러와야 함
		int month = c.get(Calendar.MONTH) + 1;// Month는 +1을 해줘야 함
		int date = c.get(Calendar.DATE);
		System.out.println(year + "/" + month + "/" + date);

		GregorianCalendar g = new GregorianCalendar();// calendar클래스를 상속받았기에 이걸로 객체생성해서 써도 됨
		int y = g.get(Calendar.YEAR);
		int m = g.get(Calendar.MONTH)+1;
		int d = g.get(Calendar.DATE);
		System.out.println(y + "/" + m + "/" + d);

		Date we=new Date();//날짜
		SimpleDateFormat sd=new SimpleDateFormat("yyyy/MM/dd");//출력형식. 날짜나 시간의 입력어가 지정되어 있음
		String ss=sd.format(we);
		System.out.println(ss);
		
		
		
		
	}

}
