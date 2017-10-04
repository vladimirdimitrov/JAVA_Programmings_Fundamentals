package bg.softuni.AdvancedLoops;

import java.util.Scanner;

public class task12 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int n = Integer.parseInt(scanner.nextLine());

		System.out.println(fibbonaci(n));
	}

	public static int fibbonaci(int n) {
		if (n <= 1)
			return 1;

		int prev = 0, next = 1, result = 0;
		for (int i = 0; i < n; i++) {
			result = prev + next;
			prev = next;
			next = result;
		}
		return result;
	}

}
