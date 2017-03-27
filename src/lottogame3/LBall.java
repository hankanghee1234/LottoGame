package lottogame3;

public class LBall {

	int num;
	LBall next;
	LBall prev;

	public LBall(int num) {
		super();
		this.num = num;
	}

	public void append(LBall target) {

		LBall oldprev = this.prev;
		LBall oldnext = this.next;

		this.next = target;
		oldnext.prev = target;
		target.prev = this;
		target.next = oldnext;

	}

	public void remove() {

		this.prev.next = this.next;
		this.next.prev = this.prev;

	}

}