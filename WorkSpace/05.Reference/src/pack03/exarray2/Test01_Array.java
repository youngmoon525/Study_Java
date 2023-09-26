package pack03.exarray2;

public class Test01_Array {
	public static void main(String[] args) {
		//2차원 배열을 만들고 , 2차원 배열 내부에 2~9단의 결과를 모두 담고 출력하기.
		//2차원 배열 [
			//[2,4,6,8,10,12,14,16,18] , [3단] , [4단]...[9단]
		//]
		int[][] arr = new int[8][9];//8-1(0~7) , 9-1(0~8)
		for(int i = 0 ; i<arr.length; i++) {
			System.out.println((i+2)+"단");
			for(int j = 0 ; j<arr[i].length; j++) {
				arr[i][j] = (i+2) * (j+1);
			}
		}
		System.out.println();
	}
}
