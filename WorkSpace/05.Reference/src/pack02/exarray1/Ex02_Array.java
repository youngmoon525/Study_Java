package pack02.exarray1;

public class Ex02_Array {
	public static void main(String[] args) {
		System.out.println(args.length);
		// [] <- 자료구조 : 배열 , 데이터가 하나 이상이 있다.(==같은 구조로,타입)
		//데이터타입[] :<= 1차원 배열 : 한가지 데이터 타입을 요소로 가지는 자료구조
		//내가 알고있는 대부분의 데이터타입은 배열로 표현이 가능하다.
		//데이터타입[] 배열이름 = new 데이터타입[int크기];
		//배열의 크기를 정확히 모르지만 배열의 이름을 예약해두고싶음->추후 사용 예정(null)
		//int[] intArr = null; <= 기본형 데이터타입 제외 모든 타입은 null로 초기화 해두는게 가능함.
//		if(intArr != null) {
//			System.out.println(intArr.length);
//		}
		//1.String타입을 담을수있는 sArr이라는 배열을 만들고 크기를 10 할당하세요.
		String[] sArr = new String[10];
		//2.각 배열의 index에 이름1~10까지의 값을 저장하고 출력해보세요."이름1"~...~"이름10";
		//String name = "이름1";=>sArr[0]=name; 배열의 모든 칸은 String이다
		System.out.println(sArr.length);
		for(int i = 0 ; i < sArr.length; i++) {
			sArr[i] = "이름"+(i+1);
			System.out.println(1+sArr[i]);
		}
		int[] intArray = { 1 , 2 , 3 };//0[1],1[2],2[3]
		String[] strArrays = {"스트링1" , "스트링2"};
		//↑ 방식을 이용해서 값2개를 가지는 String배열 만들어보기.
		System.out.println(intArray.length);
		
		
	}
}
