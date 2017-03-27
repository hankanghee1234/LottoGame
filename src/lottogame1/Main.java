package lottogame1;

import java.util.Arrays;

public class Main {

	public static void main(String[] args) {

		// int[] resultballs = LottoMachine.selectBalls();

		// System.out.println(Arrays.toString(resultballs));

		int[][] result = LottoMachine1.eject(5);

		LottoMachine1.printBill(result);

		// for (int[] is : result) {

		// System.out.println(Arrays.toString(is));
	}
}
