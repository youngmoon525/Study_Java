package exam.changetp2;

public class Main {
	public static void main(String[] args) {
		//자식 클래스를 만들고 사용하게 되면 모든 기능을 사용할수있음.
		Child  child = new Child();
		child.method1();
		child.method2();
		child.method3();
		System.out.println("----");
		
		Prent parent = child;
		parent.method1();
		parent.method2();
		parent = new Child2();
		parent.method1();
		parent.method2();
		//Prent라는 더 큰 범위안에 다양한 자식클래스를 바꿔가면서 사용하는게 가능함.
		//실질적으로는 Prent하나만 메모리에 있고 , 내부에 있는 메소드 구조를 유연하게 바꿔가면서 사용이 가능
	}
}
