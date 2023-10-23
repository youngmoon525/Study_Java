package pack04.database;

public class Main {
	public static void main(String[] args) {
	
		
		IDataAccessObject dao = new OracleDAO();
		//부모 인터페이스 = 자식 클래스 생성자;
		
		if(dao instanceof OracleDAO) {
			OracleDAO tempDao= (OracleDAO) dao ;
			tempDao.oracleMethod();
		}
		
		//코드 부..
		dao.select();
		dao.insert();
		dao.delete();
		dao.update();
		
		dao = new MssqlDAO();
		dao.select();
		dao.insert();
		dao.delete();
		dao.update();
		
	}
}
