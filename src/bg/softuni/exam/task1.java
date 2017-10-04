package bg.softuni.exam;

import java.util.Scanner;

public class task1 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		short countTable = Short.parseShort(scanner.nextLine());
		float lenght = Float.parseFloat(scanner.nextLine());
		float wight = Float.parseFloat(scanner.nextLine());

		System.out.printf("%.2f USD%n", (countTable * (lenght + 2 * 0.3) * (wight + 2 * 0.3))*7+(countTable * (lenght / 2) * (lenght / 2))*9);
		System.out.printf("%.2f BGN", ((countTable * (lenght + 2 * 0.3) * (wight + 2 * 0.3))*7+(countTable * (lenght / 2) * (lenght / 2))*9)*1.85);

	}

}
