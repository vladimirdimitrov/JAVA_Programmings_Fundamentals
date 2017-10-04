package bg.softuni.simpleconditions;

import java.util.Scanner;

public class Price {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int km = Integer.parseInt(scanner.nextLine());
		String tariff = scanner.nextLine();

		if (km < 20) {
			// taxi
			if (tariff.equals("day")) {
				System.out.format("%.2f%n", 0.7 + km * 0.79);
			} else {
				System.out.format("%.2f%n", 0.7 + km * 0.9);

			}
		} else if (km < 100 && km > 20) {
			System.out.format("%.2f%n", 0.09 * km);
		} else {
			System.out.format("%.2f%n", 0.06 * km);
		}
	}
}
