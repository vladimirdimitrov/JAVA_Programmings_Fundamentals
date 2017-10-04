package bg.softuni.AdvancedLoops;

import java.util.Scanner;

public class task10 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = Integer.parseInt(scanner.nextLine());

		if (n == 1 || n < 0) {
			System.out.println("not prime");
			return;
		}

		if (isPrime(n)) {
			System.out.println("prime");
		} else {
			System.out.println("not prime");
		}

	}

	static boolean isPrime(int n) {

		if (n % 2 == 0)
			return false;

		for (int i = 3; i * i <= n; i += 2) {
			if (n % i == 0)
				return false;
		}
		return true;
	}

}
