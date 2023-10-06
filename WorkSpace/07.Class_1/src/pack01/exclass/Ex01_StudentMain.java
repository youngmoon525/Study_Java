package pack01.exclass;

import java.util.Random;
import java.util.Scanner;

//네이밍룰: 클래스이름뒤에 Main이라는 키워드가 있다면 , 자바 프로그램의 시작점을 가지고있는 클래스.
public class Ex01_StudentMain {
	public static void main(String[] args) {
		System.out.println("시작점");
		
		Ex01_Student es = new Ex01_Student();//Ex01_Student내부에 있는 모든 기능을 사용하기위해
											 //변수화해서 메모리에 올림.("인스턴스화")
		Ex01_Student kym = null;//참조형 데이터타입 null로 초기화가 가능하다.<=nullPointerException
		int[] arr = new int[2];
		if(es==kym) {
			System.out.println("참조가 같음" + es);
		}else {
			System.out.println("참조가 다름" + kym + es + arr);
		}
		
		
	}
}
