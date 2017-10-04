package bg.softuni.techmodule;

import java.text.DecimalFormat;
import java.util.Scanner;

public class lab23 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String name = scanner.nextLine();
		double volume = Double.parseDouble(scanner.nextLine());
		double energy = Double.parseDouble(scanner.nextLine());
		double content = Double.parseDouble(scanner.nextLine());
		
		DecimalFormat df = new DecimalFormat("#.#");

		System.out.printf("%sml %s:" + System.lineSeparator(), df.format(volume), name);
		System.out.printf("%skcal, %sg sugars"+ System.lineSeparator(), df.format(volume / 100.0 * energy), df.format(volume / 100.0 * content));

	}

}
