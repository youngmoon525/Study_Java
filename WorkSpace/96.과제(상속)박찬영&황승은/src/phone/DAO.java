package phone;
import java.util.Scanner;

public class DAO extends SuperPhone {
	Scanner sc = new Scanner(System.in);

	SuperPhone sp;

	public DAO() {
		super.sps = initPhone();
	}

	public void choosePhone() {
		while (true) {
			System.out.println("사용할 폰을 선택하세요");
			displayChoose();
			int temp = getIntByScan();
			if(temp>0&&temp<=sps.length) {
				runPhone(sps[temp-1]);
			} else if(temp==0) {
				break;
			} else if(temp==99) {
				createNewPhone();
			}
		}
	}

	public void displayChoose() {
		for (int i = 0; i < sps.length; i++) {
			if (i % 5 != 4) {
				System.out.print((i+1)+"."+getModel(sps[i])+" ");
			} else {
				System.out.println((i+1)+"."+getModel(sps[i])+" ");
			}
		}
		System.out.println("0.프로그램종료 99.새로운폰생성");
	}
	
	public String getModel(SuperPhone sp) {
		generation1DTO dto = (generation1DTO) sp;
		return dto.getModel();
	}
	
	public void createNewPhone() {
		System.out.println("1~3세대 휴대폰 종류를 선택하세요.");
		SuperPhone sp = null;
		switch (getIntByScan()) {
		case 1:
			System.out.println("색상, 모델명을 차례로 입력하세요.");
			sp = new generation1DTO(getStringByScan(), getStringByScan());
			break;
		case 2:
			System.out.println("색상, 모델명을 차례로 입력하세요.");
			sp = new generation2DTO(getStringByScan(), getStringByScan(), 0);
			break;
		case 3:
			System.out.println("색상, 모델명을 차례로 입력하세요.");
			sp = new generation3DTO(getStringByScan(), getStringByScan(), 0);
			break;
		default:
			break;
		}
		SuperPhone[] temp = new SuperPhone[sps.length + 1];
		for (int i = 0; i < sps.length; i++) {
			temp[i] = sps[i];
		}
		temp[sps.length] = sp;
		this.sps = temp;
	}

	public String getStringByScan() {
		while (true) {
			String str = sc.nextLine();
			if (str.equals("")) {
				System.out.println("내용을 입력하세요");
			} else {
				return str;
			}
		}
	}

	public void runPhone(SuperPhone sp) {
		this.sp = sp;
		nowPhone();
		while (true) {
			System.out.println("핸드폰 조작 명령");
			displayMenu();
			boolean change = false;// 핸드폰 조작 종료시 true로 변경
			switch (getIntByScan()) {
			case 1:
				onOff();
				break;
			case 2:
				callOnOff();
				break;
			case 3:
				sendVoice();
				break;
			case 4:
				receiveVoice();
				break;
			case 5:
				dmbToggle();
				break;
			case 6:
				dmbChannel();
				break;
			case 7:
				internetToggle();
				break;
			case 8:
				webtoonToggle();
				break;
			case 9:
				displaySystem();
				break;
			case 0:
				change = true;
				break;
			default:
				System.out.println("해당 번호의 기능이 없습니다.");
				break;
			}
			if (change) {
				break;
			}
			System.out.println();
		}
	}

	public void displayMenu() {
		System.out.println("1.전원버튼 2.전화버튼 3.음성송신 4.음성수신 5.DMB버튼");
		System.out.println("6.DMB채널변경 7.인터넷버튼 8.웹툰 버튼 9.시스템상태보기 0.핸드폰 전환");
	}

	public void displaySystem() {
		if (sp instanceof generation3DTO) {
			generation3DTO dto = (generation3DTO) sp;
			System.out.println("3세대 핸드폰");
			System.out.println("모델명: " + dto.getModel() + " 색상: " + dto.getColor() + " 채널: " + dto.getChannel());
			System.out.println("현재 동작하는 기능 : " + utilCheck());
		} else if (sp instanceof generation2DTO) {
			generation2DTO dto = (generation2DTO) sp;
			System.out.println("2세대 핸드폰");
			System.out.println("모델명: " + dto.getModel() + " 색상: " + dto.getColor() + " 채널: " + dto.getChannel());
			System.out.println("현재 동작하는 기능 : " + utilCheck());
		} else if (sp instanceof generation1DTO) {
			generation1DTO dto = (generation1DTO) sp;
			System.out.println("1세대 핸드폰");
			System.out.println("모델명: " + dto.getModel() + " 색상: " + dto.getColor());
			System.out.println("현재 동작하는 기능 : " + utilCheck());
		}
	}

	public String utilCheck() {
		String str = "";
		if (sp instanceof generation3DTO) {
			generation3DTO dto = (generation3DTO) sp;
			if (dto.isCallOnOff()) {
				str += "통화기능 ";
			}
			if (dto.isDmbOnOff()) {
				str += "DMB기능 ";
			}
			if (dto.isInternetOnOff()) {
				str += "인터넷기능 ";
			}
			if (dto.isWebtoonOnOff()) {
				str += "웹툰기능 ";
			}
			if (str.equals("")) {
				str += "없음";
			}
			return str;
		} else if (sp instanceof generation2DTO) {
			generation2DTO dto = (generation2DTO) sp;
			if (dto.isCallOnOff()) {
				str += "통화기능 ";
			}
			if (dto.isDmbOnOff()) {
				str += "DMB기능 ";
			}
			if (str.equals("")) {
				str += "없음";
			}
			return str;
		} else {
			generation1DTO dto = (generation1DTO) sp;
			if (dto.isCallOnOff()) {
				str += "통화기능 ";
			}
			if (str.equals("")) {
				str += "없음";
			}
			return str;
		}
	}

	public int getIntByScan() {
		while (true) {
			try {
				return Integer.parseInt(sc.nextLine());
			} catch (Exception e) {
				System.out.println("숫자만 입력 가능. 다시 입력하세요.");
			}
		}
	}

	public SuperPhone[] initPhone() {
		SuperPhone[] sps = new SuperPhone[3];
		sps[0] = new generation1DTO("흰색", "폴더폰");
		sps[1] = new generation2DTO("파란색", "슬라이드폰", 0);
		sps[2] = new generation3DTO("검정색", "스마트폰", 0);
		System.out.println("1세대 흰색 폴더폰이 지급되었습니다.");
		System.out.println("2세대 파란색 슬라이드폰이 지급되었습니다.");
		System.out.println("3세대 검정색 스마트폰이 지급되었습니다.");
		return sps;
	}

	public void nowPhone() {
		if (sp instanceof generation3DTO) {
			System.out.println("3세대 폰 사용중");
		} else if (sp instanceof generation2DTO) {
			System.out.println("2세대 폰 사용중");
		} else {
			System.out.println("1세대 폰 사용중");
		}
	}

	public generation1DTO get1Dto() {
		if (sp instanceof generation1DTO) {
			return (generation1DTO) sp;
		}
		return null;
	}

	public generation2DTO get2Dto() {
		if (sp instanceof generation2DTO) {
			return (generation2DTO) sp;
		}
		return null;
	}

	public generation3DTO get3Dto() {
		if (sp instanceof generation3DTO) {
			return (generation3DTO) sp;
		}
		return null;
	}

	public boolean noNullCheck(SuperPhone sp) {
		if (sp == null) {
			return false;
		}
		return true;
	}

	public void onOff() {
		if (sp instanceof generation3DTO) {
			generation3DTO dto = get3Dto();
			if (dto.isPowerOnOff()) {
				if (dto.isCallOnOff()) {
					dto.setCallOnOff(false);
					System.out.println("통화가 종료되었습니다.");
				}
				if (dto.isDmbOnOff()) {
					dto.setDmbOnOff(false);
					System.out.println("dmb가 꺼졌습니다.");
				}
				if (dto.isWebtoonOnOff()) {
					dto.setWebtoonOnOff(false);
					System.out.println("웹툰 앱이 종료되었습니다.");
				}
				if (dto.isInternetOnOff()) {
					dto.setInternetOnOff(false);
					System.out.println("인터넷이 꺼졌습니다.");
				}
				dto.setPowerOnOff(false);
				System.out.println("전원이 꺼졌습니다.");
			} else {
				dto.setPowerOnOff(true);
				System.out.println("전원이 켜졌습니다.");
			}
		} else if (sp instanceof generation2DTO) {
			generation2DTO dto = get2Dto();
			if (dto.isPowerOnOff()) {
				if (dto.isCallOnOff()) {
					dto.setCallOnOff(false);
					System.out.println("통화가 종료되었습니다.");
				}
				if (dto.isDmbOnOff()) {
					dto.setDmbOnOff(false);
					System.out.println("dmb가 꺼졌습니다.");
				}
				dto.setPowerOnOff(false);
				System.out.println("전원이 꺼졌습니다.");
			} else {
				dto.setPowerOnOff(true);
				System.out.println("전원이 켜졌습니다.");
			}
		} else if (sp instanceof generation1DTO) {
			generation1DTO dto = get1Dto();
			if (dto.isPowerOnOff()) {
				if (dto.isCallOnOff()) {
					dto.setCallOnOff(false);
					System.out.println("통화가 종료되었습니다.");
				}
				dto.setPowerOnOff(false);
				System.out.println("전원이 꺼졌습니다.");
			} else {
				dto.setPowerOnOff(true);
				System.out.println("전원이 켜졌습니다.");
			}
		}
	}

	public void callOnOff() {
		if (sp instanceof generation3DTO) {
			generation3DTO dto = get3Dto();
			if (powerRequire(dto)) {
				if (noDmbRequire(dto)) {
					if (noInternetRequire(dto)) {
						if (dto.isCallOnOff()) {
							dto.setCallOnOff(false);
							System.out.println("통화가 종료됩니다.");
						} else {
							dto.setCallOnOff(true);
							System.out.println("통화가 시작됩니다.");
						}
					}
				}
			}
		} else if (sp instanceof generation2DTO) {
			generation2DTO dto = get2Dto();
			if (powerRequire(dto)) {
				if (noDmbRequire(dto)) {
					if (dto.isCallOnOff()) {
						dto.setCallOnOff(false);
						System.out.println("통화가 종료됩니다.");
					} else {
						dto.setCallOnOff(true);
						System.out.println("통화가 시작됩니다.");
					}
				}
			}
		} else if (sp instanceof generation1DTO) {
			generation1DTO dto = get1Dto();
			if (powerRequire(dto)) {
				if (dto.isCallOnOff()) {
					dto.setCallOnOff(false);
					System.out.println("통화가 종료됩니다.");
				} else {
					dto.setCallOnOff(true);
					System.out.println("통화가 시작됩니다.");
				}
			}
		}
	}

	public void sendVoice() {
		if (sp instanceof generation1DTO) {
			generation1DTO dto = get1Dto();
			if (powerRequire(dto)) {
				if (callRequire(dto)) {
					System.out.print("나:");
					sc.nextLine();
				}
			}
		}
	}

	public void receiveVoice() {
		if (sp instanceof generation1DTO) {
			generation1DTO dto = get1Dto();
			if (powerRequire(dto)) {
				if (callRequire(dto)) {
					System.out.print("상대방:");
					sc.nextLine();
				}
			}
		}
	}

	public void dmbToggle() {
		if (sp instanceof generation3DTO) {
			generation3DTO dto = get3Dto();
			if (noNullCheck(dto)) {
				if (powerRequire(dto)) {
					if (noCallRequire(dto)) {
						if (noInternetRequire(dto)) {
							if (dto.isDmbOnOff()) {
								System.out.println("DMB를 종료합니다.");
								dto.setDmbOnOff(false);
							} else {
								System.out.println("DMB를 시작합니다.");
								dto.setDmbOnOff(true);
							}
						}
					}
				}
			}
		} else if (sp instanceof generation2DTO) {
			generation2DTO dto = get2Dto();
			if (noNullCheck(dto)) {
				if (powerRequire(dto)) {
					if (noCallRequire(dto)) {
						if (dto.isDmbOnOff()) {
							System.out.println("DMB를 종료합니다.");
							dto.setDmbOnOff(false);
						} else {
							System.out.println("DMB를 시작합니다.");
							dto.setDmbOnOff(true);
						}
					}
				}
			}
		} else {
			System.out.println("dmb 불가능한 핸드폰입니다.");
		}
	}

	public void dmbChannel() {
		generation2DTO dto = get2Dto();
		if (!noNullCheck(dto)) {
			System.out.println("DMB 불가능한 핸드폰입니다.");
		} else if (!dto.isDmbOnOff()) {
			System.out.println("먼저 dmb를 켜주세요.");
		} else {
			int channel = getIntByScan();
			int before = dto.getChannel();
			dto.setChannel(channel);
			int now = dto.getChannel();
			System.out.println(before + "에서 " + now + "로 채널을 변경합니다.");
		}

	}

	public void internetToggle() {
		generation3DTO dto = get3Dto();
		if (noNullCheck(dto)) {
			if (!dto.isPowerOnOff()) {
				System.out.println("먼저 전원을 켜주세요.");
			} else if (dto.isInternetOnOff()) {
				dto.setInternetOnOff(false);
				System.out.println("인터넷을 끕니다.");
				if (dto.isWebtoonOnOff()) {
					dto.setWebtoonOnOff(false);
					System.out.println("웹툰을 끕니다.");
				}
			} else {
				dto.setInternetOnOff(true);
				System.out.println("인터넷을 켭니다.");
			}
		} else {
			System.out.println("인터넷 불가능한 핸드폰입니다.");
		}
	}

	public void webtoonToggle() {
		generation3DTO dto = get3Dto();
		if (noNullCheck(dto)) {
			if (powerRequire(dto)) {
				if (!dto.isInternetOnOff()) {
					System.out.println("먼저 인터넷을 켜주세요.");
				} else if (dto.isWebtoonOnOff()) {
					dto.setWebtoonOnOff(false);
					;
					System.out.println("웹툰을 끕니다.");
				} else {
					dto.setWebtoonOnOff(true);
					System.out.println("웹툰을 켭니다.");
				}
			}
		} else {
			System.out.println("웹툰이 불가능한 핸드폰입니다.");
		}
	}

	public boolean noDmbRequire(generation2DTO dto) {
		if (dto.isDmbOnOff()) {
			System.out.println("DMB를 꺼주세요.");
			return false;
		} else {
			return true;
		}
	}

	public boolean noDmbRequire(generation3DTO dto) {
		if (dto.isDmbOnOff()) {
			System.out.println("DMB를 꺼주세요.");
			return false;
		} else {
			return true;
		}
	}

	public boolean callRequire(generation1DTO dto) {
		if (!dto.isCallOnOff()) {
			System.out.println("통화 중에만 가능합니다.");
			return false;
		} else {
			return true;
		}
	}

	public boolean callRequire(generation2DTO dto) {
		if (!dto.isCallOnOff()) {
			System.out.println("통화 중에만 가능합니다.");
			return false;
		} else {
			return true;
		}
	}

	public boolean callRequire(generation3DTO dto) {
		if (!dto.isCallOnOff()) {
			System.out.println("통화 중에만 가능합니다.");
			return false;
		} else {
			return true;
		}
	}

	public boolean noCallRequire(generation2DTO dto) {
		if (dto.isCallOnOff()) {
			System.out.println("먼저 통화를 종료하세요.");
			return false;
		} else {
			return true;
		}
	}

	public boolean noCallRequire(generation3DTO dto) {
		if (dto.isCallOnOff()) {
			System.out.println("먼저 통화를 종료하세요.");
			return false;
		} else {
			return true;
		}
	}

	public boolean powerRequire(generation1DTO dto) {
		if (!dto.isPowerOnOff()) {
			System.out.println("먼저 전원을 켜주세요.");
			return false;
		} else {
			return true;
		}
	}

	public boolean powerRequire(generation2DTO dto) {
		if (!dto.isPowerOnOff()) {
			System.out.println("먼저 전원을 켜주세요.");
			return false;
		} else {
			return true;
		}
	}

	public boolean powerRequire(generation3DTO dto) {
		if (!dto.isPowerOnOff()) {
			System.out.println("먼저 전원을 켜주세요.");
			return false;
		} else {
			return true;
		}
	}

	public boolean noInternetRequire(generation3DTO dto) {
		if (dto.isInternetOnOff()) {
			System.out.println("인터넷을 꺼주세요.");
			return false;
		} else {
			return true;
		}
	}
}