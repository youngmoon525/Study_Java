package pack01.method;

public class DAO {
	int test = 10;
	// 메소드를 리턴타입 또는 파라매터 개수를 다르게 해서(호출 , 이름 다르게) 4개 만들기
	public int sum(int x  , int y) {
		return x+y;
	}
	public void display(String[] arr) {
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
	}
	
	public int minus(int x , int y) {
		return x-y;
	}
	
	public String getName() {
		return "KYM";
	}
}
