package phone;

public class generation2DTO extends generation1DTO {
	private int channel;
	private boolean dmbOnOff;

	public generation2DTO(String color, String model, int channel) {
		super(color, model);
		this.channel = channel;
		this.dmbOnOff = false;
	}

	public int getChannel() {
		return channel;
	}

	public void setChannel(int channel) {
		this.channel = channel;
	}

	public boolean isDmbOnOff() {
		return dmbOnOff;
	}

	public void setDmbOnOff(boolean dmbOnOff) {
		this.dmbOnOff = dmbOnOff;
	}

}
