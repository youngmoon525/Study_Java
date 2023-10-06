package pack02.exfield;

public class CarMain {
	public static void main(String[] args) {
		//자바시간에만 main메소드 씀. -> html , jsp , android화면
		//Car(Class) 설계도 -> 객체(car) 인스턴스화 -> 
		//객체화(인스턴스화)-> 설계도 클래스를 가지고 객체(제품)를 사용할수있는 상태로 바꾸는 식(과정)
		//클래스이름 객체화(변수이름) = "new" 클래스이름();
		//인스턴스화 된 객체 ↓(car)뒤에 .을 찍으면 모든 멤버가 보인다.
		Car carh = new Car();
		
		Car cark = new Car();
		carh.company = "현대";
		carh.type = "소형차";
		carh.maxSpeed = 200;
		
		cark.company = "기아";
		
		System.out.println(carh.company + carh.type + carh.maxSpeed + carh.color);
		System.out.println(cark.company);
	}
}
