package pack02.member;

public class MemberMain {
	public static void main(String[] args) {
		System.out.println(Member.sField);
		Member.sMethod();
		
		
		Member member = new Member();
		System.out.println(member.iField);
		member.iMethod();
	}
}
