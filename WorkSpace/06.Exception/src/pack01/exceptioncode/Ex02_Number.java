package pack01.exceptioncode;

public class Ex02_Number {
	public static void main(String[] args) {
		//1.숫자 외에 값을 숫자로 바꾸려고 하면 오류가 발생(예외)
		//대문자로 시작하는 
		String str = "ㅠㅜbb";//경우의 수가 많은 경우 -> try catch
		if(str.equals("ㅠㅜ")) {
			
		}else {
			Double.parseDouble(str);
		}
		
		
		//2.어떤수를 0으로 나누려고 하면 오류가 발생(예외)
		//코드가 있는 상태에서 if문으로 오류가 안나게 수정해보기.
		int number2 = 0;
		if(number2 != 0) {
			System.out.println(10/number2);
		}else {
			System.out.println("by zero 오류 발생");
		}
		
	}
}
