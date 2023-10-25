package pack03.android;

public class Button {

	public OnClickListner listner;//null <= 외부에서 어떤 이벤트를 작성 할지 결정
	
// 자주 사용 x	
//	public OnClickListner getListner() {
//		return listner;
//	}
	
	//os가 해줌
	void click() {
		listner.onClick();
	}

	public void setListner(OnClickListner listner) {
		this.listner = listner;
		//실제로 ↓안드로이드가 감지해서 실행함.
		this.click();
	}

	static interface OnClickListner{
		void onClick();
		//OnClickListner라는 인터페이스 형태를 사용하기 위해서 onClick이라는 메소드는 반드시 있어야함.
	}
}
