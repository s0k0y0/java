package p05;

import p06.protectedd.A;

public class D extends A {//원래는 protected라서 다른 클래스에 있는 A에 접근하지 못하지만 D가 A의 자식클래스가 되었기 때문에 가능해짐.but Import해야함
	public D() {
		
	}
}
