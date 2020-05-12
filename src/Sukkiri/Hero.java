package Sukkiri;

public class Hero {
	private String name;
	private int hp;
	private Sword sword;
	public static  int money=100;

	public Hero(String n) {
		this.hp=100;
		this.name =n;

	}
	public Hero() {
		this("ダミー");
	}
	public static void setRandomMoney() {
		Hero.money=(int)(Math.random()*1000);
		//System.out.println(this.name+"のお金は");
	}
	public String getName() {
		return this.name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getHp() {
		return this.hp;
	}
	public void setHp(int hp) {
		if(hp<0) {
			System.out.println("hpはマイナスにできません");
			return;
		}
		this.hp = hp;
	}
	public Sword getSword() {
		return this.sword;
	}
	public void setSword(Sword sword) {
		this.sword= sword;
	}

	public void attack(Matango m) {
		m.hp-= this.sword.getDamage();
		System.out.println(this.name+ "の攻撃！");
		System.out.println("ダメージ"+ this.sword.getDamage()+ "!");
		System.out.println("残りHPは"+ m.hp);

		System.out.println("反撃を受けた");
		this.hp -= 2;
		if(this.hp<=0) {
			this.die();
		}
	}
	private void die() {
		System.out.println(this.name+"は死んでしまった");
	}

	public void sleep() {
		this.hp = 100;
		System.out.println(this.name + "は、眠って回復した！");
	}
	public void sit(int sec) {
		this.hp += sec;
		System.out.println( this.name + "は"+ sec + "秒座った");
		System.out.println("HPが" + sec + "ポイント回復した");

	}
	public void run() {
		System.out.println(this.name + "逃げ出した！");
		System.out.println("GAME OVER");
		System.out.println("最終HPは"+ this.hp + "でした");
	}
		public void slip() {
			System.out.println(this.name + "逃げ出した！");
			System.out.println("GAME OVER");
			System.out.println("最終HPは"+ this.hp + "でした");
		}


	}

