package bg.softuni.simpleconditions;

import java.util.Scanner;

public class task12 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int hh = Integer.parseInt(scanner.nextLine());
		int mm = Integer.parseInt(scanner.nextLine());
		int nextTime = mm + 15;

		if (nextTime > 59) {
			hh = hh + 1;
			mm = nextTime - 60;
			if (hh > 23) {
				hh = 0;
			}

		} else {
			mm = nextTime;
		}
		System.out.format("%d:%02d", hh, mm);

	}
}
