package exam.testextends3;

public class PhoneMain2 {
	public static void main(String[] args) {
		//스마트폰 생성후 기능 사용 ( 멤버접근 )
		SmartPhone phone = new SmartPhone("스마트폰 삼성", "검정", 0, "5G");
		phone.powerOn();
		phone.onInternet();
	}
}
