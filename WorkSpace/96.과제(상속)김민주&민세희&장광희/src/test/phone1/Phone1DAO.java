package test.phone1;

import java.util.Scanner;

public class Phone1DAO {
	Phone1DTO dto = new Phone1DTO(); //  초기화 되버림
	public Scanner sc = new Scanner(System.in);
	public void setPhone() {
		System.out.println("모델명과 색상을 선택하세요");
		
		dto.setModel(sc.nextLine());
		dto.setColor(sc.nextLine()); 
	}
	
	public void Phone() {
		PowerOn(dto.isPower);
		while(dto.isPower) {
			call(dto.isCall);
			PowerOff(dto.isPower);
		}
	}
	public boolean PowerOn(boolean isPower) {
		
		System.out.println("모델명: "+dto.getModel()+"색상 :"+dto.getColor()+"전원:"+isPower);
		if(isPower==false) {
			System.out.println("전원이 켜집니다");
			dto.isPower =true;
			return dto.isPower;
		}return isPower;
	}
	
	public boolean PowerOff(boolean isPower) {
		if(isPower==true) {
			System.out.println("전원이 꺼집니다");
			dto.isPower =false;
			return isPower;
		} return isPower;
	}
	public void call(boolean isCall) {
		while(dto.isPower) {
		if(isCall==false) {
			System.out.println("전화가 옵니다");
			dto.isCall = true;
			answer();
			transmit();
			receive();
			hangUp();
			break;
		} else if(isCall == true) {
			System.out.println("통화중 입니다");
		}
		}
	}
	public void answer() {
		
			System.out.println("전화를 받습니다");
		
	}
	
	public void hangUp() {
			System.out.println("통화를 종료합니다");
			dto.isCall = false;
	}
	
	public void transmit() {
		System.out.println("통화합니다");
		System.out.println("나: "+sc.nextLine());
	}
	
	public void receive() {
		System.out.println("상대방이 말합니다");
		System.out.println("상대방: "+sc.nextLine());
	}
}
