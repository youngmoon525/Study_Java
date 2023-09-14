package pack03.typechange;

public class Ex03_CastingString {
	public static void main(String[] args) {
		//String 변수 str1 , str2를 각각 10과 20의 값을 담아 초기화 시키고,
		//출력문에서 str1과 str2의 합을 출력해보자.
		String str1 = "10";
		String str2 = "20";
		System.out.println(str1 + str2);
		
		int intV1 = 10;
		int intV2 = 20;
		System.out.println(intV1 + intV2);
		
		//String의 연산 법칙 : Concatenation(연결)
		//String의 +는 문자열의 연결을 의미하며 
		//어떤 변수를 String에 더해도 그 변수의 타입은 자동으로 String이 된다.
		//Java에서도 연산 순서는 왼쪽에서부터 시작
		//따로 연산이 필요한 식이 있다면 ( ) 소괄호 처리를 해주면 된다.
		System.out.println("10" + (10 + 20));//출력 된 결과의 타입은 무엇을까?
		//숫자->String : +String해주면 끝
		//WrapperClass(포장):String을 WrapperClass로 감싸주면 해당 타입으로 변한다.
		//double->Double,byte->Byte,short->Short,..
		//※int->Integer※ parse메소드(5장)
		int number1 = Integer.parseInt( str1 );//"10"->코테이션제거->10
		System.out.println(number1+20);
		int number2 = Integer.parseInt("30");
		System.out.println(number2);
	
		String numberString = 10+"";//?"10"(x)
		System.out.println(numberString+10);
	}
	
	
	
	
}
