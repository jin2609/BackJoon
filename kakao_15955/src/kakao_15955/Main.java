package kakao_15955;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

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
// Disjoint-Set
public class Main{
	static int[] parent;
	static int[] rank;
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N =  sc.nextInt();
		int Q = sc.nextInt();
		
		int[][] point = new int[N][2];
		for(int i = 0; i < N ; i ++) {
			point[i][0] = sc.nextInt();
			point[i][1] = sc.nextInt();
		}
		
		int[][] quest = new int[Q][3];
		for(int i = 0; i < Q; i++) {
			quest[i][0] = sc.nextInt();
			quest[i][1] = sc.nextInt();
			quest[i][2] = sc.nextInt();
		}
		Arrays.sort(quest, new Comparator<int[]>() {
			@Override
			public int compare(int[] d1, int[] d2) {
				return d1[2] - d2[2]; //오름차순 정렬
			}
		});
		
		

		double distance;
		parent = new int[N+1];
		rank = new int[N+1];
		for(int i = 1; i < N+1; i ++)
			parent[i] = i;

		for(int i = 0; i < quest.length; i ++) {
			int j;
			for(j = 0; j < N; j ++) {
				if(find(quest[i][0]) == find(quest[i][1])) {
					break;
				}
				distance = findDistance(point[j][0],point[j][1], point[quest[i][0]-1][0],point[quest[i][0]-1][1]);
				if(distance <= quest[i][2] && (find(quest[i][0]) != find(j+1)))
					Union(j+1,quest[i][0]);
				if(find(quest[i][0]) == find(j+1)) {
					distance = findDistance(point[j][0],point[j][1], point[quest[i][1]-1][0],point[quest[i][1]-1][1]);
					if(distance <= quest[i][2])
						Union(j+1,quest[i][1]);
				}
			}
			if(find(quest[i][0]) == find(quest[i][1]))
				System.out.println("YES");
			else
				System.out.println("NO");
			
		}
	}
	
	public static void Union(int p,int q) {
		int set1 = find(p);
		int set2 = find(q);
		if(rank[set1] < rank[set2]) {
			parent[set1] = set2;
		}
		else {
			parent[set2] = set1;
		}
		if(rank[set1] == rank[set2])
			rank[set1]++;
	}
	
	public static int find(int p) {
		if(parent[p] == p)
			return p;
		else
			return parent[p] = find(parent[p]);
	}
	
	private static double findDistance(int ax, int ay, int bx, int by) {	
		return Math.abs(ax-bx) < Math.abs(ay-by) ? Math.abs(ax-bx) : Math.abs(ay-by);
	}
}