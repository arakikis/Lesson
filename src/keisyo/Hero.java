package keisyo;

public class Hero extends Character {

	public Hero() {

	}

	public Hero(String name){
		this.name = name;
		System.out.println("Heroのコンストラクタ");
	}

	public void attack(Matango m) {
		m.hp-= 5;
		System.out.println(this.name+ "の攻撃！");
		System.out.println("5ダメージ");
		System.out.println("残りHPは"+ m.hp);
	}
	public String toString() {
		return "名前:" + this.name;
	}
	public boolean equals(Object o) {
		if(this == o) {
			return true;
		}if(o instanceof Hero) {
			Hero h =(Hero)o;
			if(this.name.equals(h.name)) {
				return true;
			}
		}
		return false;
	}
}
