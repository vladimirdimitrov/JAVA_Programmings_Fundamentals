package bg.softuni.simpleconditions;

import java.util.Scanner;

public class task7 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		String inputValue = scanner.nextLine();

		if (inputValue.equals("s3cr3t!P@ssw0rd")) {
			System.out.println("Welcome");
		} else {
			System.out.println("Wrong password!");
		}
	}
}
