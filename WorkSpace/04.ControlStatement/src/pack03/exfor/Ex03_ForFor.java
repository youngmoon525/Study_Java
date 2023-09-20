package pack03.exfor;

public class Ex03_ForFor {
	public static void main(String[] args) {
		//제어문 <- : 계속해서 중첩이 가능하다.
		//for문이 중첩되면 반복 횟수는 두 for문의 반복횟수 x
		// 10번 반복하는 for문 , 5번 반복하는 for문
		// 10*5 = 50;
		// for문이 3개 이상 사용 될 때는.. 코드 이상을 꼭 의심하자.
		for(int i=1 ; i<=10 ; i++) {
			System.out.print( i + " ");
			for(int j=1; j<=5 ; j++) {
				
			}
		}
		
		
		
		
		
		//for(){
			//for(){
			//}
		//}
	}
}
