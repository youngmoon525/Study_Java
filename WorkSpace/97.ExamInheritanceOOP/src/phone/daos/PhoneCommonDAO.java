package phone.daos;

import java.util.Scanner;

import phone.dtos.DmbPhoneDTO;
import phone.dtos.PhoneDTO;
import phone.dtos.SmartPhoneDTO;

public class PhoneCommonDAO {
	Scanner sc;
	PhoneDTO dto;
	int menuCount;
	String[] menus = { "전원ON/OFF", "전화 받기/끄기", "통화하기", "DMBON/OFF", "채널 변경", "인터넷ON/OFF", "웹툰 켜기" };

	public PhoneCommonDAO(PhoneDTO dto) {
		sc = new Scanner(System.in);
		this.dto = dto;
		if (dto instanceof SmartPhoneDTO) {
			System.out.print("3세대 폰 생성");
			menuCount = 7;

		} else if (dto instanceof DmbPhoneDTO) {
			System.out.print("2세대 폰 생성");
			menuCount = 5;
		} else if (dto instanceof PhoneDTO) {
			System.out.print("1세대 폰 생성");
			menuCount = 3;
		}
		System.out.println("색상 : " + dto.getColor() + " 모델 : " + dto.getModel());

	}

	public void startProgram() {
		while (true) {
			displayMenu();
			int choiceMenu = inputInt();
			switch (choiceMenu) {
			case 1:
				changePower();
				break;
			case 2:
				changeCall();
				break;
			case 3:
				changeVoice(true);
				changeVoice(false);
				break;
			case 4:
				changeDmb();
				break;
			case 5:
				changeChannel(inputInt());
				break;
			case 6:
				chageInternet();
				break;
			case 7:
				showWebToon();
				break;
			default:
				System.out.println("잘못입력!!");
				break;
			}
		}
	}

	public int inputInt() {
		while (true) {
			try {
				return Integer.parseInt(sc.nextLine());
			} catch (Exception e) {
				System.out.println("숫자를 입력하세요");
			}
		}
	}

	

	public void displayMenu() {
		for (int i = 0; i < menuCount; i++) {
			System.out.print(i + 1 + ". " + menus[i] + " ");
		}
	}

	public void changePower() {
		dto.setPower(!dto.isPower());
	}

	public void changeCall() {
		dto.setCall(!dto.isCall());
	}

	public void changeVoice(boolean user) {
		if (dto.isCall()) {
			System.out.println(user ? "나" : "상대방" + " : "  + sc.nextLine());
		} else {
			System.out.println("통화중아님");
		}
	}

	public void changeDmb() {
		DmbPhoneDTO dmbDto = getDmbPhone();
		if (!phoneNullCheck(dmbDto)) {
			System.out.println("디엠비 기능 없음");
			return;
		}
		dmbDto.setDmb(!dmbDto.isDmb());
	}

	public void changeChannel(int channel) {
		DmbPhoneDTO dmbDto = getDmbPhone();
		if (!phoneNullCheck(dmbDto)) {
			System.out.println("디엠비 기능 없음");
			return;
		}
		dmbDto.setChannel(channel);
	}

	private DmbPhoneDTO getDmbPhone() {
		if (dto instanceof DmbPhoneDTO) {
			return (DmbPhoneDTO) dto;
		}
		return null;
	}

	public void chageInternet() {
		SmartPhoneDTO smtDto = getSmartPhone();
		if (!phoneNullCheck(smtDto)) {
			System.out.println("인터넷 기능 없음");
			return;
		}
		smtDto.setInternet(!smtDto.isInternet());
	}

	public void showWebToon() {
		SmartPhoneDTO smtDto = getSmartPhone();
		if (smtDto.isInternet()) {
			System.out.println("웹툰보기");
		} else {
			System.out.println("인터넷 먼저키세요");
		}
	}

	private SmartPhoneDTO getSmartPhone() {
		if (dto instanceof SmartPhoneDTO) {
			return (SmartPhoneDTO) dto;
		}
		return null;
	}

	public boolean phoneNullCheck(PhoneDTO dto) {
		return dto == null ? false : true;
	}

}
