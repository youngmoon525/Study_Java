package exam.finalextends;

public class SuperSonicAirPlane extends AirPlane {
//일반 비행기 기능 + 음속 날수있는 기능
//final == 상수 ( 절대 변하지 않을 값을 의미함) 변수 (변할수있는 수)
//ex) 프로젝트가 완료 된 상태에서 Server IP는 절대로 변하면 안됨.
//ex) 주민등록번호 , PIE(3.14)
//값을 초기화 할때 한번만 할당. 그 후 변경 불가능
//네이밍룰 : 전체를 대문자로 표현함
//	public static final double PI = 3.14;
	public static final int NOMAL = 1;
	public static final int SUPERSONIC = 2;

	public int flyMode = NOMAL;

	@Override
	public void fly() {
		if(flyMode == NOMAL) {
			super.fly();			
		}else if(flyMode == SUPERSONIC) {
			System.out.println("음속의 속도로 비행합니다");
		}
	}

}
