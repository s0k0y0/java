package p03.object;

public class Member {

	
	public String id;

	public Member(String id) {
		this.id = id;
	}
	
	@Override
	public boolean equals(Object parameter) {
		if(parameter instanceof Member) {
			Member we=(Member) parameter;
			if(this.id.equals(we.id)) {
				return true;
			} else {
				System.out.println("들어있는 변수가 같지않음");
			}
		} else {
			System.out.println("객체가 자기자신이 아니거나 상속관계가 아님");
		}
		return false;
		
	}
	
	
	
	
	
	
	
	
}
