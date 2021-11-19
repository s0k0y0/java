import java.util.Scanner;

public class Mammain {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int key;
		boolean run = true;

		System.out.println("회원 수 입력");
		int sp = sc.nextInt();
		Mem[] Memnum = new Mem[sp];//배열의 크기 생성. ?포인트는 사용할려는 변수와 메소드가 담긴 데이터 타입으로 배열을 생성하도록 한다
		//?여기다가 배열의 객체를 생성하면 오류남...그리고 배열값 저장도 안됨...

		Mem m = new Mem();

		while (run) {// 배열만큼의 크기를 어떻게 널을지 모르겠음.for문장을 넣어 반복할 수있긴 하지만 회원 정보를 각 배열에 저장하는 문제가 남음....
			
			
			
			System.out.print("번호 입력하기  (1.정보입력 2.정보출력  3.비만 정도 출력 4.종료 ");
			key = sc.nextInt();

			if (key == 1) {
				for (int i = 0; i < Memnum.length; i++) {
					Memnum[i] = new Mem();//여기다가 객체를 생성해야지만 정보가 저장됨...왜 그런지...ㅠㅜ
					Memnum[i].in();
				}
			}

			if (key == 2) {
				for (int i = 0; i < Memnum.length; i++) {
					Memnum[i].prn();
				}

			if (key == 3) {
					for (int i = 0; i < Memnum.length; i++) {
						Memnum[i].jung();
					}
					break;
				}

			if (key == 4) {
					run = false;
				}

			}

		}
	}
}

class Mem {

	String name;
	int ki;
	int we;
	int age;
	int tel;
	int c;// 체중측정결과값

	Scanner sc = new Scanner(System.in);

	public void prn() {// 입력된 정보출력

		System.out.println("[회원정보출력]");
		System.out.println("이름:" + this.name);
		System.out.println(this.name + "님의 키:" + this.ki);
		System.out.println(this.name + "님의 몸무게:" + this.we);
		System.out.println(this.name + "님의 나이:" + this.age);
		System.out.println(this.name + "님의 전화번호:" + this.tel);

	}

	public void in() {// 정보입력
		
		System.out.println("이름:");
		this.name = sc.nextLine();

		System.out.println(name + "키:");
		this.ki = sc.nextInt();

		System.out.println(name + "몸무게:");
		this.we = sc.nextInt();

		System.out.println(name + "나이:");
		this.age = sc.nextInt();

		System.out.println(name + "전화번호:");
		this.tel = sc.nextInt();
	
	}

	public void jung() {// 체중측정하기

		double b = (this.ki - 100) * 0.9;

		if (we > b) {
			System.out.println("과제충 입니다");
			this.c = (int) (we - b);
			System.out.println("차이값은:" + this.c);
		} else if (we < b) {
			System.out.println("저체중입니다");
			this.c = (int) (we - b);
			System.out.println("차이값은:" + this.c);
		} else if (we == b) {
			System.out.println("정상체중입니다");
		}
		

	}

}
