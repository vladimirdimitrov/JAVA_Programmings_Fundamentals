package bg.softuni.exam;

import java.util.Scanner;

public class task3 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int count = Integer.parseInt(scanner.nextLine());
		String typePic = scanner.nextLine();
		String order = scanner.nextLine();

		double price = 0.0;

		switch (typePic) {
		case "9X13":
			if (count >= 50) {
				price = (0.16 * count) * 0.95;
			} else {
				price = 0.16 * count;
			}
			break;

		case "10X15":
			if (count >= 80) {
				price = (0.16 * count) * 0.97;
			} else {
				price = 0.16 * count;
			}
			break;

		case "13X18":
			if (count >= 50 && count <= 100) {
				price = (0.38 * count) * 0.97;
			} else if (count > 100) {
				price = (0.38 * count) * 0.95;
			} else {
				price = 0.38 * count;
			}
			break;

		case "20X30":
			if (count >= 10 && count <= 50) {
				price = (2.90 * count) * 0.93;
			} else if (count > 50) {
				price = (2.90 * count) * 0.91;
			} else {
				price = 2.90 * count;
			}
			break;

		default:
			break;
		}

		if (order.equals("online")) {
			price = price * 0.98;
		}

		System.out.printf("%.2fBGN%n", price);

	}

}
