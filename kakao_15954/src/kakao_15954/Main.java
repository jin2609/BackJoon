package kakao_15954;

import java.util.Scanner;
/*���� ����
 * N������ ���� �Ǹ� (1 <= N <= 500)
 * N���� ���� ��ġ �� K�� ���޾� ����( 1 <= K <= N )
 * �� ��, ��ȣ���� ǥ�������� �ּҰ� �Ǵ� ǥ������ ���
 * *��� = ��� ���
 * *�л� = ((a^1-m)^2 + (a^2-m)^2 + (a^3-m)^2 + ... + (a^n-m)^2)/n 
 * */
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//�Է�
		int N = sc.nextInt(); 
		int K = sc.nextInt();
		int[] preper = new int[N]; //��ȣ�� ����
		
		for(int i = 0; i < N; i ++) { //��ȣ��
			preper[i] = sc.nextInt();
		}
		
		/*ǥ������ �ּҰ� ���ϱ�*/
		double min = Integer.MAX_VALUE;
		for(int i = 0; i < (N-K+1); i ++) {
			/*���*/
			double mean = 0;
			for(int j = i; j < i+K; j++) {
				mean = mean + (double)preper[j];
			}
			mean /= K;

			/*�л�*/
			double cov = 0;
			for(int j = i; j < i+K; j++) {
				cov += (preper[j]-mean)*(preper[j]-mean);
			}
			cov /= K;
			
			//ǥ������ �ּҰ� ã��
			if(min > cov)
				min = cov;
		}
		System.out.println(Math.sqrt(min));
	}
}
