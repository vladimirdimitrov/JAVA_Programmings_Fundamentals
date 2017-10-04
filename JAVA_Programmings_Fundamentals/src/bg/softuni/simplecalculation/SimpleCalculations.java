package bg.softuni.simplecalculation;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.Scanner;

public class SimpleCalculations {

	public static void main(String[] args) {

		Scanner scaner = new Scanner(System.in);

		String input = scaner.nextLine();
		try {

			DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
			LocalDate date = LocalDate.parse(input, formatter);

			System.out.printf("%s", date.plusDays(999).format(formatter));

		} catch (DateTimeParseException exc) {
			System.out.printf("%s is not parsable!%n", input);
			throw exc;
		}
	}
}
