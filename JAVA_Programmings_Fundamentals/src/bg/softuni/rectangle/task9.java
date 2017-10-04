package bg.softuni.rectangle;

import java.util.Scanner;

public class task9 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = Integer.parseInt(scanner.nextLine());

		int stars = 1;
		if (n % 2 == 0) {
			stars = 2;
		}
		int dashes = (n - stars) / 2;

		for (int i = 0; i < (n + 1) / 2; i++) {
			System.out.print(repeatStr("-", dashes));
			System.out.print(repeatStr("*", stars));
			System.out.println(repeatStr("-", dashes));
			stars += 2;
			dashes--;
		}
		for (int i = 0; i < n / 2; i++) {
			System.out.print("|");
			System.out.print(repeatStr("*", n - 2));
			System.out.println("|");

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
