package exam.testabstract;
//접근제한자 "abstract" 클래스 
public abstract class Animal {
	//변수.
	public String kind; //종류
	
	//abstarct 키워드가 들어간 메소드는 구현부를 넣으면 x
	public abstract void breathe();//메소드의 선언
	
	//이거는 음식을 먹는 메소드 , 파라메터로 음식을 입력하고 , 음식먹는 로직 후 int값으로 포만도를 return
	public abstract int eat(String food);
	
	//메소드의 정의
	public void method() {
		
	}
	
}
