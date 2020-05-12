public class Menseki {

	public static void main(String[] args) {

		int M = sankakuMenseki(10,5);
		System.out.println(M);

		double m  = enMenseki(10);
		System.out.println(m);

		for(int i=1;i<=5; i++) {
			System.out.println(enMenseki(i));
		}

		int[] han = {3,8,20};
		for(int d : han) {
			double men = enMenseki(d);
			System.out.println(men);
		}

	}
	public static double enMenseki(int hankei) {
		return (hankei*hankei*3.14);

	}
	public static int sankakuMenseki(int w,int h) {
		return (w*h/2);
	}
}

