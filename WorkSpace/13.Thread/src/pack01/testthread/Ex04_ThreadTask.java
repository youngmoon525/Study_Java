package pack01.testthread;

public class Ex04_ThreadTask extends Thread{
	private String taskName ;
	
	
	public Ex04_ThreadTask(String taskName) {
		this.taskName = taskName;
	}


	@Override
	public void run() {
		for(int i =0 ; i<10; i++) {
			System.out.println(taskName + " "+i);
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
