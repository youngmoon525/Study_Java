package exam.array;

import java.util.Arrays;

public class Ex01_Array {
//	0부터 9까지의 숫자 중 '일부'가 들어있는 정수 배열 numbers가 매개변수로 주어집니다.
//	numbers에서 찾을 수 없는 0부터 9까지의 숫자를 모두 찾아 더한 수를 출력 하도록 프로그램을 완성해주세요.
// [1,2,3,4,6,7,8,0] 5,9 => 5 + 9 = 14
// [5,8,4,0,6,7,9] 1 , 2 , 3 => 1 + 2 + 3 = 6 	
	public static void main(String[] args) {
		int[] numbers = {1,2,3,4,6,7,8,0};
		int endPoint = 90 / 2;
		for(int i=0; i<numbers.length; i++) {
			endPoint -= numbers[i];
		}
		System.out.println(endPoint);
		
		int[] tempArray = new int[10];
		for(int i=0; i<tempArray.length; i++) { //{1,2,3,4,6,7,8,0}
			for(int j=0; j<numbers.length; j++) { //{1,1,1,1,1,0,1,1,1,0}
				if(i==numbers[j]) {
					tempArray[i] = 1;
				}
			}
		}
		System.out.println(Arrays.toString(tempArray));
		int sum = 0;
		for(int i=0; i<tempArray.length; i++) {
			if(tempArray[i]==0) {
				sum+=i;
				System.out.print("비어있는 숫자 :" + i + " " + sum);
			}
		}
		//1차원배열의 모든 요소에 접근 for. : 비어있는 숫자를 어떻게 하면 내가 정확하게 알수있는지?
	}
}
