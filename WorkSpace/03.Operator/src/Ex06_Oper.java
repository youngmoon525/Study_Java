
public class Ex06_Oper {
	public static void main(String[] args) {
		// = ( 대입 , 값 할당 ) : 대입 연산자 기준으로 우측에 있는 값을 좌측에 있는 변수에 할당
		// 비교 연산자 ( == , < , > , <= , >= )
		// 초과 , 미만 ( < , > ) : 0 < 4 -> 조건에 해당하는 숫자의 개수 1 , 2 , 3
		// 이상 , 이하 : : 0 <= 4 -> 조건에 해당하는 숫자의 개수 0 ~4 : 5
		// 같다 : ==
		// 다르다 : !=
		// 비교 연산 후에는 반드시 bool형 데이터 true,false가 나옴
		// AND &&, OR ||
		//조건식 뒤에 AND,OR연산자가 붙으면 조건식이 연결 된다.
		boolean booleanV1 = 1 < 3 && 1<4;// 
		// 1 * 1 = 1(true)
		boolean booleanV2 = 1 > 3 || 1==1 ;// ?
		// 0 + 1 = 1(true)
		System.out.println(booleanV1);
		System.out.println(booleanV2);
		
		boolean booleanV3 = 1 <= 3 ;
		boolean booleanV4 = 1 >= 3 ;
		boolean booleanV5 = 1 == 3 ;
		boolean booleanV6 = 1 != 3 ;
		
	}
}
