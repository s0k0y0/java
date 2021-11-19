package p04.syn_method;

public class mainThreadEx {

	public static void main(String[] args) {
		
		
		calculator c=new calculator();
		
		User1 t1=new User1();
		User2 t2=new User2();
		
		t2.setC(c);//2초 뒤에 출력동안 두번째 실행된 t1.Cset값이 차리해버림. but 동기화 메소드로 이 문제 해결
		t2.start();
		
		t1.setC(c);
		t1.start();//이름 설정을 안해서 자바 내에 기본 이름뜸
		
		
		
		
		
		
		
		

	}
	

}
