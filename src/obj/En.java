package obj;

public class En implements Zukei{
	int hankei;



	public En(int hankei) {
		this.hankei = hankei;
	}
	public void menseki() {
		System.out.println(this.hankei*this.hankei*3.14);
	}
	public void enshu() {
		System.out.println(2*this.hankei*3.14);

	}
	@Override
	public String toString() {
		return "半径:" + hankei;

	}
	public boolean equals(Object o) {
		if(this == o) {
			return true;
		}if(o instanceof En) {
			En e =(En)o;
			if(this.hankei==e.hankei) {
				return true;
			}
		}
		return false;

	}
}
