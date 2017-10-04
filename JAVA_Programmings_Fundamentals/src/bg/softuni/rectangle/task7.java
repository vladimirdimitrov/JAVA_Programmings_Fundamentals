package bg.softuni.rectangle;

import java.util.Scanner;

public class task7 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = Integer.parseInt(scanner.nextLine());

		for (int i = 0; i <= n; i++) {
			System.out.print(repeatStr(" ", n - i));
			System.out.print(repeatStr("*", i));
			System.out.print(" | ");			
			System.out.print(repeatStr("*", i));
			System.out.println();
		}

	}

	static String repeatStr(String strToRepeat, int count) {
		String text = "";
		for (int i = 0; i < count; i++) {
			text = text + strToRepeat;
		}
		return text;
	}

}
