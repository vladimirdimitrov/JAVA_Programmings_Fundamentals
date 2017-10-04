package bg.softuni.before03092017;

import java.util.Scanner;

public class task4 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int lectures = Integer.parseInt(scanner.nextLine());
		double budget = Double.parseDouble(scanner.nextLine());

		int jelev = 0;
		int royal = 0;
		int roli = 0;
		int trofon = 0;
		int sino = 0;
		int other = 0;

		for (int i = 0; i < lectures; i++) {
			String name = scanner.nextLine();
			if (name.equals("Jelev")) {
				jelev++;
			} else if (name.equals("RoYaL")) {
				royal++;
			} else if (name.equals("Roli")) {
				roli++;
			} else if (name.equals("Trofon")) {
				trofon++;
			} else if (name.equals("Sino")) {
				sino++;
			} else {
				other++;
			}

		}

		double moneyLecture = budget / lectures;

		System.out.printf("Jelev salary: %.2f lv%n", jelev * moneyLecture);
		System.out.printf("RoYaL salary: %.2f lv%n", royal * moneyLecture);
		System.out.printf("Roli salary: %.2f lv%n", roli * moneyLecture);
		System.out.printf("Trofon salary: %.2f lv%n", trofon * moneyLecture);
		System.out.printf("Sino salary: %.2f lv%n", sino * moneyLecture);
		System.out.printf("Others salary: %.2f lv%n", other * moneyLecture);

	}

}
