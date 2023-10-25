package pack04.lamda;

//Functionallnterface : 구현해야 할 메소드(추상) 1개만 정의 된 인터페이스
//"2개 이상은 람다식표현불가능!"

//Listner라는 이름의 규칙을 많이 사용함
@FunctionalInterface
public interface LamdaInter {
	void method(Object o , Object o2);
	//함수형 , 객체지향(OOP)
	//함수  vs Method
	//근본적으로는 동일 -> 함수는 일반용어 : 메소드는 객체지향개념 용어
	//함수는 클래스로부터 독립적 vs 메소드는 종속적
	//코틀린(JavaBase)언어 vs Java(Lamda표현식)
}
