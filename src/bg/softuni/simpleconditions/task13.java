package bg.softuni.simpleconditions;

import java.util.Scanner;

public class task13 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int a = Integer.parseInt(scanner.nextLine());
		int b = Integer.parseInt(scanner.nextLine());
		int c = Integer.parseInt(scanner.nextLine());

		if (a == b && b == c) {
			System.out.println("yes");
		} else {
			System.out.println("no");
		}
	}

}
