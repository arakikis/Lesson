package kouka;

public abstract class Sales {
	private String name;
	private int kingaku;
	public Sales(String name, int kingaku) {
		this.name = name;
		this.kingaku = kingaku;
	}
	public String getName() {
		return name;
	}

	public int getKingaku() {
		return kingaku;
	}

	public int getSouryou() {
		if(this.kingaku<3000) {
		System.out.println(500);
		}
		return kingaku;


	}
	public int getTotal() {
		System.out.println(this.kingaku+getSouryou());
		return kingaku;
	}
	public String toString() {
		System.out.println(this.name+" "+this.kingaku+" "+getSouryou());
		return name;
	}



}
