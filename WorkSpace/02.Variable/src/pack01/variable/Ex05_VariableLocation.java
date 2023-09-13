package pack01.variable;

public class Ex05_VariableLocation {
	//int iv = 10;
	public static void main(String[] args) {
		int var = 10;
		//블럭킹은 자바프로그램의 시작과끝을 의미도 하지만 지역도 의미를 함.
		//자바에서의 지역은 매우 중요한 개념.
		//클래스의 지역을 제외하고, 만들어진 모든 변수들은 지역 변수라고한다.
		//local variable ==> lv
		//<=지역 변수
		{//메모리에 올림
			int num = 10 + var;
			//int num = 10; 변수이름이 중복되서 오류
		}//메모리에서 내림.
		
		{
			int num = 10 + var;
			System.out.println(num);
		}
		
		
		
		
		
		
		
	}
}
