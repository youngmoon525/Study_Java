package pack01.exif;

public class Ex04_IfAndOr {
	public static void main(String[] args) {
		//조건식 : 반드시 true , false를 반환 받는 식.
		//boolean에 담을 수 있는 값.(==조건식)
//		int score = 91;
//		boolean isCheckUp90 = score >= 90;
//		boolean isCheckUp80 = score >= 80;
//		if(isCheckUp90 && isCheckUp80) {
//			System.out.println("A");
//		}else if(isCheckUp90 || isCheckUp80) {
//			System.out.println("B");
//		}else {
//			System.out.println("A B X");
//		}
		
		int number = 9;
		//1.삼항 연산자 활용.
		String result = number % 3 == 0 ? "3배수" : "3배수x";
		if(number%2 == 0) {
			System.out.println("짝수" + result);
			//2.삼항 연산자 가독성 없게 사용 x
			//System.out.println("짝수" + (number % 3 == 0 ? "3배수" : "3배수x"));
		}else {
			System.out.println("홀수" + result);
			//2.삼항 연산자 가독성 없게 사용
			//System.out.println("짝수" + (number % 3 == 0 ? "3배수" : "3배수x"));
		}
		
		if(number%2==0 && number%3==0) {
			System.out.println("짝수 3배수");
		}else if(number%2==0 && number%3!=0) {
			System.out.println("짝수 3배수X");
		}else if(number%2==1 && number%3==0) {
			System.out.println("홀수 3배수");
		}else {
			System.out.println("홀수 3배수x");
		}
		
		if(number%2 == 0) {
			if(number%3 == 0) {
				System.out.println("짝수 3o");
			}else {
				System.out.println("짝수 3x");
			}
		}else {
			if(number%3 == 0) {
				System.out.println("홀수 3o");
			}else {
				System.out.println("홀수 3x");
			}
		}
		
		
		
		//홀수 인지, 짝수 인지 판단.
		//수단과 방법을 x => 
		//number 9 : 홀수 이며 , 3의 배수임.
		//number 10 : 짝수 이며 , 3의 배수 아님
		
		
	}
}
