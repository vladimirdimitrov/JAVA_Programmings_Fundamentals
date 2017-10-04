package bg.softuni.exam;

import java.util.Scanner;

public class task4 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int a = Integer.parseInt(scanner.nextLine());
		int b = Integer.parseInt(scanner.nextLine());

		int sizeIs = a * b;

		String stop = "";

		while (sizeIs > 0) {
			int count = 0;

			stop = scanner.nextLine();
			if (stop.equals("STOP")) {
				System.out.print(sizeIs);
				System.out.println(" pieces are left.");
				break;
			}
			count = Integer.parseInt(stop);

			if (sizeIs - count >= 0) {
				sizeIs -= count;
			} else {
				System.out.print("No more cake left! You need ");
				System.out.print(count - (sizeIs % count));
				System.out.println(" pieces more.");
				sizeIs = 0;
			}

		}

	}

}
