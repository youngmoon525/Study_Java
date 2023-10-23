package pack01.testinterface;

//class -> interface
public interface TestInterface {
//인터페이스에서 구현하는 모든것들은 추상 메소드 , 상수
//여러 개발자가 같은 인터페이스를 상속받거 각자의 DAO를 만들고 병합하면 오류 없이 코드 호출이 가능함.(Spring MVC)
// final <- 상수: 초기값 설정 후 변경 불가능
	String SERVER_IP = "192.168.0.40";//CMD->ipconfig
	void search();
	void insert();

}
