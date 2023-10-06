package pack02.exfield;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class TestFieldMain {
	public static void main(String[] args) {
		
		
		
		TestField tf = new TestField();//TestField내부에 있는 모든 멤버가 메모리에 올라가서 사용준비마침
		//TestField내부에 있는 모든 변수들은 각타입의 기본값을 가진다->(숫자.0 , null)
		System.out.println(tf.intField);
		System.out.println(tf.booleanField);
		tf.random = new Random();
		tf.car = new Car();
		tf.sc = new Scanner(System.in);
	
		System.out.println(tf.random);
		System.out.println(tf.car);
		System.out.println(tf.arrInts);
	}
}
