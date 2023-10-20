package project;

public class PhoneMain1 {
	public static void main(String[] args) {
		PhoneS1 sone = new PhoneS1("검정 ", "S1 ", "종료");
		System.out.println("1세대 폰 (색상 : "+  sone.color+ "모델명 : " + sone.model + " 상태 : " + sone.condition + ") 가 지급 되었습니다.");
		sone.poweron();
		sone.poweron();
		sone.inspection();
		sone.poweroff();
		sone.callon();
		sone.calloff();
		sone.callout();
		sone.poweron();
		sone.hangon();
		sone.me("여보세요?");
		sone.you("여보세요?");
		sone.hangout();
	}
}
