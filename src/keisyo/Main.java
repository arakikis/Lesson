package keisyo;

public class Main {

	public static void main(String[] args) {

		Hero h1 = new Hero();
		h1.name = "ミナト";
		h1.hp=100;
		System.err.println(h1);

		Hero h2 = new Hero();
		h2.name = "ミナト";
		h2.hp=100;
		System.err.println(h2);

		if(h1.equals(h2)) {
			System.out.println("同じ");
		}else {
			System.err.println("違う");
		}

//		Matango m1 = new Matango();
//
//		ArrayList<Character>list = new ArrayList<Character>();
//
//		for(Character ch :list) {
//			ch.attack(m1);
//		}
//
//		Character c = new SuperHero();
//		if(c instanceof SuperHero) {
//		SuperHero sh = (SuperHero)c;
//		sh.fly();
//		}



		// Character c =new Character();
//		SuperHero sh = new SuperHero();
//		sh.fly();
//		sh.land();
//		sh.run();
//
//		Hero h = new Hero();
//		h.run();
//
//		Matango m1 = new Matango();
//		m1.hp =30;
//		m1.suffix = 'A';
//
//		sh.fly();
//		sh.attack(m1);


	}

}
