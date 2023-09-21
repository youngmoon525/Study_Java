package pack05.etc;

import java.util.Scanner;

public class Ex02_Break {
	public static void main(String[] args) {
		//Scanner : 콘솔(IO)
		//Input  : 사용자가 입력한 값을 콘솔을 통해 다시 에디터(java)로 가져오는것
		//Output : 콘솔창으로 내가 가지고있는 데이터를 출력하는 명령을 실행(syso)
		Scanner sc = new Scanner(System.in);//스캐너의 초기화 식 : int i = 1;
		String intputData = sc.nextLine();//사용자가 콘솔창에 입력을 하다가 enter키를 치면
										  //입력 된 데이터 전부를 가져옴.

		//형변환 연습이 안된다.(x)
		//int intputInt = sc.nextInt();<-사용 금지 
		//blockState: 입력을 대기한다.(프로그램은 위에서 아래로 흐름)
		System.out.println("사용자가 입력 : "+intputData);
		//sc.nextLine()은 사용자가 입력한값을 '반드시' String형태로 우리한테 되돌려줌.
		//sc.nextLine == 내가 엔터친개수
		sc.nextLine();
		System.out.println("아이디를 입력해주세요");
		String userId = sc.nextLine();
		System.out.println("비밀번호를 입력해주세요");
		String userPw = sc.nextLine();
		System.out.println("입력 된 정보 " + userId + userPw);
	}
}
