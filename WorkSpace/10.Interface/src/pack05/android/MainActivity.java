package pack05.android;

public class MainActivity {
	public static void main(String[] args) {
		Button btn =new Button();
		
		OnclickListener on = new OnclickListener() {
			@Override
			public void onClick(Object v) {
				System.out.println("나중에 버튼이 클릭되면 실행 할 코드");
			}
			@Override
			public void method() {
				OnclickListener.super.method();
			}
		};
		
		btn.setOnclickListner(on);
		on.method();
		btn.click();
	}
}
