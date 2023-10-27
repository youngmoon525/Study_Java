package test03.randomgame;

import java.util.Random;

public class RandomGame {
	public static void main(String[] args) {
		RandomGameDAO dao = new RandomGameDAO();

		int num = dao.getIntData("난이도를 입력해주세요 1~아무숫자 가능");
		dao.startGame(num);
	}
}
