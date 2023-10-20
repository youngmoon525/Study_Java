package test.phone3;

import java.util.Scanner;

import test.phone1.Phone1DAO;
import test.phone2.Phone2DAO;

public class Phone3DAO extends Phone2DAO {
	
	Scanner sc = new Scanner(System.in);
	
	
	
	Phone3DTO phone3dto = new Phone3DTO();
	
	
	public void internetOn() {
		PowerOn(false);
		
		System.out.println("인터넷 연결하시겠습니까? 1.On");
		phone3dto.onf = Integer.parseInt(sc.nextLine());
			if(phone3dto.onf == 1) {
				System.out.println("인터넷 ON");
//				phone3dto.onf = opt;
//				return 1;
				
			}else {
				System.out.println("인터넷 OFF");
			}
//			return opt;
	}
	
	public void inernetOff() {
		System.out.println("인터넷 OFF");
	}
	
	
	public void webtoonApp() {
		internetOn();
//		if(phone3dto.onf == 1 ) {
			System.out.println("웹툰앱을 실행하시겠습니까? 1.On 2.Off");
			phone3dto.opt = Integer.parseInt(sc.nextLine());
		if(phone3dto.opt == 1) {
		System.out.println("웹툰 ON");
		}else {
			System.out.println("웹툰 OFF");
		}
	}
	
	
	
	
	
}
