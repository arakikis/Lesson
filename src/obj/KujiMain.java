package obj;

import java.util.ArrayList;

public class KujiMain {

	public static void main(String[] args) {

		ArrayList<Kuji> Klist = new ArrayList<Kuji>();

		Klist.add(new Kuji(123456));
		Klist.add(new Kuji(101012));
		Klist.add(new Kuji(654321));

		KujiChecker kc = new KujiChecker();
		for (Kuji k : Klist) {
			kc.check(k);
			k.show();
		}

		System.out.println("合計" + kc.kingaku + "円");
	}

}
