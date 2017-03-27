package lottogame4;

import java.util.Arrays;

public class LottoMachineMain {
	public static void main(String[] args) {

		LottoMachine machine = new LottoMachine();

		LottoBall[] result = machine.selectBall();

		System.out.println(Arrays.toString(result));

		System.out.println(Arrays.toString(machine.balls));

	}
}