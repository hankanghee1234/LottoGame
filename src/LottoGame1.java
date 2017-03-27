import java.util.Arrays;

public class LottoGame1 {

	public static void main(String[] args) {
		int i;
		int j;

		int result[] = new int[6];

		outer: 
			for (i = 0; i < result.length; i++) {
			int value = (int) (Math.random() * 45) + 1;

			for (j = 0; j < i; j++)
			// for(j=0;j<result.length;j++)
			{
				if (result[j] == value) {
					System.out.println("�ߺ�üũ" + value);
					i--;
					continue outer;
				}
			}
			result[i] = value;
		}
		System.out.println(Arrays.toString(result));
	}
}
