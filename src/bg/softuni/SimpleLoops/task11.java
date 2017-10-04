package bg.softuni.SimpleLoops;

import java.util.Scanner;

public class task11 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int num = Integer.parseInt(scanner.nextLine());
		double oddSum = 0.0;
		double oddMin = 1000000000.0;
		double oddMax = -1000000000.0;

		double evenSum = 0.0;
		double evenMin = 1000000000.0;
		double evenMax = -1000000000.0;

		for (int i = 1; i <= num; i++) {
			double current = Double.parseDouble(scanner.nextLine());
			if (i % 2 == 0) {
				evenSum += current;
				if (current < evenMin) {
					evenMin = current;
				}
				if (current > evenMax) {
					evenMax = current;
				}
			} else {
				oddSum += current;
				if (current < oddMin) {
					oddMin = current;
				}
				if (current > oddMax) {
					oddMax = current;
				}

			}
		}
		System.out.printf("OddSum=%s,%n", fmt(oddSum));

		if (oddMin == 1000000000.0) {
			System.out.printf("OddMin=No,%n");
		} else {
			System.out.printf("OddMin=%s,%n", fmt(oddMin));
		}
		if (oddMax == -1000000000.0) {
			System.out.printf("OddMax=No,%n");
		} else {
			System.out.printf("OddMax=%s,%n", fmt(oddMax));
		}

		System.out.printf("EvenSum=%s,%n", fmt(evenSum));

		if (evenMin == 1000000000.0) {
			System.out.printf("EvenMin=No,%n");
		} else {
			System.out.printf("EvenMin=%s,%n", fmt(evenMin));
		}
		if (evenMax == -1000000000.0) {
			System.out.printf("EvenMax=No%n");
		} else {
			System.out.printf("EvenMax=%s%n", fmt(evenMax));
		}

	}

	public static String fmt(double d) {
		if (d == (long) d)
			return String.format("%d", (long) d);
		else
			return String.format("%s", d);
	}
}
