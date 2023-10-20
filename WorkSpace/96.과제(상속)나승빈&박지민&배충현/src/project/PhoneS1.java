package project;

public class PhoneS1 {
	public String model;
	public String color;
	public String condition;
	
	public PhoneS1(String color, String model, String condition) {
		this.model = model;
		this.color = color;
		this.condition = condition;
		
	}

	public void poweron() {
		System.out.println(model + "전원이 켜졌습니다.");
	}	
	public void inspection() {
		System.out.println(model + "모든 기능을 점검합니다.");
	}
	public void poweroff() {
		System.out.println(model + "전원이 꺼졌습니다.");
	}
	public void callon() {
		System.out.println("전원이 꺼져있어 전화받기가 불가 합니다.");
	}
	public void calloff() {
		System.out.println("전원이 꺼져있어 전화 끊기가 불가 합니다.");
	}
	public void callout() {
		System.out.println("통화중이 상태가 아닙니다. 음성 전송 & 수신이 불가 합니다.");
	}
	public void hangon() {
		System.out.println("전화가 와서 전화를 받았습니다.");
	}
	public void hangout() {
		System.out.println("전화를 끊습니다.");
	}
	public void me(String voice) {
		System.out.println("나 : " + voice);
	}
	public void you(String voice) {
		System.out.println("상대방 : " + voice);
	}
}
