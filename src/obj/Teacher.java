package obj;

public class Teacher {
		String name;
		int nen;
		int kumi;


		public Teacher(String n,int ne,int k){
			this.name = n;
			this.nen= ne;
			this.kumi = k;
		}
		public Teacher(String name) {
			this(name,0,0);

		}
		void show(){
			if(nen==0 && kumi==0) {
				System.out.println(this.name+" "+"担任なし");
			}else {
				System.out.println(this.name +" "+ this.nen + "年"+ this.kumi+"組担任");
			}
		}
}
