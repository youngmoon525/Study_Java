package pack02.threadattr;

import java.util.Scanner;

public class KymThreadMain {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int number = Integer.parseInt(sc.nextLine());
		KymThread thread = new KymThread(number);
		thread.start();
	}
}
