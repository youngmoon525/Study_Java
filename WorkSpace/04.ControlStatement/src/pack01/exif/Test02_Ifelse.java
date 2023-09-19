package pack01.exif;

public class Test02_Ifelse {
//int number = 10; 초기화
//해당 수를 짝수인지 홀수인지를 판단해서 각각 출력하는 프로그램 만들기
//조건 . if와else를 사용할것
//else : 단독으로는 쓸 수 없음. (문법이 if{}else{}) 
//     : else문도 블럭킹이 있기 때문에 독립적인 지역을 가진다 
	public static void main(String[] args) {
		int number = 9;
		if(number%2 == 1) {
			System.out.println("홀수");
		}else {
			System.out.println("짝수");
		}
		
		//해당 수가 3의 배수인지 , 아닌지를 if-else문으로 풀어보기.
		if(number%3 == 0) {
			System.out.println("3의 배수");
		}else {
			System.out.println("3의 배수x");
		}
		
		
	}
}
