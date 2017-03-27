package lottogame2;

import java.util.Scanner;

public class InputFuntion {

	static int inputPay() {
		System.out.print("가격을 입력하세요: ");
		Scanner sc = new Scanner(System.in);

		int pay = sc.nextInt();

		int num = pay / 1000;

		System.out.println(pay + "원 만큼 번호를 추출합니다.");
		return num;

	}

}
