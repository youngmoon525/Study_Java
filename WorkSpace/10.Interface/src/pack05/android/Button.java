package pack05.android;

public class Button {
	//인터페이스를 필드로 두고 , 메소드를 통해서 인터페이스 메소드의 구현부를 받아온다.
	public OnclickListener listner;//필드로 가지고있음
	//null
	
	void setOnclickListner(OnclickListener listner) {
		this.listner = listner;
	}
	
	void click() {
		listner.onClick("View");
	}
	
	
}
