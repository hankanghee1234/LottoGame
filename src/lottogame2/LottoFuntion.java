package lottogame2;

//LottoFuction
import java.util.Arrays;
import java.util.Scanner;

public class LottoFuntion {

	static int[][] randomLoop(int count) {

		int[][] result = new int[count][];

		for (int i = 0; i < result.length; i++) {
			result[i] = random(6);
		}
		return result;

	}

	static int[] random(int number) {

		int n1 = number;
		int[] result = new int[6];

		for (int i = 1; i <= n1; i++) {
			outer: 
			for (int j = 0; j < 6; j++) {

				int lotto = (int) ((Math.random() * 45) + 1);

				result[j] = lotto;

				for (int k = 0; k < j; k++) {
					if (result[k] == lotto) {
						j--;
						continue outer;
					}
				}
			}
		}
		return result;

	}

	public static void print(int[][] result) {

		for (int[] is : result) {

			Arrays.sort(is);
			System.out.println(Arrays.toString(is));

		}

	}

}
