package pack04.exwhile;

public class Test02_WileFor {
	public static void main(String[] args) {
		//1.구구단 2~9단을 출력하는데 for문1개 while문 1개를 써서 출력.
		for(int i=2; i<=9; i++) {
			int j=1;
			while(j<=9) {
				System.out.println(i*j);
				j++;
			}
		}
		int i = 2;
		while(i<=9) {
			for(int j=1; j<=9; j++) {
				System.out.println(i*j);
			}
			i++;
		}
		
	}
}
