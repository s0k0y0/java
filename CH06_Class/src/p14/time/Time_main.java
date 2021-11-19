package p14.time;

public class Time_main {

	public static void main(String[] args) {
		Time we=new Time();
		we.setHour(26);
		we.setMinute(34);
		we.setSecond(35);
	
		System.out.println(we.getHour()+":"+we.getMinute()+":"+we.getSecond());
		
		Time we2=new Time(02,23,25);
		System.out.println(we2.toString());//주소값이 나오지 않도록 하는 유일한 방법인것 같음
		
		
		
		
		
	}

}
