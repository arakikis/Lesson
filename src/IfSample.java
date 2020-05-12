
public class IfSample {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		System.out.println("月を入力");
		int mon = new java.util.Scanner(System.in).nextInt();
		switch(mon) {
		case 2:
			System.out.println("29日");
			break;
		case 4:
		case 6:
		case 9:
		case 11:
			System.out.println("30日");
			break;
		case 1:
		case 3:
		case 5:
		case 7:
		case 8:
		case 10:
		case 12:
			System.out.println("31日");
		default:
			System.out.println("エラー");
		}

	}
}
