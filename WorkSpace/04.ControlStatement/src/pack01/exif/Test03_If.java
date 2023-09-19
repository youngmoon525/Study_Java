package pack01.exif;

public class Test03_If {
	// char를 이용한 혈액형 분별 프로그램
	public static void main(String[] args) {
		char booldType = 'A';// <= html,android등의 다른 플랫폼에서 오는 데이터.?

		if (booldType == 'A') {
			System.out.println("A형 : 조금 소심");
		} else if (booldType == 'B') {
			System.out.println("B형 : 조금 활발");
		} else if (booldType == 'O') {
			System.out.println("O형 : 조금 깐깐");
		} else {
			System.out.println("AB형 또는 잘못된 입력");
		}
	
		// 내가 알고있는 대부분의 지역은 중첩이 가능하다.
		// ctrl + a : 전체 코드 마킹
		// ctrl + shift + f : 코드 줄 정리

	}// main
}
