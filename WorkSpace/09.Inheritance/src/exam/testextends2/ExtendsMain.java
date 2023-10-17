package exam.testextends2;

public class ExtendsMain {
	public static void main(String[] args) {
	
		SubClass sub = new SubClass();
		System.out.println(sub.sum(1, 2));
		System.out.println(sub.minus(1, 2));
		System.out.println(sub.mul(1, 2));
		System.out.println(sub.div(1, 2));
	}
}
