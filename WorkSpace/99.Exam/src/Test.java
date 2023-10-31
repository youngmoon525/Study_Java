import java.util.Arrays;

public class Test {
	public static void main(String[] args) {
		int[] test = {1,2,3};
		System.out.println(Arrays.stream(test).anyMatch(i -> i == 4));
		
	}
	
}
