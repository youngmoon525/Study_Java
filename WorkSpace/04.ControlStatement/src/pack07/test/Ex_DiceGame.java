package pack07.test;

import java.util.Random;
import java.util.Scanner;

public class Ex_DiceGame {
	public static void main(String[] args) {
		// Random함수 이용해서 enter key를 누를때 컴퓨터 번호생성, 사용자 번호생성 비교 승,패,무승부
		// 반복하는 구조가 어렵다면 , 반복을 제외하고 프로그램을 완성하기.
		//1.기획 : 개발 범위(기능) , 변수사용범위 , 이름 규칙 등등※.
		//2.설계 : 화면(x) , DB
		//3.개발 : 코딩.
		//새로운 블럭킹을 내가 만듬. <= 블럭킹 내부에서만 쓰는 변수. 블럭킹 외부에서도 재사용을 해야하는지
		while (true) {//웹이나 안드로이드 플랫폼(GUI)가 없어서 콘솔이 그 역할을 대신함.(자바끝나면 안씀)
			Random random = new Random();// <=배운거x
			Scanner sc = new Scanner(System.in);
			System.out.println("enter key를 누르면 PC가 주사위를 굴립니다.");
			sc.nextLine();//1.
			int pcNum = random.nextInt(6) + 1;// 0~5 > 1~6

			System.out.println("enter key를 누르면 사용자의 주사위를 굴립니다.");
			sc.nextLine();
			int userNum = random.nextInt(6) + 1;
			if (pcNum > userNum) {
				System.out.println(pcNum + " > " + userNum + " PC승!");
			} else if (pcNum < userNum) {
				System.out.println(pcNum + " < " + userNum + " 유저승!");
			} else {
				System.out.println(pcNum + " = " + userNum + "무승부");
			}
		}

	}
}
