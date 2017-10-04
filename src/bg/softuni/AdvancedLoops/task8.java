package bg.softuni.AdvancedLoops;

import java.util.Scanner;

public class task8 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = Integer.parseInt(scanner.nextLine());

		int factoriel = 1;
		do {
			factoriel=factoriel*n;
			n--;
		} while (n>0);
		System.out.println(factoriel);
		
	}

}
