package bg.softuni.techmodule;

import java.util.Scanner;

public class lab21 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int num = 0;
		for (int i = 1; i <= 4; i++) {
			num = Integer.parseInt(scanner.nextLine());
			System.out.printf("%04d ", num);
			if (i == 4) {
				System.out.println("");
				break;
			}
		}

	}

}
