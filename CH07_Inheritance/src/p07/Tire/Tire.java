package p07.Tire;

public class Tire {
	public int maxRotation;//타이어 수명
	public int accumlated;//타이어 누적 횟수
	public String location;//타이어 위치
	
	public Tire(String location, int maxRotation ) {
		this.location=location;
		this.maxRotation=maxRotation;
	}
	
	
	public boolean roll () {
		++accumlated;
		if(accumlated<maxRotation) {
			System.out.println(location+"수명:"+(maxRotation-accumlated)+"회");//해당 타이어 남은 수명
			return true;
		} else {
			System.out.println(location+"Tire펑크");//타이어 사망 위치
			return false;
		}
	}
	
}
