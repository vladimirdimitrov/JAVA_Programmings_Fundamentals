package bg.softuni.techmodule;

import java.util.Scanner;

public class lab3 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);

		String name = scanner.nextLine();
		int age = Integer.parseInt(scanner.nextLine());
		int employeeID = Integer.parseInt(scanner.nextLine());
		double montly = Double.parseDouble(scanner.nextLine());

		System.out.printf("Name: %s%n", name);
		System.out.printf("Age: %d%n", age);
		System.out.printf("Employee ID: %08d%n", employeeID);
		System.out.printf("Salary: %.2f%n", montly);

	}

}
