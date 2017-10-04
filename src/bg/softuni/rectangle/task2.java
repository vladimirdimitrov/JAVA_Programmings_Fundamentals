package bg.softuni.rectangle;

import java.util.Scanner;

public class task2 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = Integer.parseInt(scanner.nextLine());
		for (int row = 1; row <= n; row++) {
			System.out.print("*");
			for (int col = 1; col < n; col++) {
				System.out.print("*");
			}
			System.out.println();
		}

	}

}
