package bg.softuni.ComplexConditionalStatements;

import java.util.Scanner;

public class task10 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		String animal = scanner.nextLine().toLowerCase();

		switch (animal) {
		case "dog":
			System.out.println("mammal");
			break;
		case "crocodile":
		case "tortoise":
		case "snake":
			System.out.println("reptile");
			break;

		default:
			System.out.println("unknown");
			break;
		}

	}

}
