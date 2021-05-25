package kakao_15956;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		String input = new Scanner(System.in).next();
		String[] SI_Input = input.split("&&");
		
		//입력이 하나
		if(SI_Input.length == 1) {
			System.out.println(input);
			return;
		}		
		
		//입력이 두개 이상
		//1. 데이터를 쪼갠다.
		String[][] SII_Input = new String[SI_Input.length][3];
		for(int i = 0; i < SI_Input.length; i++) {
			if(SI_Input[i].contains("!=")) {
				String[] splitData = SI_Input[i].split("!=");
				SII_Input[i][0] = splitData[0];
				SII_Input[i][1] = splitData[1];
				SII_Input[i][2] = "!=";
			}
			else {
				String[] splitData = SI_Input[i].split("==");
				SII_Input[i][0] = splitData[0];
				SII_Input[i][1] = splitData[1];
				SII_Input[i][2] = "==";
			}
		}
		
	}
}
