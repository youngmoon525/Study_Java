package pack03.typechange;

public class Ex02_Casting {
	public static void main(String[] args) {
		//0.아래의 명령은 무슨 캐스팅이라고 표현하는가?
			//자동 형변환 , UpCasting , 묵시적 형변환
		//1.아래의 명령은 몇 번의 캐스팅이 발생했는가?
			//1.1: 3.5F + 12.0F -> int-> Float
			//1.2: 15.5F -> float -> double
			//제일 큰 타입(담는것)을 제외 한 타입의 개수만큼 타입변환이 발생됨
			//줄에 있는 전체 타입 개수(N-1)
		double sum = 3.5F + 12;
		System.out.println(sum);
		
		//2진수로는 소수점을 정확하게 표현을 못함. 근사치를 계속해서 계산.
		//BigDecimal(x) 
		//데이터의 정확한 계산은-> Database
		//double sum2 = 3.14F + 12;
		//System.out.println(sum2);
		
	}
}
