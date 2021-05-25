
package problem_10757;
import java.util.Scanner;

//시간 초과
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String A = sc.next();
		String B = sc.next();
		boolean rounding = false;
		String result = "";
		
		if(A.length() > B.length()) {
			for(int i = B.length(); i < A.length(); i ++) {
				A = '0' + A;
			}
		}
		else {
			for(int i = A.length(); i < B.length(); i ++) {
				A = '0' + A;
			}
		}
		
		for(int i = A.length()-1; i >= 0; i--) {
			int add = Integer.parseInt(A.charAt(i)+"") + Integer.parseInt(B.charAt(i)+"");
			if(rounding) {
				result = String.valueOf(1 + (add%10)) + result;
				rounding = false;
			}
			else
				result = String.valueOf(add%10) + result;
			
			if(add > 9) {
				add = add % 10;
				rounding = true;
			}
		}
		
		if(rounding)
			System.out.print(1);
		
		System.out.println(result);
	}
}
