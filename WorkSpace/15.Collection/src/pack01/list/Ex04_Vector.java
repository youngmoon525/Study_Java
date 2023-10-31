package pack01.list;

import java.util.List;
import java.util.Vector;

public class Ex04_Vector {
	public static void main(String[] args) {
		//다시 공부 x , Thread 안정성 , 동기화 메소드. <= 자바 내부적으로 많이 사용이 됨.
		//ArrayList보다 성능이 안좋음
		Vector<DepartmentDTO> vector = new Vector<>();
		List<DepartmentDTO> list = new Vector<>();
		vector.add(new DepartmentDTO(1, 2, 3, "201호"));
		//get == dto(필드)
		System.out.println(vector.get(0).getDepartmentId());
		System.out.println(vector.get(0).getDepartmentName());
		System.out.println(vector.get(0).getLocationId());
		System.out.println(vector.get(0).getManagerId());
	}
}
