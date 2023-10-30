package pack01._input;

import java.io.IOException;
import java.io.InputStream;

public class Ex02_InputMulti {
	public static void main(String[] args) throws IOException {
		InputStream is = System.in;
		//ABC를 콘솔에 입력함. ABC전체가 출력되게 하려면 어떻게 해야할까?
		//[C][B][A]
		//is.read();A
		//is.read();B
		//ABCDEF 13 10
		//System.out.println((char)is.read());
		//System.out.println((char)is.read());
		//System.out.println((char)is.read());
		//정확히 오타 없이 3개의 알파벳을(문자) 입력한 경우
		//개수를 정확히 모르는 경우=> while
		int data ;//is.read();<= 데이터를 담기 위한 변수0~255..-1
		while( ( data = is.read() ) != -1 ) {
			System.out.println("입력하신 문자 int : " + data);
			System.out.println("char " + (char) data );
		}
		System.out.println("프로그램 종료");
	}
}
