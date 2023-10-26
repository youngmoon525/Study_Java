package pack01.testthread;

public class Ex04_Main {
	public static void main(String[] args) {
		Thread t1 = new Ex04_ThreadTask("작업1");
		Thread t2 = new Ex04_ThreadTask("작업2");
		Thread t3 = new Thread(()->{
			System.out.println("작업3");
		});
		Thread t4 = new Thread(new Runnable() {
			@Override
			public void run() {
				System.out.println("작업4");
			}
		});
		Thread t5 = new Thread() {
			@Override
			public void run() {
				System.out.println("작업5");
			}
		};
		// 동기  : 프로그램이 위에서 아래로 흐르며 어떤 작업을 할 때 밑의 코드가 실행 x 멈춤 (직렬) 
		// 비동기 : 메인 프로세스랑 상관없이 따로 작업 ↑ (병렬)
		t1.start();
		t2.start();
		t3.start();
		t4.start();
		t5.start();
		System.out.println("메인 쓰레드");
	}
}
