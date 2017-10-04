package bg.softuni.SimpleLoops;

import java.util.Scanner;

public class task5 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int num = Integer.parseInt(scanner.nextLine());

		int max = Integer.MIN_VALUE;

		for (int i = 0; i < num; i++) {
			int currNum = Integer.parseInt(scanner.nextLine());
			if (max < currNum)
				max = currNum;
		}

		System.out.println(max);

	}

}
