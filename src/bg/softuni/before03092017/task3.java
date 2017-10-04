package bg.softuni.before03092017;

import java.util.Scanner;

public class task3 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String month = scanner.nextLine();
		int nights = Integer.parseInt(scanner.nextLine());

		double studioPrice = 0.0;
		double apartmentPrice = 0.0;

		switch (month) {

		case "May":
		case "October":
			studioPrice = 50;
			apartmentPrice = 65;
			if (nights > 7 && nights <= 14) {
				studioPrice = studioPrice - studioPrice * 0.05;
			} else if (nights > 14) {
				studioPrice = studioPrice - studioPrice * 0.3;
				apartmentPrice = apartmentPrice - apartmentPrice * 0.1;
			}
			break;

		case "June":
		case "September":
			studioPrice = 75.20;
			apartmentPrice = 68.70;

			if (nights > 14) {
				studioPrice = studioPrice - studioPrice * 0.2;
				apartmentPrice = apartmentPrice - apartmentPrice * 0.1;
			}
			break;

		case "July":
		case "August":
			studioPrice = 76;
			apartmentPrice = 77;
			if (nights > 14) {

				apartmentPrice = apartmentPrice - apartmentPrice * 0.1;
			}
			break;

		}
		System.out.printf("Apartment: %.2f lv.%n", apartmentPrice * nights);
		System.out.printf("Studio: %.2f lv.", studioPrice * nights);
	}

}
