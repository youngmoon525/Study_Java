package pack01.method;

import java.util.Scanner;

public class Car {
	//1.클래스의 중괄호 사이에 있는 모든것들?-> 멤버
	//2.그 중. 변수 클래스 등등으로 선언 되어있는것?-> 필드 , "속성" , 인스턴스 변수 , iv
	//3.기능을 담당-> 메소드(method) : ex) main메소드 -> 자바 프로그램의 시작 기능을 담당
	
	//Method의 선언 (정의)
	//접근 제한자 : "public" > protected > default > private : 지금은 public(공공의)
	//리턴 타입 : void이냐 void가 아니냐
	//1.접근제한자 2.리턴타입 3.메소드명 4.(매개변수,파라메터) 5.{
		//코드
	//}
	
	//class타입외-> 소문자 시작 , 카멜
	public void kymMethod() {
		System.out.println("void형태는 return타입 없음.");
		System.out.println("현재 메소드는 클래스의 블럭킹 내부에 있음");
		System.out.println("↑ kymMethod는 클래스의 멤버,인스턴스 멤버");
	}
	//(x , y)-> 
	//파라메터 , 매개변수 ( 메소드 동작 시 필요한 값이 있다면 "뭐든" 받아올수있음 ) 
	//변수 선언 ( 받아오기위한 그릇)
	//파라메터가 2개 이상은 ,<-로 구분
	public void kymMethod1(String name) {
		System.out.println(name + " (이)가 학습 중");
	}
	public void kymMethod2(String name , String state) {
		System.out.println(name + " (이)가 "+ state + " 중");
	}
	//method3번 method4번 직접 정의(구현)해보기.
	//호출 ↑
	//문자열과 숫자를 입력받아 출력하는 메소드를 만들어보세요.
	public void kymMethod3(String carName , int price) {
		System.out.println(carName + " " + price + " 원");
	}
	
	//어려움)숫자를 입력받아 해당하는 숫자만큼 콘솔창에 "출력"이라는 글자를 
	//출력하는 메소드를 만들어보세요.ex)5->"출력...."x5 , 10->...
	public void kymMethod4(int count) {
		for(int i = 1 ; i<=count; i++) {
			System.out.print("출력 ");
		}
	}
	//뭐든지 내가 필요한것(리턴)
	//void가 아닌경우에는 주어진 리턴타입을 반드시 "반환해줄것"=>return
	public int rtnMethod1() {
		//int result = 1;
		//return result;
		System.out.println("rtnMethod");
		return 10;
	}
	
	public int rtnMethod2(int number) {
		System.out.println("rtnMethod2");
		return number;
	}
	
	
	
	
}
