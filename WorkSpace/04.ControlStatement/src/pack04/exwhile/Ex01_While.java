package pack04.exwhile;

public class Ex01_While {
	public static void main(String[] args) {
		//for , while
		//for : 정해진 횟수를 정확히 인지하고있을때. 
		//	ex)구구단의경우 몇단까지 출력할지를 우리가 인지하고있다(숫자로 알고있음 , 8(2~9)*9(1~0))
		//while : 정해진 횟수를 정확히 모르나 , 어떤 조건에 의해서 반복해야할때.
		//	ex)단순하게 무한반복을 하다가,종료키를 이용하여 꺼야할때, 데이터를 가져왔는데 건수를모름.
		//    내가 데이터를 읽은 후 그 다음 데이터가 있는지의 판단.(Buffer)
		//for(int i = 0 ; i<10 ; i++) {}
		//몇회를 반복해야하는경우 : 변수 , 조건식 , '증감식'
		int i = 0 ; //변수를 무조건 밖에다가 만들어야한다.
		while(i<10) {
			System.out.println("while1반복");
			i++;
		}
		i = 0;// <= 제어 변수가 제어문 외부에 있을때 단점.
		while(i<10) {
			System.out.println("while2반복");
			i++;
		}
		//while문을 이용해서 1부터10까지의 합을 구하는 프로그램을 작성하세요.
		int sum = 0 ;// 반복문 내부에서는 반복변수의 누적이 불가능하다->중괄호의 반복은 변수 새로선언.
		i = 0 ;
		while(i<=10) {
			sum+=i;
			i++;
		}
		System.out.println(sum);
		//시그마 ( 등차수열 , 등비수열 )
		// 1~N까지의 누적합. N(N+1)/2 : 1~10만까지의 누적합.
		//for,while 누적합 가능 vs 시그마 (등차수열) : 둘다 정답은 가능하나 속도차이가 개선(튜닝)
		sum = 10 * (10+1) / 2;
		System.out.println("시그마 : " + sum);
	}
}
