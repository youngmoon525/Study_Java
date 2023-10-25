package pack05.android;

public interface OnclickListener {
	public void onClick(Object v);//(View v) -> Android에서는 클릭 된 위젯(텍스트,라디오)
	
	default void method() {
		System.out.println("ㅎㅇ");
	}
}
