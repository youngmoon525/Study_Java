package pack01.variable;

public class Ex03_Variable {
	public static void main(String[] args) {
		//혼공자 51p.
//		
		int value = 10;
		int result = value + 20 ; // 10 + 20 
		System.out.println(result);
		//int result = value + 10;// 오류가 발생하는 원인이 무엇일까?
		//The local variable value may not have been initialized
		//지역변수 값이 초기화 x=>오류
		//메인 메소드 내부에 있는 변수는 값할당 즉 초기화 전에는 사용이 불가능하다.
	}
}
