package pack04.database;

public interface IDataAccessObject {
//DAO : 기능 ( 데이터베이스에 접근 조회 , 추가 , 수정 , 삭제 ) 
//CRUD ( Create , Read , Update , Delete )=>커뮤니티 : 글 쓰기 , 읽기 , 수정 , 삭제
	public void select();
	public void insert();
	public void update();
	public void delete();
}
