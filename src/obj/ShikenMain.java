package obj;

public class ShikenMain {

	public static void main(String[] args) {
		ItPassport ip= new ItPassport();
		ip.tensu=80;
		ip.show();

		Kihon k = new Kihon(75,80);
		k.show();
	}

}
