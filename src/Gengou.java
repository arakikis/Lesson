
public class Gengou {

	public static void main(String[] args) {
		System.out.println("元号西暦変換");
		System.out.println("1:昭和,2:平成,3:令和");
		int gengou =new java.util.Scanner(System.in).nextInt();
		System.out.println("年を入力");
		int nen =new java.util.Scanner(System.in).nextInt();
		System.out.println(getGengouName(gengou)+nen+"年は西暦"+getSeireki(gengou,nen)+ "年");
	}
	public static String getGengouName(int gengou ) {
		if(gengou ==1) {
			return("昭和");
		}else if(gengou==2) {
			return("平成");
		}else{
			return("令和");
		}
	}public static int getSeireki(int gengou, int nen ) {
		if(gengou==3) {
			return 2018+ nen ;
		}if(gengou ==1) {
			return 1925+ nen ;
		}if(gengou ==2) {
			return 1988+ nen ;
		}
		return 0;
	}

	}


