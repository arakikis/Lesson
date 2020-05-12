package obj;

public class Uriage {
	int kosuu;
	Shouhin shouhin;

	void show() {
		System.out.println(shouhin.name+"は"+ kosuu + "個売れた");
	}
	void showUriage() {
		System.out.println(this.kosuu*this.shouhin.price+"円");
	}
}
