package exam.testextends3;

public class PhoneMain1 {
	public static void main(String[] args) {
		DmbPhone dmb = new DmbPhone("DMB 폰 삼성", "검정", 0);
		System.out.println(dmb.model + " "+ dmb.color + " 준비완료");
		dmb.powerOn();
		dmb.bell();
		dmb.sendVoice("여보세요?");
		dmb.receiveVoice();
		dmb.hangUp();
		dmb.chaangeChannel(10);
		dmb.turnOnDmb();
		dmb.turnOffDmb();
		
		dmb.powerOff();
	}
}
