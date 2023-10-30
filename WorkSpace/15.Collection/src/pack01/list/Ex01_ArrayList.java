package pack01.list;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Ex01_ArrayList {
	public static void main(String[] args) {
		//String데이터 5건을 저장할수있는 배열을 만들고 각각 A~E까지의 문자열을 할당하고 출력해보기.
		String[] arr = new String[5];
		String[] arr2 = {"A","B","C","D","E" };
		arr[0]="A";
		arr[1]="B";
		arr[2]="C";
		arr[3]="D";
		arr[4]="E";
		for(int i=0; i<arr.length; i++) {
			System.out.println(arr[i] + " : " + arr2[i]);
		}
		//F를 배열에 "추가"해보기.---밑 부터 코딩.[A]..[E] 기존 크기 +1
		String[] tempArr = new String[arr.length+1];
		//[][][][][][]
		for(int i=0; i<arr.length; i++) {
			tempArr[i] = arr[i];
			//[A][B][C][D][E][null]
		}
		tempArr[tempArr.length-1] = "F";
		System.out.println(Arrays.toString(tempArr));
		//배열은 사이즈를 미리 지정 후 변경이 불가능 -> 데이터 추가&삭제 시 불편한점이 많음.
		//List <- Interface
		//List<E> E <= Element(요소) extends Object (객체 형태로 초기화 가능)
		List<String> list = new ArrayList<>();
		list.add("A");// add <= 데이터를 추가 하면서 크기가 증가함.(index)
		list.add("B");
		list.add("C");
		list.add("D");
		list.add("F");
		System.out.println("리스트 크기" + list.size());
		System.out.println("리스트 [0] : " + list.get(0));
		//list의 내용을 for문을 이용하여 전체 출력해보기.
		for(int i=0; i<list.size(); i++) {
			System.out.println(list.get(i) + " : " + arr2[i]);
		}
	}
}
