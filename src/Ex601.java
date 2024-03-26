import java.util.Scanner;

public class Ex601 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);

		String[] myArr = new String[3];

		System.out.println("Type 3 strings : ");
		
		//User Input
		for (int i = 0; i < 3; i++) {
			myArr[i] = s.nextLine();
		}

		for (int i = 0; i < 3; i++) {
			System.out.print(myArr[i] + " ");
		}


	}
}
