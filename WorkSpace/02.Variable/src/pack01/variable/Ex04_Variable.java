package pack01.variable;

public class Ex04_Variable {
	public static void main(String[] args) {
		//변수를 왜 꼭 사용 해야할까?
		//=>이유 : 1.재사용이 가능하다. 
		//2. 한번에 수정이 가능하다 ( 일괄 )
		
		
		int int ;
		//3.--> 아직 배우지 않은 개념.
		int num = 30; // 어떤 물건의 가격
		int numUp20 = num + 20 ;
		
		System.out.println(num-1);//할인금액
		System.out.println(num*3);//물건을 세개 구매한경우
		System.out.println(num);
		
		System.out.println(20-1);
		System.out.println(20*3);
		System.out.println(20);
		
		
		
		System.out.println(num);//변수에 10이라는 숫자를 담아서 출력한 경우
		System.out.println(10);//그냥 숫자 10을 출력한 경우
	}
}
