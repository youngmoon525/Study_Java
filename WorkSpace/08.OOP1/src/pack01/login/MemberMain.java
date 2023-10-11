package pack01.login;

import java.util.Scanner;

public class MemberMain {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);//IO
		MemberDTO dto = new MemberDTO();
		MemberDAO dao = new MemberDAO();
		dto.id = scan.nextLine();
		dto.pw = scan.nextLine();
		
		if(dao.login(dto) == 1  ) {
			System.out.println("화면 이동");
		}else {
			System.out.println("다시 입력");
		}
		System.out.println(dto.id);
		scan.close();
		//login메소드를 호출하여 
		//아이디가 admin이고 비밀번호가 admin1234와 일치한다면 " 로그인 되었습니다 "
		//그 외-> " 아이디 또는 비밀번호를 확인 해주세요. "
		
		//기본형 데이터 타입 : 스택 메모리에 값이 바로있음.
		//참조형 데이터 타입 : 스택 메모리에 주소가 담기고 실제 값은 힙에 있음.
		
		
		
	
		
	}
}
