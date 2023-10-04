package pack02.trycatch;

public class Ex02_TryCatchFinal {
	public static void main(String[] args) {
		//요리(라면)
		//1.물 조절. 
		//2.가스불 ON
		//3.가스불 OFF
		//4.종료(요리 끝 식사->)
		
		try {
			System.out.println("1.물조절");
			System.out.println("2.가스불 ON");
			//System.out.println(0/0);
			//System.out.println("3.가스불 OFF");
			//System.out.println("4.종료(요리 끝 식사)");
		} catch (Exception e) {
			//try의 코드가 예외를 발생했을때(오류) 실행 
			System.out.println("예외 발생(물넘침 이슈)");
			//System.out.println("3.가스불 OFF");
			//System.out.println("4.종료");
		} finally {
			//무조건 실행되어야 하는 코드를 넣어줌.
			System.out.println("3.가스불 OFF");
			System.out.println("4.종료");
		}
		
		
	}
}
