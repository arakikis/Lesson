
public class FizzBuzz {

	public static void main(String[] args) {
		for (int i = 1; i <= 30; i++) {
		String g =	getFizzBuzz(i);
		System.out.println(g);
		}
	}
	public static String getFizzBuzz(int i) {

		if (i % 3 == 0 && i % 5 == 0) {
			return("FizzBuzz");

		} else if (i % 3 == 0) {
			return"Fizz";
		} else if (i % 5 == 0) {
			return"Buzz";
		} else {
			return i+"";

		}


	}
}
