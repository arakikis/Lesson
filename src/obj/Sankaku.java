package obj;

public class Sankaku implements Zukei {
	private int teihen ;
	private int takasa ;


	public Sankaku(int teihen, int takasa) {
		this.teihen = teihen;
		this.takasa = takasa;
	}
	public int getTeihen() {
		return this.teihen;
	}
	public void setTeihen(int teihen) {
		this.teihen = teihen;
	}
	public int getTakasa() {
		return this.takasa;
	}
	public void setTakasa(int takasa) {
		this.takasa=takasa;
	}

	public void menseki() {
		System.out.println(teihen*takasa/2);
	}

	@Override
	public String toString() {
		return "底辺:"+ teihen+",高さ:"+takasa;
	}

}
