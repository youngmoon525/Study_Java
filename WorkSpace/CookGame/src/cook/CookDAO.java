package cook;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class CookDAO {
	private Connection conn;

	public boolean isConnection() {
		// if(conn != null && !conn.isClosed()) return;
		// url , user , password => Properties파일(접속정보가 파일로 저장되어있는것)Stream으로 파일읽어오기.
		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		String user = "ATEAM";
		String password = "ATEAM1";
		try {
			conn = DriverManager.getConnection(url, user, password);
			if (!conn.isClosed()) {
				return true;
			}

		} catch (SQLException e) {
			e.printStackTrace();
		}
		return false;
	}
	public void dbClose() {
		try {
			conn.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		conn=null;
	}

	public ArrayList<CookInfoDTO> getCookList(int level_cnt) {
		if(!isConnection()) return null;
		ArrayList<CookInfoDTO> list = new ArrayList<>();
		String sql = "SELECT C.* , R.CNT , R.LEVEL_CNT "
				+ "FROM COOK_INFO C LEFT OUTER JOIN  ( "
				+ "SELECT COUNT(*) CNT , COOK_NO , CASE WHEN  COUNT(*) < 5 THEN 1 WHEN  COUNT(*) <= 8 THEN 2 ELSE 3 END LEVEL_CNT FROM RECIPE_INFO GROUP BY COOK_NO ) R ON C.COOK_NO = R.COOK_NO "
				+ "WHERE R.LEVEL_CNT = ?";
		try {
			PreparedStatement ps = conn.prepareStatement(sql);
			ps.setInt(1, level_cnt);
			ResultSet rs = ps.executeQuery();
			while (rs.next()) {
				list.add(new CookInfoDTO(rs.getInt("COOK_NO"), rs.getInt("LEVEL_CNT"), rs.getString("COOK_NAME")));
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			
		}
		return list;
	}

	public ArrayList<RecipeInfoDTO> getRecipeList(CookInfoDTO dto) {
		if(!isConnection()) return null;
		ArrayList<RecipeInfoDTO> list = new ArrayList<>();
		String sql = "select * "
				+ "from recipe_info "
				+ "where cook_no = ?";
		try {
			PreparedStatement ps = conn.prepareStatement(sql);
			ps.setInt(1, dto.getCook_no());
			ResultSet rs = ps.executeQuery();
			while (rs.next()) {
				list.add(new RecipeInfoDTO(rs.getInt("RECIPE_NO"), rs.getInt("COOK_NO"), rs.getString("INGREDIENT")));
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			
		}
		return list;
	}

	
	
	public void displayCookList(ArrayList<CookInfoDTO> list ) {
		for (int i = 0; i < list.size(); i++) {
			System.out.println(i+1 + "." + list.get(i).getCook_name()+ " 난이도 : " + list.get(i).getLevel_cnt());
		}
	}
	
	public void displayRecipeList(ArrayList<RecipeInfoDTO> list ) {
		for (int i = 0; i < list.size(); i++) {
			System.out.println(i+1 + "." + list.get(i).getIngredient());
		}
	}
}
