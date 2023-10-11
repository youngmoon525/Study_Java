package pack01.method;

public class CalculatorMain {
	public static void main(String[] args) {
		Calculator cal = new Calculator();
		cal.plus(10, 20);//void : 결과를 호출하는 부분에서 받아올수x
		cal.minus(20, 20);
		//int result = cal.mul(1, 2);
		System.out.println(cal.mul(1, 2));
		System.out.println(cal.div(5, 2));
		
		
		
	}
}
