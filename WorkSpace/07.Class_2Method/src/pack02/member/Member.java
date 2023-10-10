package pack02.member;

public class Member {
	// 메소드 규칙 : void의 여부
	//void인 경우 변수에 담거나 메소드 내부에 있는 값을 메소드 호출한 곳에서 받을수 없음
	//void가 아닌 경우에는 반드시 해당하는 타입을 반환 해줘야함."return"
	
	//클래스 중괄호 사이에 있는 모든것-> 멤버
	//멤버는 크게 static과 ※instence※로 나누어짐.
	//static이라는 키워드 여부 
	//1.인스턴스 멤버 : static 키워드가 없음. 인스턴스화 과정을 거쳐야지만 접근이 가능(사용 가능)
	//	인스턴스화 -> Class "class" = new Class();
	//  클래스 내부에 있는 모든 멤버가 메모리에 올라가고 사용 준비 O
	//  접근방식 -> class. <-접근방식
	
	//2.스태틱 멤버 : static 키워드가 있음. 인스턴스화 과정 없이 사용 가능(접근 가능)
	// 자바 프로그램 시작 시 메모리에 먼저 올라가서 사용 준비 O
	// static은 메모리를 미리 점유하기 때문에 사용 x
	// 과도한 static멤버를 사용하는것은 프로그램 속도 저하의 원인
	//인스턴스화 x ,
	// 접근방식 -> Class.
	int iField;
	static int sField;
	
	public void iMethod() {
		System.out.println(iField +"인스턴스 메소드" + sField);
	}
	
	public static void sMethod() {
		Member member = new Member();
		System.out.println("스태틱 메소드" + member.iField);
	}
	
}
