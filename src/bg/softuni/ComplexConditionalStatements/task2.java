package bg.softuni.ComplexConditionalStatements;

import java.util.Scanner;

public class task2 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		String product = scanner.nextLine().toLowerCase();
		String town = scanner.nextLine().toLowerCase();
		double quantity = Double.parseDouble(scanner.nextLine());

		if (town.equals("sofia")) {
			if (product.equals("coffee")) {
				System.out.println(0.50 * quantity);
			} else if (product.equals("water")) {
				System.out.println(0.80 * quantity);
			} else if (product.equals("beer")) {
				System.out.println(1.2 * quantity);
			} else if (product.equals("sweets")) {
				System.out.println(1.45 * quantity);
			} else if (product.equals("peanuts")) {
				System.out.println(1.6 * quantity);
			}
		}

		if (town.equals("plovdiv")) {
			if (product.equals("coffee")) {
				System.out.println(0.40 * quantity);
			} else if (product.equals("water")) {
				System.out.println(0.70 * quantity);
			} else if (product.equals("beer")) {
				System.out.println(1.15 * quantity);
			} else if (product.equals("sweets")) {
				System.out.println(1.30 * quantity);
			} else if (product.equals("peanuts")) {
				System.out.println(1.5 * quantity);
			}
		}

		if (town.equals("varna")) {
			if (product.equals("coffee")) {
				System.out.println(0.45 * quantity);
			} else if (product.equals("water")) {
				System.out.println(0.70 * quantity);
			} else if (product.equals("beer")) {
				System.out.println(1.10 * quantity);
			} else if (product.equals("sweets")) {
				System.out.println(1.35 * quantity);
			} else if (product.equals("peanuts")) {
				System.out.println(1.55 * quantity);
			}
		}

	}
}
