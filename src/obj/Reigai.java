package obj;

import java.io.FileWriter;
import java.io.IOException;

public class Reigai {

	public static void main(String[] args) {
		//
		//		try (FileWriter fw = new FileWriter("date.txt");) {
		//
		//			fw.write("Hello");
		//
		//		} catch (IOException e) {
		//			System.out.println("エラー:" + e.getMessage());
		//
		//		}
		sub();
	}



	public static void sub() {
		try {
			subsub();
		}catch(Exception e) {
			System.out.println("エラー");
		}
	}

	public static void subsub()throws IOException {
		FileWriter fw = new FileWriter("date.txt");
	}
}
