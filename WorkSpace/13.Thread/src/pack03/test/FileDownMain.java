package pack03.test;

import java.util.Scanner;

public class FileDownMain {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		while (true) {
			String inputData = sc.nextLine();
			if (inputData.equals("-1")) {
				System.out.println("중단");
				break;
			}
			FileDownTask task = new FileDownTask(inputData);// TEST=>Scanner 이용
			task.start();
		}
		sc.close();
		methodCall(()->{
			
		});
		methodCall(( x , y)->{
			
		});
	}

	static void methodCall(Interface1 inter) {

	}

	static void methodCall(Interface2 inter) {

	}
	@FunctionalInterface
	interface Interface1 {
		void method();
	}

	@FunctionalInterface
	interface Interface2 {
		void method(int x, int y);
	}

}
