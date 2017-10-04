package bg.softuni.simpleconditions;

import java.util.Scanner;

public class test5 {

	public static void main(String[] args) {
		Scanner scaner = new Scanner(System.in);

		int first = Integer.parseInt(scaner.nextLine());
		int second = Integer.parseInt(scaner.nextLine());
		int third = Integer.parseInt(scaner.nextLine());

		int totalsec = first + second + third;

		int minutes = totalsec / 60;
		int seconds = totalsec % 60;
		System.out.printf("%d:%02d", minutes, seconds);

	}

}
