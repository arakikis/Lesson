public class Hairetu2 {

	public static void showKion(double k ) {
		System.out.println(k +"度");
	}


	public static void main(String[] args) {
		double[] kions = {15.5,20.1,18.3};
		for (double k :kions) {
			showKion(k);
		}




		int[] date = {5,8,7,9,6};

		for(int d :date) {
			System.out.println(d);
		}


		int[] prices = { 100, 200, 150 };


		for (int value : prices) {
			System.out.println(value);
		}

		String[] names = { "コーラ", "コーヒー", "水" };


		for (String namae : names) {
			System.out.println(namae+"は"+namae.length()+"文字");
		}

		int[] points = { 80, 90, 60, 70, 80 };
		int sum = 0;

		for (int gou : points) {
			sum += gou;
		}
		System.out.println(sum);

		int count = 0;
		for (int c : points) {
			count++;

		}
		System.out.println(count);

	}
}
