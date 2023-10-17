package exam.testextends3;

public class DmbPhone extends CellPhone{
	//이미 기능이 완성이 되어있는 1세대(CellPone)를 이용하여 방송기능이 추가 된 2세대 폰 구현
	int channel;

	
	public DmbPhone(String model , String color , int channel) {
		this.channel = channel;
		this.color = color;
		this.model = model;
	}
	
	public void turnOnDmb() {
		System.out.println("채널 " + channel + " 시청시작");
	}
	public void turnOffDmb() {
		System.out.println(channel + " 채널 보다가 종료");
	}
	public void chaangeChannel(int channel) {
		this.channel = channel;
		System.out.println(channel + " 로 변경");
	}

	
}
