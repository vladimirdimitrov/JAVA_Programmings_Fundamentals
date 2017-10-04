package bg.softuni.AdvancedLoops;

import java.util.Scanner;

public class task7 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int a = Integer.parseInt(scanner.nextLine());
		int b = Integer.parseInt(scanner.nextLine());

		while (b != 0) {
			int oldb = b;
			b = a % b;
			a = oldb;
		}
		System.out.println(a);

	}

}
