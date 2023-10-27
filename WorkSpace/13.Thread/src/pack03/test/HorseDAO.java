package pack03.test;

public class HorseDAO {
	HorseDTO[] horseArr;

	public HorseDAO(int inputNum) {
		horseArr = new HorseDTO[inputNum];
		for(int i=0; i<horseArr.length; i++) {
			horseArr[i] = new HorseDTO(i+1+".말");
			horseArr[i].setHorseThread(getHorseThread(horseArr[i]));
			horseArr[i].getHorseThread().start();
		}
	}
	
	
	public Thread getHorseThread(HorseDTO dto) {
		Thread thread = new Thread(()->{
			while(isMove(dto)) {
				System.out.println(dto.getName() + " " + dto.getMove() + " m ");
				try {
					Thread.sleep(500);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				dto.setMove(dto.getMove() + 30);
			}
		});
		
		return thread;
	}
	
	//100보다 작은 move값이면 true , false
	public boolean isMove(HorseDTO dto) {
		if(dto.getMove() < 100) {
			return true;
		}
		return false;
	}
	
	
}
