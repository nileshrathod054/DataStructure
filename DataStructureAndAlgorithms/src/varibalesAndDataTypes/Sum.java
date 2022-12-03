package varibalesAndDataTypes;

import java.util.Scanner;

/*Q. Take 2 variables 'a' and 'b' and print their sum*/
public class Sum {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int sum = a + b;
		System.out.println("Sum of entered numbers is: " + sum);
	}
}
