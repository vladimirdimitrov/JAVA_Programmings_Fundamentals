package bg.softuni.techmodule;

import java.util.Scanner;

public class lab2 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int a = Integer.parseInt(scanner.nextLine());
		int b = Integer.parseInt(scanner.nextLine());
		System.out.printf("%d + %d = %d", a, b, a + b);
	}

}
