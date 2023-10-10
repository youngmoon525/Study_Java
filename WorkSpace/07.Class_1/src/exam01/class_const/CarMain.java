package exam01.class_const;


public class CarMain {
	public static void main(String[] args) {
		//1.내가 필요한 클래스가 있다면 해당 클래스 타입을 적어주고 
		//2.내가 사용할 이름을 주고(변수명)
		//3.= new 클래스타입();을 이용해서 인스턴스화
		Car car = new Car("14가1234");//클래스의 인스턴스화 
		//4.인스턴스화 된 클래스의 멤버 접근은 객체.<-을 찍으면 전부 나옴.
		car.name = "자동차이름";
		//car.number = "14가1234";
		System.out.println("자동차 명: " + car.name + " 가격 : " + car.price + " 번호판 : " + car.number);
	}
}
