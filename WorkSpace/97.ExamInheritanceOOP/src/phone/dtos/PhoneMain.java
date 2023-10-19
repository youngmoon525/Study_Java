package phone.dtos;

import phone.daos.PhoneCommonDAO;

public class PhoneMain {
	public static void main(String[] args) {
		
		PhoneDTO dto = new SmartPhoneDTO("검정", "KYM폰");
		PhoneCommonDAO dao = new PhoneCommonDAO(dto);
		dao.startProgram();
		
		
		
	}
}
