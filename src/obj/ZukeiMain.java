package obj;

import java.util.ArrayList;
public class ZukeiMain{

	public static void main (String[]args) {
		En e1 = new En(10);
		En e2 = new En(10);
		if(e1.equals(e2)) {
			System.out.println("同じ");
		}else {
			System.out.println("違う");
		}

		ArrayList<Zukei> list = new ArrayList<>();
		list.add(new Shikaku(10,10));
		list.add(new En(10));
		list.add(new Sankaku(5,8));

		for(Zukei z :list) {
			//z.menseki();
			System.out.println(z);
			if(z instanceof En) {
				En en = (En)z;
				en.enshu();

			}
		}

	}

}
