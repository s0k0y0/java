package p02.ifstatement;

public class iff {

	public static void main(String[] args) {

		int score = 93;

		// true ver
		if (score >= 90) {
			System.out.println("90보다 큼");
		}

		// true-false ver
		if (score >= 90) {
			System.out.println("90보다 큼");
		} else {
			System.out.println("90보다 작음");
		}

		// else if ver
		if (score >= 90) {
			System.out.println("90보다 큼");
		} else if (score >= 80) {
			System.out.println("80보다 작음");
		} else if (score >= 70) {
			System.out.println("70보다 작음");
		} else {
			System.out.println("60보다 작음");
		}

		// 주사위
		int num = (int) (Math.random() * 6) + 1;// int가 아니라 double이므로 강제변환 필요

		if (num == 1) {
			System.out.println("주사위 1");
		} else if (num == 2) {
			System.out.println("주사위 2");
		} else if (num == 3) {
			System.out.println("주사위 3");
		} else if (num == 4) {
			System.out.println("주사위 4");
		} else if (num == 5) {
			System.out.println("주사위 5");
		} else {
			System.out.println("주사위 6");
		}

		// 중첩 if
		int ber = (int) (Math.random() * 99 + 1);

		if (ber >= 90) {
			System.out.print("A");
		}
		if (ber >= 95) {
			System.out.print("A+");
		} else {
			if (ber >= 85) {
				System.out.print("B+");
			} else {
				System.out.print("B");
			}
		}
		System.out.print("\t" + "score:" + ber+"\n");

		// switch

		int ne = (int) (Math.random() * 6 + 1);

		switch (ne) {// 괄호 안에는 순서대로 올 수 있는 변수밖에 오지 못하는 것 같음. switch는 break꼭 해야함!!!!!!!
		case 1:// case이름은 변수에 나올 수.주사위의 숫자가 1번이 나올 경우, 다음은 2,3,4,5,6 이렇게 순서대로 나오면서 해당 사건 이름에 맞는 내용 출력
			System.out.println("주사위 1번");
			break;

		case 2:
			System.out.println("주사위 2번");
			break;

		case 3:
			System.out.println("주사위 3번");
			break;

		case 4:
			System.out.println("주사위 4번");
			break;

		case 5:
			System.out.println("주사위 5번");
			break;

		default:
			System.out.println("주사위 6번");
			break;

		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}
}
