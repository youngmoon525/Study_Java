package pack01.variable;

public class Ex05_VariableLocation {
	public static void main(String[] args) {
		//블럭킹은 자바프로그램의 시작과끝을 의미도 하지만 지역도 의미를 함.
		//자바에서의 지역은 매우 중요한 개념.
		//클래스의 지역을 제외하고, 만들어진 모든 변수들은 지역 변수라고한다.
		//local variable ==> lv
		//<=지역 변수
		{//메모리에 올림
			int num = 10;	
		}//메모리에서 내림.
		
		{
			System.out.println(num);
		}
		
	}
}
