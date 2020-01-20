package kakao_15955;

import java.util.Arrays;
import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Scanner;

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

public class Main {
	static int[] parent;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int Q = sc.nextInt();
		
		Point[] point = new Point[N];
		for(int i = 0 ; i < N ; i ++) {
			point[i] = new Point(sc.nextInt(),sc.nextInt(),i+1);
		}
	
		Question[] question = new Question[Q];
		for(int i = 0; i < Q; i++) {
			question[i] = new Question(sc.nextInt(),sc.nextInt(),sc.nextInt(),i);
		}
		Arrays.sort(question, new Comparator<Question>() {
			@Override
			public int compare(Question d1, Question d2) {
				return d1.life - d2.life; //오름차순 정렬
			}
		});
		String[] solution = new String[Q];
		
		Pair[] pair = new Pair[2*N-2];
		Arrays.sort(point, new Comparator<Point>() {
			@Override
			public int compare(Point p1, Point p2) {
				return p1.x - p2.x; //오름차순 정렬
			}
		});
		for(int i = 0; i < N-1; i ++) {
			pair[2*i] = new Pair(point[i].num,point[i+1].num,(point[i+1].x-point[i].x));
		}
		Arrays.sort(point, new Comparator<Point>() {
			@Override
			public int compare(Point p1, Point p2) {
				return p1.y - p2.y; //오름차순 정렬
			}
		});
		for(int i =0; i < N-1; i ++) {
			pair[2*i+1] = new Pair(point[i].num,point[i+1].num,(point[i+1].y-point[i].y));
		}
		Arrays.sort(pair, new Comparator<Pair>() {
			@Override
			public int compare(Pair p1, Pair p2) {
				return p1.distance - p2.distance; //오름차순 정렬
			}
		});
		
		
		parent = new int[N+1];
		for(int i = 1; i < N+1; i ++)
			parent[i] = i;
		
		int maxLife = -1; 
		int j = 0;
		for(int i = 0; i < Q; i ++) {
			if(maxLife < question[i].life) {
				maxLife = question[i].life;
				for(; j < pair.length && pair[j].distance <= maxLife; j++) {
					Union(pair[j].num1,pair[j].num2);
				}
			}
			int start = find(question[i].start);
			int finish = find(question[i].finish);
			if(start == finish)
				solution[question[i].num] = "YES";
			else
				solution[question[i].num] = "NO";
		}
		
		for(int i = 0; i < Q; i++)
			System.out.println(solution[i]);
	}
	
	public static void Union(int p,int q) {
		int set1 = find(p);
		int set2 = find(q);
		parent[set1] = set2;
	}
	
	public static int find(int p) {
		if(parent[p] == p)
			return p;
		else
			return parent[p] = find(parent[p]);
	}
	
	public static class Question{
		int start;
		int finish;
		int life;
		int num;
		
		public Question(int start, int finish, int life, int num) {
			this.start = start;
			this.finish = finish;
			this.life = life;
			this.num = num;
		}
	}
	
	public static class Point{
		int x;
		int y;
		int num;
		
		public Point(int x, int y, int num) {
			this.x = x;
			this.y = y;
			this.num = num;
		}
	}
	public static class Pair{
		int num1;
		int num2;
		int distance;
		
		public Pair(int n1, int n2, int dis) {
			num1 = n1;
			num2 = n2;
			distance = dis;
		}
	}
	
}
