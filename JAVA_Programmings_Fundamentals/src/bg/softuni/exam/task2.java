package bg.softuni.exam;

import java.util.Scanner;

public class task2 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		double dohod = Double.parseDouble(scanner.nextLine());
		double sredenUspeh = Double.parseDouble(scanner.nextLine());
		double minZaplata = Double.parseDouble(scanner.nextLine());

		double socialna = 0.0;
		double uspeh = 0.;

		if (dohod < minZaplata && sredenUspeh >= 4.50) {
			socialna = minZaplata * 0.35;
		}

		if (sredenUspeh >= 5.50) {
			uspeh = sredenUspeh * 25;
		}
		if (socialna == 0.0 && uspeh == 0.0) {
			System.out.println("You cannot get a scholarship!");
		} else {
			if (socialna != 0 && socialna > uspeh) {
				System.out.printf("You get a Social scholarship %.0f BGN", socialna);
			} else if (uspeh != 0 && uspeh >= socialna) {
				System.out.printf("You get a scholarship for excellent results %.0f BGN", uspeh);
			}

		}

	}

}
