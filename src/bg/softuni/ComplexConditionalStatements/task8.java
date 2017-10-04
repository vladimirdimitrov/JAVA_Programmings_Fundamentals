package bg.softuni.ComplexConditionalStatements;

import java.util.Scanner;

public class task8 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String town = scanner.nextLine();
		double sales = Double.parseDouble(scanner.nextLine());
		double commission = 0.0;

		switch (town) {
		case "Sofia":
			if (sales >= 0 && sales <= 500) {
				commission = 0.05;
				System.out.printf("%.2f", sales * commission);
			} else if (sales > 500 && sales <= 1000) {
				commission = 0.07;
				System.out.printf("%.2f", sales * commission);
			} else if (sales > 1000 && sales <= 10000) {
				commission = 0.08;
				System.out.printf("%.2f", sales * commission);
			} else if (sales > 10000) {
				commission = 0.12;
				System.out.printf("%.2f", sales * commission);
			} else {
				System.out.println("error");
			}
			break;
		case "Varna":
			if (sales >= 0 && sales <= 500) {
				commission = 0.045;
				System.out.printf("%.2f", sales * commission);
			} else if (sales > 500 && sales <= 1000) {
				commission = 0.075;
				System.out.printf("%.2f", sales * commission);
			} else if (sales > 1000 && sales <= 10000) {
				commission = 0.10;
				System.out.printf("%.2f", sales * commission);
			} else if (sales > 10000) {
				commission = 0.13;
				System.out.printf("%.2f", sales * commission);
			} else {
				System.out.println("error");
			}
			break;		
		case "Plovdiv":
			if (sales >= 0 && sales <= 500) {
				commission = 0.055;
				System.out.printf("%.2f", sales * commission);
			} else if (sales > 500 && sales <= 1000) {
				commission = 0.08;
				System.out.printf("%.2f", sales * commission);
			} else if (sales > 1000 && sales <= 10000) {
				commission = 0.12;
				System.out.printf("%.2f", sales * commission);
			} else if (sales > 10000) {
				commission = 0.145;
				System.out.printf("%.2f", sales * commission);
			} else {
				System.out.println("error");
			}
			break;

		default:
			System.out.println("error");
			break;
		}

	}

}
