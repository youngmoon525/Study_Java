package pack03.exfor;

public class Ex02_For {
	public static void main(String[] args) {
		// (for문을 안보고) 1~20까지 반복하는 for문 만들기
		// 콘솔에 숫자1~20나오면 성공!
		// print <- 옆으로 (줄바꿈x)
		for (int i = 1; i < 21; i++) {
			if (i % 2 == 1) {
				System.out.print(i + " 홀수 ");
			} else {
				System.out.println(i + " 짝수 ");
			}
		}

		for (int i = 1; i < 21; i++) {
			switch (i % 2) {
			case 1:
				System.out.print(i + "홀수");
				break;
			default:
				System.out.println(i + "짝수");
				break;
			}
		}

		// ※조건문 if로 한번 풀기 ※
		// switch 로 한번 풀기

	}
}
