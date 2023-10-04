package pack02.trycatch;

import java.util.Scanner;

public class Test01_TryCatch {
	public static void main(String[] args) {
		//Scanner를 사용하여 -1의 값이 입력되기 전까지 계속해서 숫자를 입력받음.
		//Scanner의 nextLine()기능을 이용하기
		//입력 된 숫자를 계속해서 누적합을 구함(누적시킴)
		//+단, 숫자 외에 값이 입력되면 잘못된 입력!!!!이라고 표시하고 다시 입력을 받음.
		//이프로그램은 -1입력 전까지 비정상 종료가 없는 프로그램
		
		//1.계속해서 입력을 받음.
		//2.-1이 입력되면 프로그램 종료. "-1" or -1
		//3.입력받은 값을 숫자로 변경후 변수에 담기
		//4.누적합구하기
		//5.예외처리.(숫자 외에 값에 대한 예외처리)
		Scanner scan = new Scanner(System.in);
		int sum = 0;
		while(true) {
			String inputData = scan.nextLine();
			if(inputData.equals("-1")) {
				break;
			}
			try {
				int num = Integer.parseInt(inputData);
				sum += num;
				System.out.println(sum);
			}catch (Exception e) {
				System.out.println("숫자 외 값 오류");
			}
		}
	}
}
