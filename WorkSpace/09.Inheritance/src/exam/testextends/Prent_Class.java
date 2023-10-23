package exam.testextends;

//부모 클래스 : 어떠한 다른 클래스가 자식 클래스로부터 선택 받는 순간.-> 부모 클래스
public class Prent_Class {
	public Prent_Class(String id) {
		
	}
	
	//Prent_Class 멤버 : 필드(속성) , '인스턴스 멤버'
	public String parent_field1 ="PUBLIC 출력";
	String parent_field2="DEFAULT";
	private String parent_field3 ="PRIVATE";

	public void parentMethod() {
		String localVariable = "지역 변수";
		System.out.println("부모 클래스의 인스턴스 멤버(메소드) 입니다.");
	}
}
