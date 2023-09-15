
public class Ex08_Oper {
	public static void main(String[] args) {
		//복합대입연산자. ( 대입 ) =<- 어떤 변수에 값을 할당 할때 사용함.
		int result = 0 ;
		result = result + 10 ; //변수에는 0 + 10의 결과가 할당.
		result +=10 ;
		System.out.println(result);// result(0) , result(0+10) , result(10+10);
		result -=5;//result = result - 5;
		System.out.println(result);
		result *=3;//result = result * 3;
		System.out.println(result);
		result /= 5;
		System.out.println(result);
		result %= 2;
		System.out.println(result);
		
		
	}
}
