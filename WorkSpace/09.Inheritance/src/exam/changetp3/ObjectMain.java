package exam.changetp3;

public class ObjectMain {
	public static void main(String[] args) {
		//자바의 모든 클래스는 Object를 통해 만들어졌다.
		//Object obj = ?; 
		//String : 문자열에 특성화 기능
		Object obj = "문자열";
		String str = (String) obj;
		System.out.println(str.length() + str);
		obj = 10;
		int num = (int) obj;
		System.out.println(num);
//		obj = 10;
//		obj =new Child();
	}
	
	public void method(Object obj) {
		if(obj instanceof String) {
			
		}
	}
}
