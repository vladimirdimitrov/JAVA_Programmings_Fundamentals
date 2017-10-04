package bg.softuni.SimpleLoops;

import java.util.Scanner;

public class task10 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int num = Integer.parseInt(scanner.nextLine());

		int biggesNum = -1;
		int sum = 0;
		for (int i = 1; i <= num; i++) {
			int current = Integer.parseInt(scanner.next());
			if (current > biggesNum) {
				biggesNum = current;
			}
			sum += current;
		}
		sum -= biggesNum;
		if (biggesNum == sum) {
			System.out.printf("Yes, sum = %d", biggesNum);
		} else {
			System.out.printf("No, diff = %d", Math.abs(biggesNum - sum));
		}
	
	}

}
