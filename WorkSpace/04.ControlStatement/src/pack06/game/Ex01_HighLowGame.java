package pack06.game;

import java.util.Random;
import java.util.Scanner;

public class Ex01_HighLowGame {
	public static void main(String[] args) {
		// 스캐너를 통해서 입력을 받는다. 입력 된 데이터는 변수에 저장.
		// 스캐너를 통해 입력받은 값에 +10한 결과를 출력.
		// 단, 입력은 반드시 숫자값만한다.

		// 1.스캐너로 입력을 받아와서 , 받은 값 출력하기
		// 2.입력을 숫자만하고 출력하기.
		// 3.바꾸기,
		// 4.더해서 출력 -끝-
		// 조별로 , 나눠서 기능 한가지씩 추가.
		// 시도횟수 <- 1
		// 게임시작,종료 <-2.1
		// 1~100까지가 아니라 사용자가 입력한 난이도만큼 범위 커스텀<-2
		Scanner sc = new Scanner(System.in);
		Random random = new Random();
		int randomNumber = random.nextInt(100) + 1;// 0~99//1~100
		System.out.println("하이로우게임 입니다. 랜덤한 숫자를 맞춰주세요.(1~100)");
		while (true) {
			System.out.println("숫자를 입력해주세요.");
			String str = sc.nextLine();
			int userNum = Integer.parseInt(str);
			if (randomNumber == userNum) {
				System.out.println("정답! 축하");
				break;
			} else if (randomNumber > userNum) {
				System.out.println("High!");
			} else if (randomNumber < userNum) {
				System.out.println("Low!");
			}
		}

		// 나중에 추가( 종료 기능 )
//		if(userNum == -1) {
//			System.out.println("프로그램을 종료 합니다.");
//			break;
//		}else if(userNum==1) {
//			
//		}

	}
}
