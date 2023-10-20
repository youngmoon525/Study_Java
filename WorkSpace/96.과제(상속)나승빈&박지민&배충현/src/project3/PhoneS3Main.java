package project3;


public class PhoneS3Main {
	public static void main(String[] args) {
		
		PhoneS3 sone = new PhoneS3("S3 ", "검정 ", "종료", "정보없음");
		System.out.println("3세대 폰 (색상 : "+  sone.color+ "모델명 : " + sone.model + " 상태 : " + sone.condition + " 채널 : " + sone.channel + ") 가 지급 되었습니다.");
	
		sone.dmbOff();
		sone.internetOff();
		sone.powerOn();
		sone.hangon();
		sone.me("여보세요?");
		sone.internetOn();
		sone.webtoonOn();
		sone.you("뭐하세요?");
		sone.me1("웹툰봅니다.");
		sone.hangout();
	
	}
}
