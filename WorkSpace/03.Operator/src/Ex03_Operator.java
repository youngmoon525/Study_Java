
public class Ex03_Operator {
	public static void main(String[] args) {
		// ++ , --
		//복습해도됨. 엄청 많이씀 , 증감 , 가감( 현실 x )
		int num1 = 1 , num2 = 1;
		num1++;// 변수+1
		++num2;
		System.out.println(num1);
		System.out.println(num2);
		//※ 선행 연산: 변수 앞에 증감식을 사용 , 후행 연산: 변수 뒤에 증감식을 사용 ※
		System.out.println(num1++);
		System.out.println(++num2);
		
		System.out.println("증감식 종료 후 num1 : " + num1);
		System.out.println("증감식 종료 후 num2 : " + num2);
		
		
		
		
	}
}
