package pack03.exfor;

public class Test01_For {
	public static void main(String[] args) {
//		int i = 0 ;// 0. i에 1~9까지의 총합을 저장하고 출력하기.
//		i = i+1;//0+1
//		i = i+3;//1+2
//		i = i+5;//3+3
//		i = i+7;
//		i = i+9;
		
//		i = i+2;
//		i = i+4;
//		i = i+6;
//		i = i+8;
		int sum = 0 , oddSum=0 , evenSum=0;//왜 밖에다가 변수 만들었는가??
		for(int i = 0 ; i <= 9 ; i++) {
			if(i%2==1) {
				oddSum += i;
			}else {
				evenSum += i;
			}
			sum = sum + i;
		}
		System.out.println("홀수의합(1~9) : " + oddSum);
		System.out.println("짝수의합(1~9) : " + evenSum);
		System.out.println(sum);
	
		
		//지역에 대한 이해도
		//System.out.println(1+3+5+7+9);
		//1.1~9까지 반복하는 for문 만들기.
		//	1.총합 구하기(1+2+3...+9);
		//2.1~9까지의 숫자 중에 홀짝을 구별해서 출력하기.
		//3.홀수의 누적 , 짝수의 누적 진행
		//반드시 for문 안에서 작업!
		//1~9까지의 수중 홀수인 수의 합: 1 , 3 , 5 , 7 , 9
		//1~9까지의 수중 짝수인 수의 합: 2~8
		//1~9까지의 수의 총합 :1~9
		//각각을 따로 출력하기.
		//홀수의합 : ?
		//짝수의합 : ?
		//총합 : ?
	}
}
