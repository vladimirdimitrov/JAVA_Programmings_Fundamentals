package bg.softuni.ComplexConditionalStatements;

import java.util.Scanner;

public class task12 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		String typeOfYear = scanner.nextLine().toLowerCase();
		int holidays = Integer.parseInt(scanner.nextLine());
		int weekendsAway = Integer.parseInt(scanner.nextLine());

		int weekendsInSofia = 48 - weekendsAway;

		double gamesInWeekends = weekendsInSofia * 3.0 / 4;
		double gamesInhollidays = holidays * 2.0 / 3;

		double games = gamesInWeekends + gamesInhollidays + weekendsAway;

		if (typeOfYear.equals("leap")) {
			games = games + 0.15 * games;

		}
		System.out.printf("%.0f", Math.floor(games));

	}

}
