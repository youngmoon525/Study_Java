package pack02.kymsqlplus;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class KymSqlDAO {
	private Connection conn; // 연결 객체
	private PreparedStatement ps; // 실행 객체
	private ResultSet rs ; //결과 객체(표 sql dev 밑에 질의결과)
	
	public boolean checkConnection(String user , String password) {
		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		try {
			conn = DriverManager.getConnection(url, user, password);
			if(!conn.isClosed()) {
				System.out.println("다음에 접속됨:");
				System.out.println(conn.getMetaData().getDatabaseProductVersion());
				return true;
			}
			
		} catch (SQLException e) {
			System.out.println("ERROR:");
			System.out.println(e.getMessage());
		} catch (Exception e) {
			System.out.println("알수없는 오류 발생!!!");
		}
		return false;
	}
	
	public void sendSql(String sql) {
		try {
			if(conn == null && conn.isClosed()) {
				System.out.println("데이터베이스 연결이 끊겼습니다. 연결을 다시 확인 바랍니다.");
				return;
			}
			ps = conn.prepareStatement(sql);
			// ps.set(1..) , Int , String 등으로 파라메터를 추가. query에는 ? , 
			rs = ps.executeQuery();
			while(rs.next()) {
				for(int i = 1; i<= rs.getMetaData().getColumnCount(); i++) {
					System.out.print(rs.getMetaData().getColumnLabel(i)+" ");		
				}
				System.out.println();
				//System.out.println("데이터 있음." + rs.getString(1));
				for(int i = 1; i<= rs.getMetaData().getColumnCount(); i++) {
					System.out.print(rs.getString(i) + " ");
				}
				System.out.println();
				
			}
			
		} catch (SQLException e) {
			System.out.println(e.getMessage());
		}
	}
	
}
