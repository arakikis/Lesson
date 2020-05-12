package obj;

public class Main {

	public static void main(String[] args) {


		Sankaku s = new Sankaku(5,5);
		s.menseki();

		Shouhin shouhin = new Shouhin("りんご",100);
		shouhin.show();
		shouhin.showTax();

		Book b = new Book("それから",500,"夏目漱石");

		Uriage uri =new Uriage();
		uri.kosuu= 5;
		uri.shouhin = shouhin;
		uri.show();
		uri.showUriage();

		Shouhin shouhin2 = new Shouhin("みかん",150);

		Uriage uri2 =new Uriage();
		uri2.kosuu= 3;
		uri2.shouhin = shouhin2;
		uri2.show();
		uri2.showUriage();


		En e = new En(10);
		e.hankei = 10;
		e.menseki();
		e.enshu();

		DensiMoney dm= new DensiMoney();
		dm.charge(1000);
		dm.buy(500);
		dm.change();

		System.out.println(dm.getKingaku() + "円");
		System.out.println(dm.getPoint() + "ポイント");

		Hizuke hiz = new Hizuke(4,27);
		hiz.show();

		Hizuke hizu = new Hizuke(5,7);
		hizu.show();

		Nitiji n = new Nitiji(4,27,15,04);
		n.show();
		n.showJikan();




	}

}
