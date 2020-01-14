package kakao_15955;
/*
 * 문제 링크 : https://www.acmicpc.net/problem/15955
 * 문제 이해
 * 입력 : N(체크포인트), Q(질의의 수), 체크포인트 좌표(X,Y), 질의(A,B,X : A번 체크포인트에서 B번 체크포인트로 최대 HP제한 X상태에서 움직일 수 있는가)
 * 출력 : 가능한지 불가능한지 YES or NO
 * 체크포인트에 도달하면 충전을 하거나 HP를 X만큼 회복하는 둘중에 한가지 방법을 사용할 수 있음
 * HP를 소모하면 그 거리만큼 갈 수 있음
 * 부스터는 x축 혹은 y축으로 한방향으로만 이동가능
 * 각각의 체크포인트에서 최대 한번만 재 충전 가능
 * */

import java.util.Scanner;

public class Main {
	private static boolean find = false;
	
	public static void main(String[] args) {
		//입력
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt(); //체크포인트 수
		int Q = sc.nextInt(); //질의의 수

		double[][] point = new double[2][N]; //체크포인트
		for(int i = 0; i < N; i ++) {
			point[0][i] = sc.nextDouble();
			point[1][i] = sc.nextDouble();
		}


		//output
		for(int i = 0; i < Q; i++) {
			boolean[] visit = new boolean[N];
			find = false;
			recursiveMove(point,visit,sc.nextInt(),sc.nextInt(),sc.nextInt());
			if(!find)
				System.out.println("NO");
		}
	}

	public static void recursiveMove(double[][] point,boolean[] visit, int start, int finish, int life) {
		visit[start-1] = true;
		
		if(start == finish) { //갈 수 있다면
			System.out.println("YES");
			find = true;
			return;
		}
		if(life != 0) { // life가 0이 아닌경우
			for(int i = 0; i < point[0].length; i++) {
				if(find)
					break;
				if(visit[i]) //만약 자기 자신의 좌표인 경우나 방문을 한 경우라면
					continue;
				Double distance = findDistance(point[0][start-1],point[1][start-1],point[0][i],point[1][i]); //최단거리를
				if(distance <= life) {
					recursiveMove(point,visit,i+1,finish,life);
				}
			}
		}
		else {
			for(int i = 0; i < point[0].length; i++) {
				if(find)
					break;
				if(visit[i]) //만약 자기 자신의 좌표인 경우나 방문을 한 경우라면
					continue;
				if((point[0][start-1] == point[0][i]) || (point[1][start-1] == point[1][i])) {
					recursiveMove(point,visit,i+1,finish,life);
				}
			}
		}
	}
	
	private static double findDistance(double ax, double ay, double bx, double by) {
		return Math.abs(ax-bx) > Math.abs(ay-by) ? Math.abs(ax-bx) : Math.abs(ay-by);
	}

}
