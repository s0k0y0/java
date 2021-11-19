package p04.map;

public class hashcode {
	public static void main(String[] args) {

		String s1 = new String("홍길동");
		String s2 = new String("홍길동");
		int hash1 = s1.hashCode();
		int hash2 = s2.hashCode();
		System.out.println(hash1);

		Name n1 = new Name("gildong", "hong");
		Name n2 = new Name("gildong", "hong");
		int hash3 = n1.hashCode();
		int hash4 = n2.hashCode();
		System.out.println(hash3);
		System.out.println(hash4);

	}

}

class Name {
	String firstName;// 이름
	String lastName;// 마지막 이름

	public Name(String firstName, String lastName) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
	}

	@Override
	public int hashCode() {
		return firstName.hashCode()+lastName.hashCode();
	}

	

}