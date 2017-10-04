package bg.softuni.rectangle;

import java.util.Scanner;

public class test6 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = Integer.parseInt(scanner.nextLine());
		int stars = 1;

		for (int i = 1; i < n; i++) {
			System.out.print(repeatStr(" ", n - i));
			System.out.print(repeatStr("* ", stars));
			stars++;
			System.out.println();
		}
		for (int i = 1; i <= n; i++) {
			System.out.print(repeatStr(" ", i - 1));
			System.out.print(repeatStr("* ", stars));
			stars--;
			System.out.println();
		}
	}

	public static String repeatStr(String strToRepeat, int count) {
		String text = "";
		for (int i = 0; i < count; i++) {
			text = text + strToRepeat;
		}
		return text;
	}

}
