package pack05.etc;

public class Ex01_Break {
	public static void main(String[] args) {
		//break : 현실에서 브레이크는 바퀴가 달린(자전거,오토바이,자동차 등)물체를 멈출때사용한다.
		//자바에서는 제어문의 중지용으로 사용한다.(break1 => for,while,swith하나를 멈춤.)
		//멈출 제어문 개수 == break문 개수 ==> 전체 제어문을 중지하는게 가능.
		
		while(true) {
			System.out.println("브레이크로 제어문 중지");
			while(true) {
				System.out.println("여기 탈출");
				break;//무한루프 , break문 바로 밑에는 코드 작성이 무의미함. 작성오류
			}
			break;//Unreachable code?
		}
		
		int i=0;
		while(true) {
			System.out.println("while실행중" + i);
			if(i==999) {
				break;
			}
			i++;
		}

		
	}
}
