package pack01.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class MemberDAO {
	private Connection conn;
	
	public boolean isConnection() {
		//if(conn != null && !conn.isClosed()) return;
		//url , user , password => Properties파일(접속정보가 파일로 저장되어있는것)Stream으로 파일읽어오기.
		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		String user = "hanul";
		String password = "0000";
		try {
			conn = DriverManager.getConnection(url, user, password);
			if(!conn.isClosed()) {
				System.out.println("열림");
				return true;
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return false;
	}
	
	public void memberDisplay(ArrayList<MemberDTO> list) {
		if(list == null || list.size()==0) {
			System.out.println("조회 된 데이터가 없습니다.");
			return;
		}
		for(MemberDTO dto : list) {
			System.out.println("ID : " + dto.getId() + " PW : " + dto.getPw());
		}
	}
	
	public ArrayList<MemberDTO> selectMember() {
		ArrayList<MemberDTO> list = new ArrayList<>();
		if(isConnection()) {
			try {
				PreparedStatement ps = conn.prepareStatement(" SELECT * FROM MEMBER ");
				ResultSet rs = ps.executeQuery();
				while(rs.next()) {
					MemberDTO dto = new MemberDTO(rs.getString("id"), rs.getString("pw"));
					list.add(dto);
					//System.out.println(rs.getString("id") + " " + rs.getString("pw"));
				}
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return list;
	}
	
	public void insertMember(MemberDTO dto) {
		if(isConnection()) {
			try {
				PreparedStatement ps = conn.prepareStatement(" INSERT INTO MEMBER VALUES ( ? , ? ) ");
				ps.setString(1, dto.getId());
				ps.setString(2, dto.getPw());
				int result = ps.executeUpdate();
				System.out.println(conn.getAutoCommit());
				//conn.commit();//※ 확정되지 않은 작업이 있는 테이블 조회 시 연결 실패 뜸.LOCK ※
				System.out.println(result);
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}

	public void updateMember(MemberDTO dto) {
		if(isConnection()) {
			try {
				PreparedStatement ps = conn.prepareStatement("UPDATE MEMBER "
						+ "SET PW = ? "
						+ "WHERE ID= ? ");
				ps.setString(1, dto.getPw());
				ps.setString(2, dto.getId());
				int result = ps.executeUpdate();
				System.out.println(result);
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}

}
