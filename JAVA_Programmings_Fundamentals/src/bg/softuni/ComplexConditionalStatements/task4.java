package bg.softuni.ComplexConditionalStatements;

import java.util.Scanner;

public class task4 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int number = Integer.parseInt(scanner.nextLine());

		if (!(number >= 100 && number <= 200 || number == 0)) {
			System.out.println("invalid");

		}

	}

}
