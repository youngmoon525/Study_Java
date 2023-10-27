package test01.member;

public class MemberService {
	private String userId = "hong" , userPw="12345";
	public boolean login(String userId , String userPw) {
		if(userId.equals(this.userId) && userPw.equals(this.userPw)) {
			return true;
		}
		return false;
	}
	public void logout(String userId) {
		System.out.println("로그아웃 되었습니다.");
	}
}
