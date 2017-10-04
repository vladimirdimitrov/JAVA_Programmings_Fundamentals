package bg.softuni.simpleconditions;

import java.util.Scanner;

public class test6 {

	public static void main(String[] args) {
		Scanner scaner = new Scanner(System.in);

		double distance = Double.parseDouble(scaner.nextLine());
		String inputValue = scaner.nextLine();
		String outValue = scaner.nextLine();

		if (inputValue.equals("mm")) {
			distance = distance / 1000;
		} else if (inputValue.equals("cm")) {
			distance = distance / 100;
		} else if (inputValue.equals("mi")) {
			distance = distance / 0.000621371192;
		} else if (inputValue.equals("in")) {
			distance = distance / 39.3700787;
		} else if (inputValue.equals("km")) {
			distance = distance / 0.001;
		} else if (inputValue.equals("ft")) {
			distance = distance / 3.2808399;
		} else if (inputValue.equals("yd")) {
			distance = distance / 1.0936133;
		}

		if (outValue.equals("mm")) {
			distance = distance * 1000;
		} else if (outValue.equals("cm")) {
			distance = distance * 100;
		} else if (outValue.equals("mi")) {
			distance = distance * 0.000621371192;
		} else if (outValue.equals("in")) {
			distance = distance * 39.3700787;
		} else if (outValue.equals("km")) {
			distance = distance * 0.001;
		} else if (outValue.equals("ft")) {
			distance = distance * 3.2808399;
		} else if (outValue.equals("yd")) {
			distance = distance * 1.0936133;
		}

		System.out.printf("%f %s", distance, outValue);

	}

}
