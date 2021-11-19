  public class Person {
	String Name;
	int Num;

	public Person (String name, int num) {
		Name = name;
		Num = num;
	}
	
	public boolean equals(Object obj){
		if(obj instanceof Person) {
			Person ai=(Person) obj;
			if(this.Num==ai.Num && this.Name==ai.Name) {
				return true;
			}
		}	
		return false;
	}
	
	
}
