package pack01.nested;

public class KymNested {
	
	
	//정답포인트 , 10 이 각각 출력되면 정답
	private static class TestA {
		int field = 10;
		public void method1() {
			System.out.println("정답 포인트");
		}
	}
//	public class insClass{
//		static int num;
//		static class test{
//			
//		}
//	}
//	
	//인스턴스 클래스 내부에 스태틱 변수는 있으면 x 
	public static class TestC {
		public class TestZ {
			public class TestB {
				public TestA rtnMethod() {
					return new TestA();
				}
			}
		}
	}
}
