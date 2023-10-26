package pack02.threadattr;

// 일반 클래스 : start 기능 x
// 일반 클래스 : run이 override(재정의) x 
// Runnable 인터페이스 상속 or Runnable을 상속받은 Thread객체를 상속
public class KymThread extends Thread{
	private int number;
	
	
	public KymThread(int number) {
		this.number = number;
	}


	@Override
	public void run() {
		for(int i=2 ; i<=number; i++) {
			for(int j=1; j<=9; j++) {
				System.out.println(i + "*" + j +"=" + (i*j));				
			}
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
