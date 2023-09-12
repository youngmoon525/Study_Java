package pack01.variable;

public class Ex01_Variable {
	public static void main(String[] args) {
		//변수라는 것은 값을 저장하기 위한 것.
		//변수의타입 변수이름 ; <= 변수의 선언 : 이타입의 변수를 해당 이름으로 사용할 것을 미리 알려줌.
		//변수에 값 할당 : 변수명 = '변수타입에 맞는 값' ;
		int 변수;
		변수 = 10;
		System.out.println(변수);
		
		// 변수 x , y , z를 각각 선언 .
		// 변수 x에는 5 , y에는 10 , z에는 15를 각각 값 할당을 하고 , 출력해보기.
		int x ;
		int y ;
		int z ;
		x = 5;
		y = 10;
		z = 15;
		//println 반드시 변수 하나이거나 합을 통해서 하나로 합쳐진것만가능함.
		//syso( x ) 가능 : 변수가 하나이기때문에 가능
		//syso( x , y ) 불가능 : 변수가 두개임.
		//syso(x + "" + y + "" + z ) ; 51015 숫자형 변수의 합을 막는다.
		//syso(x+y+z) : 숫자형 변수의 합이 출력 됨.
		//System.out.println(x + " " + y + " " + z); 햇갈림.
		
		//1.블럭킹 내부에서는 같은 이름의 변수는 선언이 불가능하다.
		//int x ; 오류 : 이미 코드의 윗줄에서 선언이 되어있음(사용하겠다고명시됨)
		//2.변수 이름 규칙 : 첫번째 글자는 소문자로 시작하고 의미있는 단어들을 연결해서 사용.
		//단어들의 연결은 대문자로 구분한다.
		//=>자동차의 최대속도를 저장하고싶음 int carMaxSpeed;//카멜(낙타등처럼 단어들이 연결)
		//3.자바 예약어는 사용할 수 없다. (보라색으로 나오는것들 int ,class , void )
		System.out.println(x);
		System.out.println(y);
		System.out.println(z);
		
	}
}
