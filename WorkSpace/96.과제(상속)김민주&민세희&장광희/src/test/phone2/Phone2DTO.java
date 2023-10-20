package test.phone2;

import test.phone1.Phone1DTO;

public class Phone2DTO extends Phone1DTO{
	String button , model = "이니셜-2", color = "검정" ; 
//	String channel;
	int channel;
	boolean condition;
	public void name(String color, String model) {
		this.setColor(color);
		this.setModel(model);
		
		
	}
	
}
