package bg.softuni.AdvancedLoops;

import java.util.Scanner;

public class task11 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		while (true) {
			int n = 0;
			try {
				n = Integer.parseInt(scanner.nextLine());
			} catch (Exception e) {
				System.out.println("Invalid number!");
			}

			if (n % 2 == 0) {
				System.out.println(n);
				break;			
			}

		}

	}

}
