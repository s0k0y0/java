package p11.arrays;

//s3[0]가 이 클래스의 주체
//Comparable<T>:natural order(자연적인 순서),일반적인 순서
//comparator:특수한 정렬시 사용
public class Member implements Comparable<Member>{//비교 클래스 상속받아야함
	
	String name;

	public Member(String name) {
		this.name = name;
	}

	@Override
	public int compareTo(Member o) {//비교하는 comparable의 추상메소드
		return this.name.compareTo(o.name);//[0] name과 날라오는 변수([1],[2])의 name이 뭐가 큰지 비교하겠다
	}
	
	//hashmap과는 다르게 비교하는 2단계와 생성자3단계만 있으면 내가 만든 클래스 배열을 오름차순 할 수 있음
	
	
}
