package bg.softuni.SimpleLoops;

import java.util.Scanner;

public class task7 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int num = Integer.parseInt(scanner.nextLine());

		int leftSum = 0;
		int rightSum = 0;

		for (int i = 1; i <= num; i++) {
			int currNum = Integer.parseInt(scanner.nextLine());
			leftSum += currNum;
		}

		for (int i = 1; i <= num; i++) {
			int currNum2 = Integer.parseInt(scanner.nextLine());
			rightSum += currNum2;
		}
		if (leftSum == rightSum) {
			System.out.printf("Yes, sum = %d", leftSum);
		} else {  
			System.out.printf("No, diff = %d", Math.abs(leftSum - rightSum));
		}
	}

}
