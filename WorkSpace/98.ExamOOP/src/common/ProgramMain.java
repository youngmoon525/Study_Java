package common;

import member.MemberDAO;
import product.ProductDAO;

public class ProgramMain {
//Common<-: 공통으로 사용 클래스 ( 메소드 , 변수 )
//프로그램 메인 -> 멤버 -> 상품
	public static void main(String[] args) {
		Common common = new Common();//스캐너 초기화
		System.out.println("참조 번지 : " + common);
		MemberDAO dao = new MemberDAO(common);
		common.items = new ProductDAO(common).initItems();
		dao.startUserLogin();
		common.endProgram();//스캐너 종료
	}
}
