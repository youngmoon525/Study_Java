package pack01.method;

public class ComputerMain {
	public static void main(String[] args) {
		Computer com = new Computer();
		//if(com.isPower) {
			com.plus(1, 2);
			com.isPower = true;
			com.plus(10, 20);
		//}else {
		//	System.out.println("전원 켜주세요.");
		//}
	}
}
