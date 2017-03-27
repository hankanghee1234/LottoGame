package lottogame1;

import java.util.Arrays;

public class LottoMachine1 {

	static void insertcoin() {

	}

	static void printBill(int[][] nums) {

		System.out.println("------------------");

		for (int[] is : nums) {
			Arrays.sort(is);

			System.out.println(is[0] + "\t" + is[1] + "\t" + is[2] + "\t" + is[3] + "\t" + is[4] + "\t" + is[5] + "\t");
		}
	}

	static int[][] eject(int count) {

		int[][] result = new int[count][];

		for (int i = 0; i < count; i++) {
			result[i] = selectBalls();
		}

		return result;

	}

	static int[] selectBalls() {

		int[] balls = new int[45];
		int[] result = new int[6];

		int len = balls.length;
		for (int i = 0; i < len; i++) {
			balls[i] = i + 1;
		}

		for (int i = 0; i < result.length; i++) {
			int idx = (int) (Math.random() * len);

			int idxValue = balls[idx];

			if (idxValue == 0) {
				i--;
				continue;
			}

			result[i] = idxValue;
			balls[i] = 0;
		}
		return result;
	}

}
