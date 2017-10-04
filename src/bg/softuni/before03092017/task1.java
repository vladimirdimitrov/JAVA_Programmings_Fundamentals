package bg.softuni.before03092017;

import java.util.Scanner;

public class task1 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		double a = Double.parseDouble(scanner.nextLine());
		double b = Double.parseDouble(scanner.nextLine());

		double side = a * (a / 2);
		double back = ((a / 2) * (a / 2)) + (a / 2 * (b - a / 2)) / 2;
		double front = back - (a / 5 * a / 5);
		double roof = 2 * (a * (a / 2));

		double greenPaint = (2 * side + back + front) / 3;
		double redPaint = (roof) / 5;
		
		System.out.printf("%.2f%n", greenPaint);
		System.out.printf("%.2f%n", redPaint);
	}

}
