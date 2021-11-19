package p04.Calculator;

public class Computer extends Calculator {
	@Override
	double areaCircle(double r) {//return값 있으므로 void 안써줌
		System.out.println("overriding areaCircle()실행");
		return Math.PI*r*r;
	}
}
