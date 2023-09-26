package pack03.exarray2;

public class Ex03_Array {
	public static void main(String[] args) {
		//int[] arr = new int[3]x3=> int[][] arr = new int[3][3];
		int[] arr = { 2 , 4 , 6 , 8 , 10 , 12 , 14 , 16 , 18 } ;//초기화 식에서만 가능한표현
		System.out.println(arr.length);
		arr =new int[]{ 3,4 };//중간에 배열의 크기를 바꿈.-> 기존에 있던 데이터는 전부 없어짐.
		//[] <= 인터넷에서(웹) array의 표기법
		int[][] arr2 = {
				{0,0},{0,0},{0,0}
		};
		arr2[0] = new int[3];
		arr2[1] = new int[] {0,0,0};
		System.out.println();
		//arr2 각각 2개의 크기를 가지는 1차원 배열이 3개 들어있음.
		//첫번째 1차원 배열과 두번째 1차원 배열의 크기만 3으로 바꾸기. 
	}
}
