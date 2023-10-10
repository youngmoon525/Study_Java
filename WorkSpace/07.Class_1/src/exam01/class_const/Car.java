package exam01.class_const;

public class Car {
	//클래스의 블럭킹 내부 -> 멤버
	//멤버-> 선언된것(변수,클래스..등등) => 필드 => ※인스턴스 멤버※iv(인스턴스 변수)
	String number , name;
	int price;
	//1.CarMain클래스를 exam01.class_const 패키지에 추가 후 CarMain클래스에서 Car클래스를 인스턴스화 해보기.
	
	//2.Car클래스에 아무거나 속성(필드)를 추가 후 CarMain클래스에서 값 할당 및 출력해보기.
	
	//------------------------------------------------------------------
	//3.Car클래스에 아무 속성을 꼭 입력 받아야만 생성되게" 생성자 "메소드를 구현해보기.
	public Car(String number) {
		this.number = number;
	}
	
}
