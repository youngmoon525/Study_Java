package pack01.exceptioncode;

import java.util.Scanner;

public class Ex01_NullPointer {
	public static void main(String[] args) {
		//Ex01_프로젝트 실행 시 , 콘솔에 NullPointer오류가 발생하게 코딩해보기.
		//참조형 데이터타입은 아직 객체 참조를 시작하지않음(null)상태에서는 모든 기능 사용x
		String[] strs = null;
		Scanner scan = null;
		//asd
		if(scan != null) {
			scan.nextLine();			
		}
		//NullPointerException은 빈번하게 발생하는 오류코드-> 회피방법이 간단함.
		//객체를 사용할때 null이 아닌상태에서만 쓰게끔 만들면 된다.
		//제어문을 활용.
		if(strs != null) {
			System.out.println(strs[0]);
		}
		
		
		
		System.out.println("여기");
	}
}
