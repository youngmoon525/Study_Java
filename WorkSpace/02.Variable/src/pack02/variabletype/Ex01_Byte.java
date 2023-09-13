package pack02.variabletype;

public class Ex01_Byte {
	public static void main(String[] args) {
		//byte자체는 직접 사용을 많이 안하기 때문에 이런 종류가 있다 정도만 인지하면 된다.
		//byte byte1 = -129; : -128~127까지의 범위만 나타낼수있음.(byte)
		//	(+0)				  부호 비트때문에 양수에서 값 하나가 적다.
		
		// byte변수 문제)
		// 1. byte1이라는 변수를 선언하기.
		byte byte1 ;
		// 2. byte1이라는 변수에 값 100을 할당하고 출력하기.
		byte1 = 100;
		System.out.println(byte1);
		// 3. byte2~4까지의 변수를 나열해서 선언하기.
		byte byte2 , byte3 , byte4 ;
		// 4. byte2~4까지의 변수에 값 할당하기. 각각 20 , 30 , 40
		byte2=20;
		byte3=30;
		byte4=40;
		// 5. byte5~6을 나열과 동시에 초기화하기.
		byte byte5=50 , byte6=60;
		 
	}
}
