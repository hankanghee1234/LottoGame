package lottogame2;

import java.util.Scanner;

public class LottoMachine3 {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("코인을 입력하세요: ");
		
		int inputcoin = scanner.nextInt();

		int[] balls = new int[45];
		int[] result = new int[6];

		for (int j = 0; j < 6; j++) {
			for (int i = 0; i < balls.length; i++) {
				balls[i] = i + 1;
			}

		}

	}

}
