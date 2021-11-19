import java.util.Scanner;

public class study3 {
	public static void main(String[] args) {
		
		boolean run=true;
		int keyboard;
		
		Teacher t=new Teacher();
		
		
		while(run) {
			
			
			
			System.out.println("1.학생정보입력");
			System.out.println("2.학생총점출력");
			System.out.println("3.학생평균출력");
			System.out.println("4.프로그램종료");
			
			
			Scanner s1=new Scanner(System.in);//main 클래스에서의 1,2,3,4읽기 스캐너
			keyboard=s1.nextInt();
			
			if(keyboard==1) {
				t.input();
			}
			
			if(keyboard==2) {
				t.sum();
			}
			
			if(keyboard==3) {
				t.avr();
			}
			
			if(keyboard==4) {
				System.out.println("종료");
				run=false;
			}
			//else{break;로 종료}할 수도 있음
			
		}

	}

}


class student{
	
	
	String name;//학생 이름
	int kor;//국어
	int math;//수학
	int eng;//영어
	
	//변수에 값 저장하고 불러오기 getter,setter
//	public String getName() {
//		return name;
//	}
//	public void setName(String name) {
//		this.name = name;
//	}
//	public int getKor() {
//		return kor;
//	}
//	public void setKor(int kor) {
//		this.kor = kor;
//	}
//	public int getMath() {
//		return math;
//	}
//	public void setMath(int math) {
//		this.math = math;
//	}
//	public int getEng() {
//		return eng;
//	}
//	public void setEng(int eng) {
//		this.eng = eng;
//	}

	
	
}



class Teacher extends student {
	
	Scanner s;
	student st;
	
	public Teacher() {//객체생성은 메소드 안에서만 가능하기에 만드시 스캐너 클래스를 생성하기위해 메소드 필요
		
		s=new Scanner(System.in);//키보드 입력. 이름,점수 입력을 위한 스캐너
		st=new student();	
		
	}
	
	
	public void input() {//1.학생정보입력
		System.out.println("학생정보입력");
		super.name=s.nextLine();
		
		System.out.println(name+"국어점수");
		super.kor=s.nextInt();
		
		System.out.println(name+"수학점수");
		super.math=s.nextInt();
		
		System.out.println(name+"영어점수");
		super.eng=s.nextInt();
		
		System.out.println("------입력완료-----");
	}
	
	public void sum(){
		int s=super.kor+super.math+super.eng;
		System.out.println(s);
	}
	
	public void avr() {
		int s=(super.eng+super.kor+super.math)/3;
		System.out.println(s);
	}
	
	
	
	
	
	
	
}