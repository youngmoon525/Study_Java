package pack03.exarray2;

public class Ex04_Swap {
	public static void main(String[] args) {
		int num1 = 10 , num2=20;
		System.out.println("num1 : " + num1 + " num2: " + num2);
		
		//코드로 두 변수를 바꿔치기 해보기.
		//코딩은 여기서부터하기
		int tempNum = num1;//비 <- 10
		num1 = num2;//10 <- 20;
		num2 = tempNum;
		System.out.println("num1 : " + num1 + " num2: " + num2);
		
		//swap의 개념을 이용하여 ↓ 오름차순 또는 내림차순으로 바꿔보기
		int[] arr = { 3 , 5 , 7 , 9 , 1 , 2 , 4 , 10 };
		//코딩은 여기서부터 ( 정렬 알고리즘 )
		//1.비교가 필요함.
		//2.비교 후 인덱스의 값끼리의 변경 시 임시로 저장할변수나 어떤 공간이 필요함.
		
	}
}
