public class Method {

	public static void main(String[] args) {
		System.out.println("メソッドの呼び出し");
		hello("湊");
		hello("朝香");
		System.out.println("メソッドの呼び出し終了");
		int kotae = keisan(10, 20); //=30になる

		int p = goukei(100);
		System.out.println(p);
		show("田中", 30);
		int x = 10;
		test(x);
		System.out.println(x);

		for (int i = 10; i <= 20; i++) {
			jijo(i);
		}

		String[] names = { "山本", "佐藤", "鈴木" };
		for (String n : names) {
			hello(n);
		}
		boolean b = isGuusu(10);
		if( b == true) {
			System.out.println("偶数");
		}else {
			System.out.println("奇数");
		}

		System.out.println(getTimeName(5));

		int[]nums = {5,8,9,2};
		printArray(nums);

		String date = "apple,orange,lemon";
		String[] fruits = date.split(",");
		System.out.println(fruits[0]);
		System.out.println(fruits[1]);
		System.out.println(fruits[2]);
		
		int num = getLast(nums);
		System.out.println(num);
		}
	public static int getLast(int[]array) {
		return array[array.length - 1];
		
		}



	public static void printArray(int[]array) {
		for(int num : array) {
			System.out.println(num);
		}
	}

	public static String getTimeName(int hour) {
		if(hour>=0 && hour<=11) {
			return("午前");
		}else if(hour >=12 && hour <= 24){
			return("午後");
		}else {
			return("エラー");
		}
	}

	public static boolean isGuusu(int num){
		if(num % 2==0) {
		return(true);
		}else{
		return(false);
	}
		}

	public static void jijo(double num) {
		System.out.println(num * num);

	}public static void jijo(int num) {
		System.out.println(num * num);

	}


	public static void test(int x) {
		x = 20;

	}

	public static void show(String name, int age) {
		System.out.println(name + "さんは" + age + "歳です。");

	}

	public static void hello(String name) {
		System.out.println(name + "さん、こんにちは");

	}

	public static int keisan(int x, int y) {
		int sum = x + y;
		return (sum);

	}

	public static int goukei(int num) {
		int sum = 0;
		for (int i = 1; i <= num; i++) {
			sum += i;

		}
		return (sum);

	}
}
