package pack03.exfor;

public class Test02_For {
	public static void main(String[] args) {
		//for문을 이용하여 구구단의 2단 출력
		//ex) 2 x 1 = 2
		//.
		//.
		//    2 x 9 = 18
		
//		System.out.println("2 x 1  = 2" );
//		System.out.println("2 x 2  = 4" );
//		System.out.println("2 x 3  = 6" );
//		System.out.println("2 x 4  = 8" );
//		System.out.println("2 x 5  = 10" );
//		System.out.println("2 x 6  = 12" );
//		System.out.println("2 x 7  = 14" );
//		System.out.println("2 x 8  = 16" );
//		System.out.println("2 x 9  = 18" );
		for(int i = 1 ; i<=9 ; i++) {
			System.out.println("2 x " + i + " = " + (2*i));
		}
		
	}
}
