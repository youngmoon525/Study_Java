package pack02.map;

import java.util.HashMap;

public class Ex01_Map {
	public static void main(String[] args) {
		// key , value
		//HashMap<Key extends Object , Value exteds Object>
		//key : 데이터를 식별하기위한 식별자 , value : 데이터 
		//HashMap은 데이터를 key로 관리함(index)
		//동일한 데이터 입력 x  ex)key 주민등록번호 => value 이름 , 나이 등등
		//put 데이터 넣기
		HashMap<Integer, String> map = new HashMap<>();
		map.put(1, "임꺽정");
		map.put(1, "이몽룡");//?
		map.put(2, "성춘향");//?
		map.remove(2);
		System.out.println(map.get(1));
		System.out.println(map.size());
	}
}
