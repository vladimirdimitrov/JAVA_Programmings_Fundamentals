package bg.softuni;

import java.util.Scanner;

public class SquareOfStars {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner console = new Scanner(System.in);

		int n = Integer.parseInt(console.nextLine());

		char star = '*';
		String horizontal = new String(new char[n]).replace("\0", star + "");
		String vertical = star + new String(new char[n - 2]).replace("\0", " ") + star;
		vertical = new String(new char[n - 2]).replace("\0", vertical + "\n");

		System.out.println(horizontal);
		System.out.print(vertical);
		System.out.println(horizontal);

	}

}
