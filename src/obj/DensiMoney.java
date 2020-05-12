package obj;

public class DensiMoney {
	private int kingaku;
	private int point;

	public int getKingaku() {
		return kingaku;
	}

	public int getPoint() {
		return point;
	}

	public void charge(int m) {
		this.kingaku += m;
	}

	public void buy(int m) {
		if (m <= this.kingaku) {
			this.kingaku -= m;
			this.point += m * 0.05;
		} else {
			System.out.println("残金が足りません");
		}
	}

	public void change() {
		this.kingaku +=this.point;
		this.point =0;
	}
}
