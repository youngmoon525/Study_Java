package pack01.method;

import java.util.Scanner;

public class CarMain {
	public static void main(String[] args) {
		//1.Car의 인스턴스 멤버->Car가 인스턴스화 ->객체->객체. 사용이 가능하다.
		Car car = new Car();
//		for(int i=0; i<10; i++) {
//			car.kymMethod();//만들어진 메소드를 호출 -> 메소드의 중괄호 블럭킹 시작과끝.
//		}
//메소드의 파라메터
//정의 = 호출 : 변수 초기화 식
		car.kymMethod1("김영문");
		car.kymMethod2("김영문", "휴식");
		car.kymMethod3("현대차", 0);
		car.kymMethod4(12);
		int result = car.rtnMethod1();
		System.out.println(result+1);
		System.out.println(car.rtnMethod2(50));
		
	}
}
