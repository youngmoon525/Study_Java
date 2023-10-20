package phone;



public class generation3DTO extends generation2DTO{
	private boolean internetOnOff;
	private boolean webtoonOnOff;
	public generation3DTO(String color, String model, int channel) {
		super(color, model, channel);
		this.internetOnOff = false;
		this.webtoonOnOff = false;
	}
	public boolean isInternetOnOff() {
		return internetOnOff;
	}
	public void setInternetOnOff(boolean internetOnOff) {
		this.internetOnOff = internetOnOff;
	}
	public boolean isWebtoonOnOff() {
		return webtoonOnOff;
	}
	public void setWebtoonOnOff(boolean webtoonOnOff) {
		this.webtoonOnOff = webtoonOnOff;
	}
	
}
