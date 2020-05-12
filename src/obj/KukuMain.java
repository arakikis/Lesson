package obj;

import java.util.ArrayList;
import java.util.InputMismatchException;

public class KukuMain {

	public static void main(String[] args) {
		ArrayList<KukuMondai> km =
				new ArrayList<KukuMondai>();

		km.add(new  KukuMondai());
		km.add(new  KukuMondai());
		km.add(new  KukuMondai());
		km.add(new  KukuMondai());
		km.add(new  KukuMondai());

		for(KukuMondai k:km) {
			try{k.show();
			int kaitou =new java.util.Scanner(System.in).nextInt();
			k.check(kaitou);
		}catch(InputMismatchException e){
			System.out.println("数字を入力してください");}
		}
	}
}
