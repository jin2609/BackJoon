package kakao_15955;
/*
 * 문제 링크 : https://www.acmicpc.net/problem/15955
 * 문제 이해
 * 입력 : N(체크포인트), Q(질의의 수), 체크포인트 좌표(X,Y), 질의(A,B,X : A번 체크포인트에서 B번 체크포인트로 최대 HP제한 X상태에서 움직일 수 있는가)
 * 출력 : 가능한지 불가능한지 YES or NO
 * 체크포인트에 도달하면 충전을 하거나 HP를 X만큼 회복하는 둘중에 한가지 방법을 사용할 수 있음
 * HP를 소모하면 그 거리만큼 갈 수 있음
 * 부스터는 x축 혹은 y축으로 한방향으로만 이동가능
 *
 * */

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		//입력
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt(); //체크포인트 수
		int Q = sc.nextInt(); //질의의 수
		
		int[][] point = new int[2][N]; //체크포인트
		for(int i = 0; i < N; i ++) {
			point[0][i] = sc.nextInt();
			point[1][i] = sc.nextInt();
		}
		int[][] question = new int[3][Q]; //질의
		for(int i = 0; i < Q; i++) {
			question[0][i] = sc.nextInt();
			question[1][i] = sc.nextInt();
			question[2][i] = sc.nextInt();
		}
	}

}
