
public class IfSample {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		System.out.println("点数を入力");
		int num = new java.util.Scanner(System.in).nextInt();
		if (num >= 80 ) {                 //文字列は.equals
			System.out.println("評価A");

		}else if( 60<= num ){
			System.out.println("評価B");

		}else {
			System.out.println("評価C");
		}


	}
}
