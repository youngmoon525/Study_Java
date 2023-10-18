package exam.changetp3;

public class Main {
	public static void main(String[] args) {
		// 부모클래스 변수명 = 자식클래스 ; 자동 타입 변환
		// 자식클래스 변수명 = (타입) 부모클래스 ; 강제 타입 변환
		Child child = new Child();
		Parent parent = new Child();// new Parant();<-코드 왜 오류인지?
		//객체를 생성할때 사용된 인스턴스 : instanceof 사용 된 인스턴스를 비교하여 강제형변환 가능여부를 확인
		//비교할 객체 instanceof 비교할클래스
		//child =(Child) parent;
		if(child instanceof Parent) {
			System.out.println("TRUE");
			//parent =child;
		}else {
			System.out.println("FALSE");
		}
		
		if(parent instanceof Child) {
			child =(Child) parent;
			System.out.println("TRUE");
		}else {
			System.out.println("FALSE");
		}
		
	
		
//		parent = child;
//		parent.method1();
//		parent.method2();
//		System.out.println("부모 클래스 = 자식클래스 가능(O)");
//		child = (Child) parent;
//		child.method1();
//		child.method2();
//		child.method3();
	}
}
