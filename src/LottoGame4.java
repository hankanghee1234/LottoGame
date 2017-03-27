import java.util.Arrays;

public class LottoGame4 {
	public static void main(String[] args) {

		int[] balls = new int[45];
		int[] result = new int[6];

		int len = balls.length;

		for (int i = 0; i < len; i++) {
			balls[i] = i + 1;
		}

		System.out.println(Arrays.toString(balls));

		for (int i = 0; i < 6; i++) {

			int idx = (int) (Math.random() * balls.length);

			result[i] = balls[idx];

			int[] copyed = new int[balls.length - 1];

			System.arraycopy(balls, 0, copyed, 0, idx);
			System.arraycopy(balls, idx + 1, copyed, idx, balls.length - (idx + 1));

			balls = copyed;

			System.out.println(Arrays.toString(balls));

		}

		System.out.println(Arrays.toString(result));

	}

}
