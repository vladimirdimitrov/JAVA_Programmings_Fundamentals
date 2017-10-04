package bg.softuni.simpleconditions;

import java.util.Scanner;

public class task11 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		double a = 0;
		double b = 0;
		double r = 0;
		double h = 0;
		String typeOfFigure = scanner.nextLine();
		typeOfFigure = typeOfFigure.toLowerCase();

		if (typeOfFigure.equals("square")) {
			a = Double.parseDouble(scanner.nextLine());
			System.out.format("%.3f%n", a * a);

		} else if (typeOfFigure.equals("rectangle")) {
			a = Double.parseDouble(scanner.nextLine());
			b = Double.parseDouble(scanner.nextLine());
			System.out.format("%.3f%n", a * b);

		} else if (typeOfFigure.equals("circle")) {
			r = Double.parseDouble(scanner.nextLine());
			System.out.format("%.3f%n", Math.PI * r * r);

		} else if (typeOfFigure.equals("triangle")) {
			a = Double.parseDouble(scanner.nextLine());
			h = Double.parseDouble(scanner.nextLine());
			System.out.format("%.3f%n", (a * h) / 2);
		}
	}
}
