package backjoon_1110;

import java.util.Scanner;

// https://www.acmicpc.net/problem/1110
/*��������
 * ���ϱ� ����Ŭ
 * 0���� ũ�ų� ����, 99���� �۰ų� ���� ������ �־�����, ���� ����
 * 10���� �۴ٸ� 0�� �ٿ� ���ڸ��� ����
 * �� ���� ���ϰ�, ���� ���� �ڿ� �̾����
 * ��ŭ ���ƾ� ���� �� ������ �� ����Ŭ �� ���
 * */
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int input = sc.nextInt();
		int data = input;
		
		int cycle = 0;
		while(true) {
			data = (data%10)*10+((data/10) + (data%10))%10;
			cycle ++;
			if(input == data)
				break;
		}
		System.out.println(cycle);
	}
}
