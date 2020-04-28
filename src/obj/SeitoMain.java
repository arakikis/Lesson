package obj;

import java.util.ArrayList;

public class SeitoMain {

	public static void main(String[] args) {
		ArrayList<Chugakusei> chu =
				new ArrayList<Chugakusei>();

		chu.add(new Chugakusei("荒木",80,70,90,80));
		chu.add(new Chugakusei("田尻",70,70,80,50));
		chu.add(new Chugakusei("安永",80,70,80,80));

		int gou =0;
		for(Chugakusei s : chu) {
			s.show();
			gou +=s.goukei();
		}
		System.out.println(gou);
	}

}
