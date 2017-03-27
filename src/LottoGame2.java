import java.util.Arrays;

public class LottoGame2 {

	public static void main(String[] args) {
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
				System.out.println("�ߺ��Ǿ����ϴ� : " + idxValue);
				i--;
				continue;

			}

			result[i] = idxValue;
			balls[idx] = 0;

		}

		System.out.println(Arrays.toString(result));

	}

}
