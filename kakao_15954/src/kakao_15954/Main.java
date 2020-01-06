package kakao_15954;

import java.util.Scanner;
/*문제 이해
 * N종류의 인형 판매 (1 <= N <= 500)
 * N개의 인형 배치 후 K개 연달아 뽑음( 1 <= K <= N )
 * 이 때, 선호도의 표준편차가 최소가 되는 표준편차 출력
 * *평균 = 산술 평균
 * *분산 = ((a^1-m)^2 + (a^2-m)^2 + (a^3-m)^2 + ... + (a^n-m)^2)/n 
 * */
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//입력
		int N = sc.nextInt(); 
		int K = sc.nextInt();
		int[] preper = new int[N]; //선호도 정보
		
		for(int i = 0; i < N; i ++) { //선호도
			preper[i] = sc.nextInt();
		}
		
		/*표준편차 최소값 구하기*/
		double min = Integer.MAX_VALUE;
		for(int i = 0; i < (N-K+1); i ++) {
			/*평균*/
			double mean = 0;
			for(int j = i; j < i+K; j++) {
				mean = mean + (double)preper[j];
			}
			mean /= K;

			/*분산*/
			double cov = 0;
			for(int j = i; j < i+K; j++) {
				cov += (preper[j]-mean)*(preper[j]-mean);
			}

			cov /= K;
			//표준편차 최소값 찾기
			if(min > cov)
				min = cov;
		}
		System.out.printf("%.11f",Math.sqrt(min));
	}
}
