package project;


public class PhoneS2 extends PhoneS1{
	public String channel;
	private String dmb = "DMB방송";
	int dmbnumber = 10;
	

	public PhoneS2(String color, String model, String condition ,String channel) {
		super(color, model, condition);
		
		this.channel = channel;
	}
	public void dmb(String dmb) {
		System.out.println("전원이 꺼져있어 "+dmb + "을 켤수가 없습니다");
	}
	public void dmbon() {
		System.out.println(dmb + "의 채널을 변경합니다. 현재 채널: " + channel );
	}
	public void dmbchange() {
		System.out.println(dmb + "의 채널을 변경 합니다."+channel + "=> " + dmbnumber+"번으로 변경 됨.");
	}
	public void dmboff(){
		System.out.println(dmb +"을 끕니다." );
	}
	
}
