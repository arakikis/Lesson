
public class Loop2 {

	public static void main(String[] args) {
		for(int i = 1 ; i<=5 ; i++){
		System.out.println("こんにちは");
	}
		for(int i = 1; i <=5 ; i++) {
		System.out.println(i);
		}

		System.out.println("数を入力");
		int num = new java.util.Scanner(System.in).nextInt();
		for(int i = 0; i <= num ; i++) {
			System.out.println(i);
		}
		 System.out.println();

		for(int i = 2; i <=10 ; i+=2) {
			System.out.println(i);
		}
		System.out.println();

		for(int i = 5; i>0 ; i--) {
			System.out.println(i);
		}
		System.out.println();
		int sum = 0;
		for(int i = 1; i<=10; i++) {
			sum = sum + i;         // sum += i;
		}
		System.out.println(sum);

	}

}
