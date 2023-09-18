package pack01.exif;

public class Ex02_IfElse {
	public static void main(String[] args) {
		//if(조건식){
			//조건식이 true일때 실행 코드(참)
		//}else{
			//반드시 if문 블럭킹 끝에 붙으며 별도의 조건x
			//조건식의 조건이 false일때 실행하는 코드를 넣어준다.
		//}
		int score = 100;
		if(score >= 90) {
			System.out.println("90점 이상 A등급");
		}else {
			System.out.println("90점 미만 A등급x");
		}
		
		//만약에 score변수 내부에 있는 값이 90점 이상이면 점수가 90이상이며 A등급을 출력
		//그외에는 90보다 작음 . A등급 아님을 출력하는 프로그램을 ifelse문을 이용해서만들기
		
		
	}//main
}//class
