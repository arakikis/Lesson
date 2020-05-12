
public class Fukusyu {

	public static void main(String[] args) {
		int[] tensus = {80,60,90,50,70};
		for (int t:tensus) {
			System.out.println(t);
		}
		int sum =0;
		for(int gou:tensus) {
			sum+= gou;

		}System.out.println(sum);

		int count = 0;
		for(int c:tensus) {
			if(c<=70) {
				count++;
			}
		}System.out.println(count);

	}

}
