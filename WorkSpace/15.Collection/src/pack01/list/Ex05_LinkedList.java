package pack01.list;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Ex05_LinkedList {
	public static void main(String[] args) {
		//공부 x
		//데이터를 중간에 추가하는것 빠름 ( 추가 , 삭제 )
		List<String> arrList = new ArrayList<>();
		List<String> linkList = new LinkedList<>();
		long startTime = 0;
		long endTime = 0;
		startTime = System.nanoTime();//nano
		for(int i=0; i<100000; i++) {
			arrList.add(0,new String("A"));
		}
		endTime = System.nanoTime();
		System.out.println("ArrayList로 작업 시간 : " + (endTime - startTime) + "ns");
		
		
		startTime = System.nanoTime();//nano
		for(int i=0; i<100000; i++) {
			linkList.add(0,new String("A"));
		}
		endTime = System.nanoTime();
		System.out.println("LinkedList로 작업 시간 : " + (endTime - startTime) + "ns");
	}
}
