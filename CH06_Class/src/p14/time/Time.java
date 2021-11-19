package p14.time;

import java.util.Scanner;

public class Time {
	public int hour;
	public int minute;
	public int second;

	public Time() {
		// TODO Auto-generated constructor stub
	}

	public Time(int hour, int minute, int second) {
		super();
//		this.hour = hour;
//		this.minute = minute;
//		this.second = second;

		setHour(hour);
		setMinute(minute);
		setSecond(second);
	}

	public int getHour() {// 값을 출력하는 메소드
		return hour;
	}

	public void setHour(int hour) {//값을 저장하는 메소드
		if((hour<0||hour>23)) 
			return;
		this.hour = hour;
	}//강사님 해결법. 마찬가지로 범위를 벗어나면 0으로 인식됨

	public int getMinute() {
		return minute;
	}

	public void setMinute(int minute) {
		if ((minute >= 0) && (minute <= 59)) {
			this.minute = minute;
		} else {
			System.out.println("minute error");
			Scanner s = new Scanner(System.in);
			hour = s.nextInt();
			this.hour = hour;// 조건이 안맞으면 다른 메소드를 만들어 넘어가게끔 조건을 만들어 for문으로 반복 동작하게 만듬 
		}
	}

	public int getSecond() {
		return second;
	}

	public void setSecond(int second) {
		if ((second >= 0) && (second <= 59)) {
			this.second = second;
		} else {
			System.out.println("second error");
			Scanner s = new Scanner(System.in);
			hour = s.nextInt();
			this.hour = hour;
		}
	}
	
	@Override
	public String toString() {
		return this.hour+":"+this.minute+":"+this.second;
	}

}
