
public class Coin {

	public static void main(String[] args) {
		int[] coin = { 500, 100, 50, 10, 5, 1 };
		int sum = 0;
		for (int c : coin) {
			System.out.println(c + "円玉は何枚？");
			int num = new java.util.Scanner(System.in).nextInt();

			sum = sum + c * num;//sum+=coin * num;

		}
		System.out.println(sum + "円");
		}

	}
