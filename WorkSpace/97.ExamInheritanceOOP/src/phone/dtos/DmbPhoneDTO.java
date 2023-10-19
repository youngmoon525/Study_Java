package phone.dtos;

public class DmbPhoneDTO extends PhoneDTO{
	private boolean isDmb;
	private int channel;
	
	
	public DmbPhoneDTO(String color, String model) {
		super(color, model);
	}

	@Override
	public void setPower(boolean isPower) {
		super.setPower(isPower);
		this.isDmb = false;
	}
	
	
	
	
	public int getChannel() {
		return channel;
	}

	public void setChannel(int channel) {
		if(!isDmb) {
			System.out.println("디엠비 안켜져있음");
			return;
		}else if(this.channel == channel) {
			System.out.println("같은 채널임다");
			return;
		}
		
		System.out.println(channel + " 변경됨");
		this.channel = channel;
	}

	public boolean isDmb() {
		return isDmb;
	}

	public void setDmb(boolean isDmb) {
		if(!isPower()) {
			System.out.println("전원 꺼짐 불가!!");
			return;
		}else if(isCall()) {
			System.out.println("통화중 사용 불가!!");
			return;
		}
		
		
		this.isDmb = isDmb;
		
		if(isDmb) {
			System.out.println("DMB 시작");
		}else {
			System.out.println("DMB 종료");
		}
	}
	
	

}
