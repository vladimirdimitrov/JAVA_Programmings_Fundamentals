package bg.softuni.SimpleLoops;

import java.util.Scanner;

public class task8 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int num = Integer.parseInt(scanner.nextLine());

		int oddSum = 0;
		int evenSum = 0;

		for (int i = 1; i <= num; i++) {
			int current = Integer.parseInt(scanner.nextLine());
			if (i % 2 == 0) {
				evenSum += current;
			} else {
				oddSum += current;
			}
		}

		if (oddSum == evenSum) {
			System.out.printf("Yes, sum = %d", oddSum);
		} else {
			System.out.printf("No, diff = %d", Math.abs(oddSum - evenSum));
		}

	}

}
