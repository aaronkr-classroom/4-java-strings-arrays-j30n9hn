import java.util.Scanner;

public class Ex604 {
	public static void main(String[] args) {
		String s = new String("Java Programming");

		System.out.println("s.length() : " + s.length());
		System.out.println("s.cahrAt(5) : " + s.charAt(5));
		System.out.println("s.subString(6) : " + s.substring(6));
		System.out.println("s.subString(2,7) : " + s.substring(2,7));
		System.out.println("s.indexOf('P') : " + s.indexOf('P'));
		System.out.println("s.toLowerCase() : " + s.toLowerCase());
		System.out.println("s.toUpperCase() : " + s.toUpperCase());
	}
}