package backjoon_1436;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		int N = new Scanner(System.in).nextInt();
		if(1 < N && N < 7)
			System.out.println((N-1) +""+666);
		else if(N == 1)
			System.out.println(666);
		else {
			N = N - 7;
			System.out.println((N / 10 != 0 ? N/10 : "") + "" + 666 + "" + N % 10);
		}
	}
}
