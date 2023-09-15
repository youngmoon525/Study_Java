
public class Ex05_String {
	public static void main(String[] args) {
		String str1 = "JDK" + (11 + 1.5); //=>str에는 어떤값이 담겼을까?
		String str2 = 1.5 + 11 + "JDK" ; //?
		System.out.println(str1);
		System.out.println(str2);
		//연산은 왼쪽에서부터 오른쪽으로 한다.
	}
}
