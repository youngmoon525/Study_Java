package pack01.method;

public class Computer {
	//ComputerMain에서 plus메소드를 호출하는데! 컴퓨터의 전원(isPower)이 켜졌을때는 기능이 똑같이되고 1,2=>3
	//그게 아니라면 "먼저 컴퓨터의 전원을 켜주세요"라는 메세지가 출력되게 해보기.
	
	boolean isPower ; //기본:false 전역변수
	
	public void plus(int num1 , int num2) {
		if(isPower) {			
			System.out.println(num1 + num2);
		}else {
			System.out.println("전원을 켜주세요@!!");
		}
		
	}
}
