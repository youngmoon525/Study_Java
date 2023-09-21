package pack04.exwhile;

public class Test01_While {
	public static void main(String[] args) {
		//for(int i = 1 ; i<10 ; i++){
			// syso(i*2); <- 문자열로 이쁘게 출력하면 정답
		//}
		//1. while문을 이용하여 구구단 2단을 출력하는 코드를 작성하기.
		int i = 1;
		while(i<10) {
			System.out.println(i*2);
			i++;
		}
		//2. while문을 이용하여 구구단 2~9단까지를 출력하는 코드를 작성하기.
		//for(int i = 2 ; i<10 ; i++){
			//for(int j = 1 ; j<10 ; j++){
				//syso ( i*j); <- 문자열로 이쁘게 출력하면 정답
		//	}
		//}
		i = 2;
		while(i<10) {
			int j = 1;
			while(j<10) {
				System.out.println(i*j);
				j++;
			}
			i++;
		}
	}
}
