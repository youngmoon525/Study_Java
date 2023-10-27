package test04.nasted;

public class TestClass {
	A a;
	B b;
	
	
	public TestClass(A a, B b) {
		this.a = a;
		this.b = b;
	}

	public static void main(String[] args) {
		TestClass tClass = new TestClass(new A("필드"), new B(1, 2));
	}
	
	public static class A{
		public A(String field) {
			System.out.println(field);
		}
	}
	
	public static class B{
		public B(int field1 , int field2) {
			System.out.println(field1 + field2);
		}
	}
	
}
