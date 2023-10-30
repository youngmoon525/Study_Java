package pack01._input;

import java.io.IOException;
import java.io.InputStreamReader;

public class Ex04_InputKORMulti {
	public static void main(String[] args) throws IOException {
		//아래 메소드 호출 후 데이터 저장.
		Ex04_InputKORMulti ikm = new Ex04_InputKORMulti();
		String data = ikm.kymScanner();
		System.out.println(data);
		
		//출력
	}
	
	
	public String kymScanner() throws IOException {
		InputStreamReader isr = new InputStreamReader(System.in);
		int iData ;
		String data = "";
		while( (iData = isr.read() ) != -1 ) {
			if(iData == 13 || iData == 10) {
				break;
			}
			data += (char)iData+"";
		}
		
		return data;
	}
	
	//나의이니셜Scanner 메소드를 구현하기.
	//"1.해당 메소드는 String을 return하는 메소드 입니다."
	//2.InputStreamReader를 이용하여 EnterKey 입력을 제외한 문자열을 return해주세요.
	//	- Ex02_inputMulti 참조
	//	- CR&LF(13/10)return x
	
	//테스트 
	//"스캐너"<-콘솔에 치고 엔터
	//해당하는 값을 문자열에 저장.("스캐너")
	//출력! - 끝
}
