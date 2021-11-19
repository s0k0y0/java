package p07.Tire;

public class Hankook extends Tire {
	
	public Hankook(String location, int maxRotation) {
		super(location, maxRotation);
	}
	
	@Override
	public boolean roll() {
		++accumlated;
		if(accumlated<maxRotation) {
			System.out.println(location+"수명:"+(maxRotation-accumlated)+"회");//해당 타이어 남은 수명
			return true;
		} else {
			System.out.println(location+"HankookTire펑크");//타이어 사망 위치
			return false;
		}

	}
}