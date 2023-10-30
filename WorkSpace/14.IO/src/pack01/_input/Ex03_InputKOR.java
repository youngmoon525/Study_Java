package pack01._input;

import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class Ex03_InputKOR {
	public static void main(String[] args) {
		//InputStream : 바이트 데이터 : Ascii , 이미지(바이트) , 영상 , 음원 등등
		//InputStreamReader : 문자 데이터를 입력받는 스트림
		
		//영어 한글 byte 사용 범위가 다름 : 문자열 기반의 스트림 종류는 바이트를 넓게 잡아 한글 데이터를 한글자씩 끊어 오는게
		//가능함.
		
		//InputStream is = System.in;
		InputStreamReader isr = new InputStreamReader(System.in);//System.in , ....
		try {
			int data = isr.read();
			System.out.println(data);
			System.out.println((char)data);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
