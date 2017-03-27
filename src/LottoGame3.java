import java.util.Arrays;

public class LottoGame3 {

	public static void main(String[] args) {
		int[] balls = new int[45];
		// int[] result = new int[6];

		int len = balls.length;

		for (int i = 0; i < len; i++) {
			balls[i] = i + 1;
		}

		System.out.println(Arrays.toString(balls));

		for (int i = 0; i < 6; i++) {

			int idx = (int) (Math.random() * (balls.length - i));

			int value = balls[idx];

			int targetValue = balls.length - i;
			int targetValueIdx = balls.length - (i + 1);
			// System.out.println("targetValue: " + targetValue + " " +
			// targetValueIdx);

			balls[idx] = targetValue;
			balls[targetValueIdx] = value;

			System.out.println(Arrays.toString(balls));

		}

	}

}
