package bg.softuni.SimpleLoops;

import java.util.Scanner;

public class task4 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int num = Integer.parseInt(scanner.nextLine());
		int sum = 0;

		for (int i = 0; i < num; i++) {
			int currSum = Integer.parseInt(scanner.nextLine());
			sum += currSum;
		}

		System.out.println(sum);

	}

}
