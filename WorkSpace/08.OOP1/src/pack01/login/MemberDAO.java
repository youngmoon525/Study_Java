package pack01.login;

//DAO: 기능 (메소드)를 모아놓음.(<- DTO를 활용해서 CRUD, Create , Read , Update , Delete )
//(Data Access Object)
//대부분의 DAO는 따로 field를 가지고 있지 않음.
//1.접근제한자 2.static 여부 3.void여부
public class MemberDAO {
	// 1.login<-MemberDTO : 내부에 있는 (데이터베이스 기준) 데이터 포맷을 지정할수도있음.
	//login성공여부를 MemberMain클래스가 알수있게 코딩해보기
	public int login(MemberDTO dto) {
		// == : 스택 메모리의 값을 비교
		if (dto.id.equals("admin") && dto.pw.equals("admin1234")) {
			System.out.println("로그인 되었습니다.");
			return 1;
		} else {
			System.out.println("아이디 또는 비밀번호 확인!");
		}
		return 0;
		
	}
}
