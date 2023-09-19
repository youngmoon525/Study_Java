package pack02.exswitch;

public class Test_Switch {
	public static void main(String[] args) {
		//스위치문은 값을 가지고만 어떤 조건 분기가 가능하다. "break"를 넣어줘야지만. 끊김.
		// 100 : A학점
		//99~90 : A학점
		//89~80 : B학점.
		//79~70 : C학점
		//69~60 : D학점.
		//스위치문으로 풀어보기.
		int score = 30;
		switch(score/10) {
			case 10:
				System.out.println("A학점");
				break;
			case 9:
				System.out.println("A학점");
				break;
			case 8:
				System.out.println("B학점");
				break;
			case 7:
				System.out.println("C학점");
				break;
			case 6:
				System.out.println("D학점");
				break;
			default://if의 else역할을 한다.
				System.out.println("E학점");
				break;
		}
		
	}
}
