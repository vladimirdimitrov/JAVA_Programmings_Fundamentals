package bg.softuni.SimpleLoops;

import java.util.Scanner;

public class task6 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int num = Integer.parseInt(scanner.nextLine());

		int min = Integer.MAX_VALUE;

		for (int i = 0; i < num; i++) {
			int currNum = Integer.parseInt(scanner.nextLine());
			if (min > currNum)
				min = currNum;
		}

		System.out.println(min);

	}

}
