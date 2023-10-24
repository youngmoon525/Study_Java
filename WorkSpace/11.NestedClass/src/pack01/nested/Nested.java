package pack01.nested;

public class Nested {
	public Nested() {
		System.out.println("Nes생성자");
	}
	
	//멤버 : 클래스의 중괄호 사이의 모든 것-> 변수 , 메소드,클래스 등
	//멤버의 종류 : 
	//			1. 인스턴스 멤버 : 클래스가 인스턴스화(객체) 과정을 거쳐야만 사용가능 
	//					접근방법: 객체. (점찍으면 다 나옴)
	//			2. 스태틱 멤버  : 클래스에 접근만 하면 사용 가능
	//					접근방법: 클래스.(찍으면 다 나옴)
	//구분하는 방법 :
	
	//인스턴스 멤버 : 인스턴스 클래스
	public class NesInner{
		public NesInner() {}
		//public static sField1;//?
		String iField;
		public void iMethod() {
			System.out.println("iMethod");
		}
	}
	
	//스태틱 멤버 : 스태틱 클래스
	public static class NesInner2{
		
		static String sField2="ON";//?
		String iField;
		public void iMethod() {
			System.out.println("static");
		}
	}
	public void method4() {
		int num = 10;
		System.out.println(num);
	}
	
	public void nesInner3() {
		class NesInner3{ 
			String iField;
			public void iMethod() {
				System.out.println("메소드");
			}
		}
		NesInner3 nes = new NesInner3();
		nes.iField ="lv";
		nes.iMethod();
	}
	
	
	
	
	public int field;
	public void method() {
		System.out.println("메소드1" + field2);
	}
	
	public static int field2;
	public static void method2() {
		Nested nas = new Nested();
		System.out.println("메소드2" + nas.field);
	}
	
	
	
	
	
	
	
	
	
}
