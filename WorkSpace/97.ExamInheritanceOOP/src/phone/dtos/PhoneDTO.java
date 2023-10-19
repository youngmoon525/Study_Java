package phone.dtos;


public class PhoneDTO {
	private String color , model ;
	private boolean isPower , isCall;
	
	public PhoneDTO(String color, String model) {
		this.color = color;
		this.model = model;
	}
	
	
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}


	public boolean isPower() {
		return isPower;
	}


	public void setPower(boolean isPower) {
		this.isPower = isPower;
		if(isPower) {
			System.out.println("전원 켜짐");
		}else {
			System.out.println("전원 꺼짐");
		}
		isCall = false;
	}


	public boolean isCall() {
		return isCall;
	}


	public void setCall(boolean isCall) {
		if(!isPower) {
			System.out.println("전원 꺼짐 불가!!");
			return;
		}
		this.isCall = isCall;
		if(isCall) {
			System.out.println("통화 시작");
		}else {
			System.out.println("통화 종료");
		}
	}
	
	
	
	
	
	
	
	
	
	
}
