package pack02.an;

public class TestMain{
	public static void main(String[] args) {
		//TestClass에 있는 변수에 값 3을 할당. , 메소드 호출
		//익명의 클래스 지역을 만들기.
		TestClass tc = new TestClass() {
			int testField2 = 30;
			@Override
			void testMethod() {
				//super.testMethod();
				System.out.println("익명의 지역에서 재정의" + testField2);
			}
		};
		tc.testField = 3;
		tc.testMethod();
		
		//인터페이스도 인스턴스화가 가능함.
		//인터페이스의 규칙상 메소드는 반드시 구현되어 있어야함.
		TestInterface[] tiArr = new TestInterface[10];
		TestInterface tiNull = null;
		
		TestInterface ti = new TestInterface() {
			int num = 10;
			@Override
			public void method() {
				System.out.println("인터페이스 인스턴스화!"+num);
			}
		};
		
		ti.method();
		
	}

}
