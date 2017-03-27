package lottogame3;

public class LBallMain {
	public static void main(String[] args) {

		LBall[] balls = new LBall[45];

		for (int i = 0; i < balls.length; i++) {

			balls[i] = new LBall(i + 1);
		}

		for (int i = 0; i < balls.length - 1; i++) {
			balls[i].next = balls[i + 1];
		}

		for (int i = 1; i < balls.length; i++) {
			balls[i].prev = balls[i - 1];
		}

		LBall current = balls[0];

		current.next.remove();
		current.append(new LBall(100));

		// balls = null;

		while (true) {
			System.out.println(current.num);

			current = current.next;

			if (current == null) {
				break;
			}
		}

		// System.out.println("================");
		//
		// current = balls[balls.length -1];
		//
		// 
		// while(true){
		// System.out.println(current.num);
		//
		// current = current.prev;
		//
		// if(current == null){
		// break;
		// }
		// }
	}

}