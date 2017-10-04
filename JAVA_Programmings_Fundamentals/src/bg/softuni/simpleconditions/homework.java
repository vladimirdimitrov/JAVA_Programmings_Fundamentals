package bg.softuni.simpleconditions;

import java.util.Scanner;

public class homework {

	public static void main(String[] args) {

		Scanner scaner = new Scanner(System.in);

		int number = Integer.parseInt(scaner.nextLine());

		double bounuspoint = -1;

		if (number <= 100) {
			bounuspoint = 5;
		} else if (number <= 1000) {
			bounuspoint = number * 0.2;
		} else {
			bounuspoint = number * 0.1;
		}

		if (number % 2 == 0) {
			bounuspoint += 1;
		}
		if (number % 10 == 5) {
			bounuspoint += 2;
		}

		System.out.println(bounuspoint);

		System.out.println(bounuspoint + number);

	}

}
