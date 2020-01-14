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
 * 시간초과 : DP로 풀어야할 듯..
 * */

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
	private static boolean find = false;
	private static Map<Integer, boolean[]> ConnectionTable = new HashMap<Integer, boolean[]>();
	private static int[][] point;
	
	public static void main(String[] args) {
		//입력
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt(); //체크포인트 수
		int Q = sc.nextInt(); //질의의 수

		point = new int[2][N]; //체크포인트
		for(int i = 0; i < N; i ++) {
			point[0][i] = sc.nextInt();
			point[1][i] = sc.nextInt();
		}
		
		int[][] question = new int[3][Q]; //question
		
		boolean[] conn = new boolean[N];
		for(int i = 0; i < Q; i ++) {
			question[0][i] = sc.nextInt();
			question[1][i] = sc.nextInt();
			question[2][i] = sc.nextInt();
			ConnectionTable.put(question[2][i], conn);
		}
			

		//output
		for(int i = 0; i < Q; i++) {
			boolean[] visit = new boolean[N];
			find = false;
			boolean[] table = ConnectionTable.get(question[2][i]);
			if(!table[question[0][i]-1] && !table[question[1][i]-1]) {
				ConnectionTable.put(question[2][i], conn);
				recursiveMove(visit,question[0][i],question[1][i],question[2][i]);
			}
			else {
				if(table[question[0][i]-1] && table[question[1][i]-1]) {
					find = true;
					System.out.println("YES");
				}
			}
			if(!find)
				System.out.println("NO");
		}
	}

	public static void recursiveMove(boolean[] visit, int start, int finish, int life) {
		visit[start-1] = true;
		boolean[] table = ConnectionTable.get(life);
		table[start-1] = true;
		if(start == finish) { //갈 수 있다면
			System.out.println("YES");
			find = true;
			return;
		}
		
		if(life != 0) { // life가 0이 아닌경우
			for(int i = 0; i < point[0].length; i++) {
				if(visit[i]) //만약 자기 자신의 좌표인 경우나 방문을 한 경우라면
					continue;
				Double distance = findDistance(point[0][start-1],point[1][start-1],point[0][i],point[1][i]); //최단거리를
				if(distance <= life) {
					table[i] = true;
					ConnectionTable.put(life, table);
					recursiveMove(visit,i+1,finish,life);
				}
			}
		}
		else {
			for(int i = 0; i < point[0].length; i++) {
				if(visit[i]) //만약 자기 자신의 좌표인 경우나 방문을 한 경우라면
					continue;
				if((point[0][start-1] == point[0][i]) || (point[1][start-1] == point[1][i])) {
					table[i] = true;
					ConnectionTable.put(life, table);
					recursiveMove(visit,i+1,finish,life);
				}
			}
		}
	}
	
	private static double findDistance(double ax, double ay, double bx, double by) {
		return Math.abs(ax-bx) > Math.abs(ay-by) ? Math.abs(ax-bx) : Math.abs(ay-by);
	}
}
