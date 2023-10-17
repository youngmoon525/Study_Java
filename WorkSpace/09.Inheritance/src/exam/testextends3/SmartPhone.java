package exam.testextends3;

//3세대 폰 : 전화기능(1) + DMB기능(2) + 스마트폰기능
public class SmartPhone extends DmbPhone{
	String internetSpeed;
	

	//부모클래스가 먼저 생성이 되는데 DmbPhone은 3개의 파라메터를 입력받는 생성자 메소드가 존재.
	//따라서 DmbPhone이 생성되기위한 Stringx2,intx1가 반드시 필요함
	public SmartPhone(String model, String color, int channel ,String internetSpeed) {
		super(model, color, channel);
		this.internetSpeed = internetSpeed;
	}
	
	@Override
	public void powerOn() {
		//super.powerOn();<=부모클래스에 있는 메소드를 그대로 사용 
		System.out.println("옆에 있는 버튼 눌러서 전원 ON");
	}

	public void onInternet() {
		System.out.println(internetSpeed+"의 속도로 웹툰봄");
		
	}

}
