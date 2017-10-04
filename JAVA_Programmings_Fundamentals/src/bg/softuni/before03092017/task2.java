package bg.softuni.before03092017;

import java.util.Scanner;

public class task2 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int calculetedHourse = Integer.parseInt(scanner.nextLine());
		int emploeeys = Integer.parseInt(scanner.nextLine());
		int workDay = Integer.parseInt(scanner.nextLine());

		int workHourse = workDay * emploeeys * 8;
		int overTime = calculetedHourse - workHourse;

		if (overTime > 0) {
			System.out.printf("%d overtime%n", overTime);
			System.out.printf("Penalties: %d", overTime * workDay);
		} else {
			System.out.printf("%d hours left%n", Math.abs(overTime));

		}

	}

}
