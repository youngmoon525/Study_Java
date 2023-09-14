package pack02.variabletype;

public class Test_VariableType {
//1.알고있는 모든 변수타입(어제까지 배웠던 내용만)을 모두 초기화 하거나 선언(값할당)후
//출력해보기.
//-------------------------------------------------------------------
//2.임시로 블럭킹지역을 하나 만들고 그안에서 변수 한 타입을 초기화 후 출력해보기.
	public static void main(String[] args) {
		byte byte_v = 100 ;
		short short_v = 100;
		char char_v = 'A';
		int int_v = 100;
		long long_v = 100L;//long타입은 뒤에 대문자 L을 붙여주자.
		String str_v = "문자열 \"참조형\" 데이터타입?";
		
		System.out.println(byte_v);
		System.out.println(short_v);
		System.out.println(char_v);
		System.out.println(int_v);
		System.out.println(long_v);
		System.out.println(str_v);
		
	}
	
}
