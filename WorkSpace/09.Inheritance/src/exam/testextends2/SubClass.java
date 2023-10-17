package exam.testextends2;

//상속받기 extends
//sum메소드,minus메소드 상속받음 , (기존기능) + (SubClass기능)

public class SubClass extends SuperClass{
	//@override <-
	//@ : 어노테이션 , 기계가 (Java)가 인식을 하는 주석
	//부모클래스의 기능을 자식클래스가 물려받아 형태를 '유지'하고 기능을 바꿈 => 재정의
	
	public SubClass() {
		System.out.println("자식클래스 생성자");
	}
	
	@Override
	public int sum(int x, int y) {
		super.minus(x, y);
		return super.sum(x, y)+1;//부모클래스가 가진 메소드를 호출
	}
	
	
	public int mul(int x , int y) {
		return x*y;
	}
	public int div(int x , int y) {
		return x/y;
	}
}
