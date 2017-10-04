package bg.softuni.simpleconditions;

import java.util.Scanner;

public class task9 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		String world1 = scanner.nextLine();
		String world2 = scanner.nextLine();

		if (world1.toLowerCase().equals(world2.toLowerCase())) {
			System.out.println("yes");
		} else {
			System.out.println("no");
		}

	}

}
