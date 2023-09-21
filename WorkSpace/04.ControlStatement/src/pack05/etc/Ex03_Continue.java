package pack05.etc;

public class Ex03_Continue {
	public static void main(String[] args) {
		//continue : 계속한다. ( to be continue -> 다음화에 계속 )
		//-> 반복문을 종료 x , continue밑의 코드를 실행 x -> 반복 계속
		//n%2 == 0,1
		// & : 1 2 4 8 16 32 64 128 256 512 1024...
		// 1:  000 1 * 1 = 1
		// 2:  001 0 * 1 = 0
		// 3:  001 1 * 1 = 1
		// 4:  010 0 + 1 = 1
		// 5:  010 1 + 1 = 1 //?
		
		
		//break vs continue
		//break:
		//continue:
		
		int oddSum = 0 ; //홀수의 누적합
		for(int i=1; i<=10; i++) {
			if((i&1)!=1) {
				continue;
			}			
			oddSum += i;
		}
		
		System.out.println(oddSum);
	}
}
