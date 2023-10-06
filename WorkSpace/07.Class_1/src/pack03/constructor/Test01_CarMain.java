package pack03.constructor;

public class Test01_CarMain {
	//String company = null or "현대";
	public static void main(String[] args) {
		Test01_Car car = new Test01_Car("현대" , "현대차");
		//car.name = "현대차";
		car.color = 999;
		//car.company ="현대";
		car.model ="SUV";
		System.out.println(car.name + " " + car.model);
	}
}
