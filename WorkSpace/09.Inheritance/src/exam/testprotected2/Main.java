package exam.testprotected2;

import exam.testprotected1.B;
import exam.testprotected1.A;

public class Main extends A{
	int protected_field4 ;
	public Main() {
		//생성자를 이용해서 접근해서 빼오기.
		this.protected_field4 = super.protected_field4;
	}
	
	public static void main(String[] args) {
		B b = new B();
		int num = b.rtnAfield();//같은 패키지 내부에 있는 다른 클래스를 통해 우회
		//default : 같은 패키지 내부에서만 접근이 가능
		//private : 같은 클래스 내부에서만 접근이 가능
		//protected : 같은 패키지 내부 또는 해당 클래스를 상속받은 클래스에서 사용이 가능
	}
}
