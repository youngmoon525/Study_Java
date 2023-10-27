package test03.randomgame;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class RandomGameDAO {
	Scanner sc;
	String[] randoms ;
	int tryCount , answer;
	public RandomGameDAO() {
		sc = new Scanner(System.in);
	}

	public String getStrData() {
		return sc.nextLine();
	}
	
	
	public int getIntData(String msg) {
		System.out.println(msg);
		return getIntData();
	}
	
	public int getIntData() {
		while (true) {
			try {
				return Integer.parseInt(getStrData());
			} catch (Exception e) {
				System.out.println("숫자만입력해주세요.");
			}
		}
	}

	public void startGame(int num) {
		initArray(num);
		while(true) {
			tryCount++;
			displayArray();
			int inputNum = getIntData("정답 입력")-1;
			
			if(isCheck(inputNum)) {
				System.out.println("끝" + tryCount + " 시도");
				break;
			}else {
				System.out.println("땡");
			}
		}
	}
	public void initArray(int num) {
		answer = new Random().nextInt(num);
		randoms = new String[num];
		for (int i = 0; i < randoms.length; i++) {
			randoms[i] = "?";
		}
	}
	public void displayArray() {
		System.out.println(Arrays.toString(randoms));
	}
	public boolean isCheck(int inputNum) {
		if(inputNum == answer) {
			return true;
		}else {
			randoms[inputNum] = "X";
			return false;
		}
	}
	
}
