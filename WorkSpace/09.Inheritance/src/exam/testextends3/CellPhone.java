package exam.testextends3;

import java.util.Random;

public class CellPhone {
	//기본 기능들을 가지고있는 최상위 부모클래스
	//필드(인스턴스멤버)
	public String model;//휴대폰 기종
	public String color;//색상
	
	//기능(인스턴스멤버)
	public void powerOn() {
		System.out.println("종료 버튼 눌러서 전원 ON");
	}
	public void powerOff() {
		System.out.println("종료 버튼 눌러서 전원 OFF");
	}
	public void bell() {
		System.out.println("전화 와서 벨울림(소리남)");
	}
	public void hangUp() {
		System.out.println("통화 종료");
	}
	public void receiveVoice() {
		System.out.println("상대방: " + new Random().nextInt(123456)+1);
	}
	public void sendVoice(String voice) {
		System.out.println("나(본인):" +voice);
	}
	
}
