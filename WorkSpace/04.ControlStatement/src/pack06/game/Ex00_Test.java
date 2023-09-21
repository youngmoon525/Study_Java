package pack06.game;

public class Ex00_Test {
	public static void main(String[] args) {
		int randomNumber = 10 ;
		int userNum = 15;
		if(randomNumber == userNum) {
			System.out.println("정답");
		}else if(randomNumber > userNum) {
			System.out.println("High");
		}else {
			System.out.println("Low");
		}
	}
}
