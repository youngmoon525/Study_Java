package project;

public class PhoneMain2{
	public static void main(String[] args) {
	PhoneS2 stwo = new PhoneS2("검정", "S-2", "종료","정보없음");
	System.out.println("2세대 폰 (색상 :"+stwo.color + " 모델명 : " + stwo.model + " 상태:" + stwo.condition + " 채널:" + stwo.channel+ ") 지급 되었습니다.");
	stwo.dmb("DMB방송");
	stwo.poweron();
	stwo.dmbon();
	stwo.dmbchange();
	stwo.dmboff();
	}
}