package pack02.threadattr;

public class Main {
	public static void main(String[] args) {
		Thread mainThread = Thread.currentThread();//현재 작업중인 스레드를 가져옴
		System.out.println(mainThread.getName());
		
		ThreadA tA = new ThreadA();
		ThreadB tB = new ThreadB();
		
		System.out.println(tA.getName());
		System.out.println(tB.getName());
		
		tA.start();
		tB.start();
	}
}
