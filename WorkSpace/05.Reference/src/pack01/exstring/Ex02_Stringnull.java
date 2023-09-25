package pack01.exstring;

import java.util.Scanner;

public class Ex02_Stringnull {
	public static void main(String[] args) {
		//기본형 데이터타입 vs 참조형 타입 
		//스택이라는 메모리에 바로 값이 저장되는경우 vs 스택에는 힙메모리 번지수가 저장되고 실제 값이 힙에 저장되는지?
		//앞글자가 대문자로 시작했는지?
		//String str1 = null;//참조형 데이터타입이 stack에 참조를 시작하지 않음을 표시함.
		//객체(Object) : 참조형데이터입은 모두 참조를 시작해야만 , 내부에 있는 기능이나 값을 이용할수가있다.
		Scanner sc = null;
		//모든 객체는 new라는 키워드(문장)을 통해서 heap에 새로운 영역을 만들고 참조를 시작함.
		String str1 = new String("A");
		String str2 = new String("A");
		if(str1 == str2) {
			System.out.println("같음");
		}else {
			System.out.println("다름");
		}
		//if(sc != null) {
		//	sc.nextLine();
		//}
//		if(null != sc) {
//			sc.nextLine();
//		}
	}
}
