package Sukkiri;

public class StrSample {

	public static void main(String[] args) {
		String s1 = "this is java";
		String s2 = "Java";

		if(s1.equalsIgnoreCase(s2)) {
			System.out.println("同じ");
		}else {
			System.out.println("違う");
		}
		if(s1.isEmpty()) {
			System.out.println("空文字です");
		}
		if(s1.contains("java")) {
			System.out.println("含まれている");
		}
		if(s1.startsWith("this")) {
			System.out.println("始まる");
		}
		System.out.println(s1.lastIndexOf("is"));
		System.out.println(s1.substring(4));
		System.out.println(s1.substring(5,8));
		System.out.println(s1.substring(0,4));


		System.out.println(s1.toLowerCase());
		System.out.println(s1.toUpperCase());
		System.out.println(s1.replace("java", "C++"));


		StringBuilder sb = new StringBuilder();
		sb.append("abc");
		sb.append("def");
		sb.append("ghi");

		String s = sb.toString();
		System.out.println(s);

	}

}
