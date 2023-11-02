package junit.test;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import pack01.jdbc.MemberDAO;
import pack01.jdbc.MemberDTO;

class TestMemberDAO {

	@DisplayName("연결 테스트")
	@Test
	void connTest() {
		MemberDAO dao = new MemberDAO();
		assertTrue(dao.isConnection());
		// dao.checkConnection();
	}
	@DisplayName("멤버테이블 조회")
	@Test
	void selectMember() {
		MemberDAO dao = new MemberDAO();
		ArrayList<MemberDTO> list = dao.selectMember();
		assertTrue(list.size() != 0);//조회 후 list의 개수(데이터 개수)가 0보다 크면 조회 성공
	}
	
	@DisplayName("멤버테이블 콘솔 출력")
	@Test
	void display() {
		MemberDAO dao = new MemberDAO();
		//dao.memberDisplay(null);
		ArrayList<MemberDTO> list = dao.selectMember();
		dao.memberDisplay(list);
	}
	
	@Disabled
	@DisplayName("등록 멤버 인서트")
	@Test
	void insertMember() {
		MemberDAO dao = new MemberDAO();
		MemberDTO dto = new MemberDTO("us11", "aaa");
		dao.insertMember(dto);
		//dao.insertMember("us1" , "aa"); => dto 받아오게 수정
	}
	//@Disabled <= 테스트 안함.
	@Disabled
	@DisplayName("회원 정보 수정")
	@Test
	void updateMember() {
		MemberDAO dao = new MemberDAO();
		MemberDTO dto = new MemberDTO("us11", "edit");
		dao.updateMember(dto);
		//dao.updateMember("id1", "edit"); => dto 받아오게 수정
	}
	
	
	@Disabled
	@DisplayName("회원 정보 삭제")
	@Test
	void deleteMember() {
		MemberDAO dao = new MemberDAO();
		MemberDTO dto = new MemberDTO("us1", "aa");
		dao.deleteMember(dto);
		//dao.updateMember("id1", "edit"); => dto 받아오게 수정
	}
	
	@DisplayName("회원 정보 확인")
	@Test
	void checkMember() {
		MemberDAO dao = new MemberDAO();
		assertTrue( dao.isMember("id1") );
		//dao.updateMember("id1", "edit"); => dto 받아오게 수정
	}
	
}
