package varibalesAndDataTypes;

import java.util.Scanner;

/*Q3. Make a program that prints the table of a number that is input by the user.*/

public class Table {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter a number.");

		int num = sc.nextInt();

		System.out.println("Table of number: " + num);

		for (int i = 1; i <= 10; i++) {

			System.out.println(num + "x" + i + "=" + (num * i));
		}
	}
}
