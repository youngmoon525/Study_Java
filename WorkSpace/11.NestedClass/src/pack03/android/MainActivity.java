package pack03.android;



public class MainActivity extends AppCompatActivity{
	@Override
	protected void onCreate() {
		super.onCreate();
		//화면을 초기화 하는 단계 (무조건 있어야함)
		//Button 사용자와 상호작용을 위한 객체 : 사용자가 눌렀는지가 중요함
		Button btn = new Button();//실제로는 find..디자인이랑 연결(jquery)
		
		Button.OnClickListner onclickListner = new Button.OnClickListner() {
			@Override
			public void onClick() {
				System.out.println("로그인 버튼 눌리면 여기 실행");
			}
		};
		
		btn.setListner(new Button.OnClickListner() {
			
			@Override
			public void onClick() {
				
			}
		});
		
		btn.setListner(()->{
			
		});
		
	}
	public static void main(String[] args) {
		MainActivity main = new MainActivity();
		main.onCreate();
	}

}
