package bg.softuni.AdvancedLoops;

import java.util.Scanner;

public class task1 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = Integer.parseInt(scanner.nextLine());
		
		for (int i = 0; i < n; i+=3) {
			System.out.println(i);
		}
		
	}

}
