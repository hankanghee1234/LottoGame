package lottogame4;

public class LottoMachine {

	LottoBall[] balls;

	public LottoMachine() {
		balls = new LottoBall[45];

		for (int i = 0; i < 45; i++) {
			balls[i] = new LottoBall(i + 1);
		}
	}

	public LottoBall[] selectBall() {

		LottoBall[] result = new LottoBall[6];

		for (int i = 0; i < 6; i++) {

			LottoBall ball = balls[(int) (Math.random() * 45)];

			if (ball.askSelected() == true) {
				i--;
				continue;
			}
			result[i] = ball;
		}

		return result;
	}
}