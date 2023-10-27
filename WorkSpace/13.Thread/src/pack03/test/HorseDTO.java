package pack03.test;

public class HorseDTO {
	private int move , rank;
	private String name ;
	private Thread horseThread;
	
	public HorseDTO(String name) {
		this.name = name;
	}

	public int getMove() {
		return move;
	}

	public void setMove(int move) {
		if(move > 100) {
			move = 100;
		}
		this.move = move;
	}

	public int getRank() {
		return rank;
	}

	public void setRank(int rank) {
		this.rank = rank;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Thread getHorseThread() {
		return horseThread;
	}

	public void setHorseThread(Thread horseThread) {
		this.horseThread = horseThread;
	}
	
	
	
	
	

}
