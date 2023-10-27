package test01.member;

import java.util.Scanner;

public class MemberServiceExample {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		MemberService memberService = new MemberService();
		String userId = scan.nextLine();

		String userPw = scan.nextLine();

		if (memberService.login(userId, userPw)) {
			System.out.println("로그인 되었습니다.");
			memberService.logout(userId);
		} else {
			System.out.println("id 또는 password가 올바르지 않습니다.");
		}
	}
}
