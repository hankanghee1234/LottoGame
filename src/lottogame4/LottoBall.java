package lottogame4;

public class LottoBall {
	private int num;
	private boolean selected;

	public LottoBall(int num) {
		super();
		this.num = num;
		this.selected = false;

	}

	@Override
	public String toString() {
		return "LottoBall [num=" + num + ", selected=" + selected + "]";
	}

	public boolean askSelected() {
		if (this.selected == false) {
			this.selected = true;
			return false;
		}
		return this.selected;

	}

}