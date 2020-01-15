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
 * Life값이 제일 낮을거부터 사용하면 어째든 증가만하고 줄어들지 않는 것을 활용
 * Map에 저장
 * */
import java.util.Scanner;
import java.util.Arrays;
import java.util.Comparator;

public class Main {
	private static boolean find = false;
	private static boolean[][] ConnectionTable;
	private static int[][] point;
	
	public static void main(String[] args) {
		//입력
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt(); //체크포인트 수
		int Q = sc.nextInt(); //질의의 수

		point = new int[N][2]; //체크포인트
		for(int i = 0; i < N; i ++) {
			point[i][0] = sc.nextInt();
			point[i][1] = sc.nextInt();
		}
		ConnectionTable = new boolean[N+1][N+1];
		
		
		int[][] question = new int[Q][3];	
		for(int i = 0; i < Q; i ++) {
			question[i][0] = sc.nextInt();
			question[i][1] = sc.nextInt();
			question[i][2] = sc.nextInt();
		}
		
		Arrays.sort(question, new Comparator<int[]>() {
            @Override
            public int compare(int[] d1, int[] d2) {
                return d1[2] - d2[2]; //오름차순 정렬
            }
        });
		
		//output
		int maxLife = -1;
		for(int i = 0; i < Q; i++) {
			boolean[] visit = new boolean[N];
			find = false;
			if(ConnectionTable[question[i][0]][question[i][1]]) {
				System.out.println("YES");
				continue;
			}
			else if((maxLife < question[i][2])||(!ConnectionTable[question[i][0]][question[i][0]] && !ConnectionTable[question[i][1]][question[i][1]])) {
				maxLife = question[i][2];
				recursiveMove(visit,question[i][0],question[i][1],question[i][2]);
			}
			
			if(!find)
				System.out.println("NO");
		}
	}

	public static void recursiveMove(boolean[] visit, int start, int finish, int life) {
		visit[start-1] = true;
		ConnectionTable[start][start] = true;
		if(start == finish) { //갈 수 있다면
			System.out.println("YES");
			find = true;
		}
		
		if(life != 0) { // life가 0이 아닌경우
			for(int i = 0; i < point[0].length; i++) {
				if(visit[i]) //만약 자기 자신의 좌표인 경우나 방문을 한 경우라면
					continue;
				Double distance = findDistance(point[0][start-1],point[1][start-1],point[0][i],point[1][i]); //최단거리를
				if(distance <= life) {
					ConnectionTable[start][i+1] = true;
					ConnectionTable[i+1][start] = true;
					recursiveMove(visit,i+1,finish,life);
				}
			}
		}
		else {
			for(int i = 0; i < point[0].length; i++) {
				if(visit[i]) //만약 자기 자신의 좌표인 경우나 방문을 한 경우라면
					continue;
				if((point[0][start-1] == point[0][i]) || (point[1][start-1] == point[1][i])) {
					ConnectionTable[start][i+1] = true;
					ConnectionTable[i+1][start] = true;
					recursiveMove(visit,i+1,finish,life);
				}
			}
		}
	}
	
	private static double findDistance(double ax, double ay, double bx, double by) {
		return Math.abs(ax-bx) > Math.abs(ay-by) ? Math.abs(ax-bx) : Math.abs(ay-by);
	}
}
