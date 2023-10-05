import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Ex01_Lotto {
	
	public static void main(String[] args) {
		//UI/UX : 사용자 입장에서 개발
		Random random = new Random();//랜덤한 숫자를 생성하기위한 준비
		Scanner sc = new Scanner(System.in);//사용자의 입력을 받기위해 스캐너 준비
		//sc.nextLine();//<-enter key 입력을 대기해야하는경우.
		//문자열(String)->숫자 int->'Int'eger , double->Double ,...
		
		int[] userNums = new int[6];
		int[] comNums = new int[6];
		for(int i=0; i<userNums.length; i++) {
			userNums[i]=Integer.parseInt( sc.nextLine() );//콘솔창에 입력을 대기..-> enter key
			if(userNums[i] <1 || userNums[i] > 45) {//||(OR)논리합 , &&(AND)논리곱,TRUE(1),FALSE(0)
				System.out.println("숫자 다시 입력하세요.");
				i--;
				continue;
				//System.out.println("여기는 절대 실행불가");break,continue,while(무한)밑의 코드는 절대x
			}
			for(int j=0; j<i; j++) { //배열에 값이1, 6번의 비교가 필요할까????
				if(userNums[j]==userNums[i]) {//중복코드 로직의 기본베이스.오류.디버깅으로 해결해보기
					System.out.println("중복!!");
					i--;
					break;
				}
			}
			comNums[i] = random.nextInt(45)+1;
		}
		//입력한로또:6 , 컴퓨터랜덤:6
		System.out.println(Arrays.toString(userNums));
		System.out.println(Arrays.toString(comNums));//<=당첨번호(Random) 중복된숫자 x , 예외
		
		System.out.println("프로그램 끝 부분");
	}//main
}
