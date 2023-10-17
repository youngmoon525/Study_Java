package exam.finalextends;

public class AirPlaneMain {
	public static void main(String[] args) {
		SuperSonicAirPlane ssa = new SuperSonicAirPlane();
		ssa.takeOff();
		ssa.flyMode = SuperSonicAirPlane.SUPERSONIC;//ssa.SUPERSONIC;
		ssa.fly();
		ssa.land();
		
		int intValue = 10;
		double doubleValue = intValue;
		//자동형변환 : 더 큰 그릇에 작은 그릇을 담음. 어떤 처리가 필요가 없음. Casting 
		System.out.println(intValue);
		System.out.println(doubleValue);
		
		//강제형변환 : 더 큰 -> 더작은 . 어떤 처리가 필요함(데이터 타입 명시). 데이터 유실
		doubleValue = 3.14;
		intValue = (int)doubleValue;
		System.out.println(intValue);
		
	}
}
