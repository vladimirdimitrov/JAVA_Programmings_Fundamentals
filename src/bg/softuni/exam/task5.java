package bg.softuni.exam;

import java.util.Scanner;

public class task5 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int n = 0;
		while (n < 3 || n > 100) {
			n = Integer.parseInt(scanner.nextLine());
		}

		System.out.printf("*%s*%s*%n", strDrow(".", n), strDrow(".", n), strDrow(".", n));

		for (int i = 1; i <= n - 1; i++) {
			if (i == n - 1) {
				System.out.printf("%s*****%s%n", strDrow(".", i), strDrow(".", i));
			} else {
				System.out.printf("%s*%s*%s*%s%n", strDrow(".", i), strDrow(".", n - i), strDrow(".", n - i),
						strDrow(".", i));
			}
		}

		System.out.printf("%s%n", strDrow("*", 2 * n + 3));

		for (int i = n - 1; i >= 1; i--) {
			if (i == n - 1) {
				System.out.printf("%s*****%s%n", strDrow(".", i), strDrow(".", i));
			} else {
				System.out.printf("%s*%s*%s*%s%n", strDrow(".", i), strDrow(".", n - i), strDrow(".", n - i),
						strDrow(".", i));
			}
		}
		
		System.out.printf("*%s*%s*%n", strDrow(".", n), strDrow(".", n), strDrow(".", n));
	}

	static String strDrow(String input, int count) {
		String txt = "";

		for (int i = 0; i < count; i++) {
			txt += input;
		}
		return txt;
	}

}
