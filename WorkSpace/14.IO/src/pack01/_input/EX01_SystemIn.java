package pack01._input;

import java.io.IOException;
import java.io.InputStream;
import java.util.Scanner;

public class EX01_SystemIn {
	//IO : 데이터 입출력에 필요한 API
	//API는 만들어진 형태로 사용을 해야함.(사용 설명서대로 사용)
	//API는 Application Programming Interface(애플리케이션 프로그램 인터페이스)의 줄임말
	//IO사용 필수 : IOException 처리
	public static void main(String[] args) throws IOException {
		//Scanner sc = new Scanner(System.in);<-InputStream , KeyBoard를 통해 들어오는 정보를 받아옴
		//System.in <= NodeStream : 가장 먼저 연결되는 스트림 , 외부에서 들어오는 데이터를 받기 위한 용도
		InputStream in = System.in;
		int inData = in.read();
		System.out.println(inData);
		System.out.println((char)inData);
		System.out.println(in.read());
		System.out.println(in.read());
		//InputStream 전체 데이터를 byte로 저장.
		//CR(Carriage Return) : 커서를 줄의 맨 앞으로 이동시킴 == 13
		//LF(Line Feed ) : 커서를 한 줄 아래로 이동 시킴 == 10
		
	}
}
