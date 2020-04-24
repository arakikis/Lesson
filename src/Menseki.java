public class Menseki {

	public static void main(String[] args) {
		enMenseki(10);

		for(int i=1;i<=5; i++) {
			enMenseki(i);
		}

		int[] han = {3,8,20};
		for(int d : han) {
			enMenseki(d);
		}

	}
	public static void enMenseki(int hankei) {
		System.out.println(hankei * hankei * 3.14);
	}

}
