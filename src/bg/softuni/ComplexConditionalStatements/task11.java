package bg.softuni.ComplexConditionalStatements;

import java.util.Scanner;

public class task11 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		String typeCinema = scanner.nextLine();
		int r = Integer.parseInt(scanner.nextLine());
		int c = Integer.parseInt(scanner.nextLine());
		

		switch (typeCinema) {
		case "Premiere":
			System.out.printf("%.2f %s", r * c * 12.0, "leva");
			break;
		case "Normal":
			System.out.printf("%.2f %s", r * c * 7.5, "leva");
			break;
		case "Discount":
			System.out.printf("%.2f %s", r * c * 5.0, "leva");
			break;

		default:
			System.out.println("error");
			break;
		}

	}

}
