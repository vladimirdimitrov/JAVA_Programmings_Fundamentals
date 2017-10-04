package bg.softuni.rectangle;

import java.util.Scanner;

public class task1 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		for (int row = 1; row <= 10; row++) {
			System.out.print("*");
			for (int col = 1; col < 10; col++) {
				System.out.print("*");
			}
			System.out.println();
		}

	}

}
