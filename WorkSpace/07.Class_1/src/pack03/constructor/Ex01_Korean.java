package pack03.constructor;

public class Ex01_Korean {
	//클래스의 블럭킹(중괄호) { } 내부에 있는 모든것 (멤버)
	String nation="대한민국";//<= 용어 : 멤버 -> 인스턴스 멤버 -> 인스턴스 변수 ( 필드 , im , 'iv')
	String name;//이름
	String ssn;//주민등록번호 ( key )
	//생성자 메소드 == new 'Ex01_Korean()'; 객체를 생성하기 위한 기능을 가진 메소드
	//별도의 생성자 메소드를 구현(명시,만들지않으면)하지 않으면 기본적으로 클래스의 이름을 생성자 메소드로 사용함.
	//)Java에서 해줌 ( JVM , 컴파일러 )
	//String ssn = "123456-7891234";
	public Ex01_Korean(String ssn , String name) {
		this.ssn = ssn;
		this.name = name;
	}
	
}
