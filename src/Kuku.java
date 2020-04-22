
public class Kuku {

	public static void main(String[] args) {
		System.out.println("九九の練習");

		int ram1 = new java.util.Random().nextInt(9)+1;
		System.out.print(ram1);

		System.out.print("×");

		int ram2 = new java.util.Random().nextInt(9)+1;
		System.out.print(ram2);

		System.out.print("＝");

		int num = new java.util.Scanner(System.in).nextInt();

		if(num == ram1*ram2) {
			System.out.println("正解");

		}else {
			System.out.println("不正解 正解は" + ram1*ram2);
		}
	}

}
