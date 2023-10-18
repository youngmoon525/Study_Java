package exam.testprotected1;

public class Main {
	public static void main(String[] args) {
		A a = new A();
		B b = new B();
		a.public_field1 = 1;
		a.default_field2 = 2;
		a.protected_field4 = 4;//?
		b.protected_field4 = 10;
	}
}
