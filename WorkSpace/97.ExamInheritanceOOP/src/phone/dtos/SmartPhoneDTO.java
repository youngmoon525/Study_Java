package phone.dtos;

public class SmartPhoneDTO extends DmbPhoneDTO {
	private boolean isInternet;

	public SmartPhoneDTO(String color, String model) {
		super(color, model);
	}
	
	@Override
	public void setPower(boolean isPower) {
		super.setPower(isPower);
		isInternet  =false;
	}

	public boolean isInternet() {
		return isInternet;
	}

	public void setInternet(boolean isInternet) {
		if(!isPower()) {
			System.out.println("전원 꺼짐 불가!!");
			return;
		}
		
		this.isInternet = isInternet;
		if(isInternet) {
			System.out.println("인터넷 켜짐");
		}else {
			System.out.println("인터넷 꺼짐");
		}
	
	}

}
