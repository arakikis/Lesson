package obj;

public class KukuMondai {
	int num1;
	int num2;


	public KukuMondai() {
		 num1 = new java.util.Random().nextInt(9) + 1;
		 num2 = new java.util.Random().nextInt(9) + 1;

	}

	void show() {
		System.out.println(num1+"×"+num2+"=");
	}
	void check(int kotae) {
		if (kotae == num1 * num2) {
			System.out.println("正解");

		} else {
			System.out.println("不正解 正解は" + num1 * num2);

		}
	}
}
