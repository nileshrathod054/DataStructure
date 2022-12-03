package conditionalStatements;

import java.util.Scanner;

/*Make a calculator take two numbers a & b from the user and an operator are as follows
 * 1.+ Addition a+b
 * 2.- Subtraction a-b
 * 3.* Multiplication a*b
 * 4./ Division a/b*/
public class Calculator {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int operator = sc.nextInt();
		switch (operator) {
		case 1:
			System.out.println(a + b);
			break;
		case 2:
			System.out.println(a - b);
			break;
		case 3:
			System.out.println(a * b);
			break;
		case 4:
			if (b == 0) {
				System.out.println("Invalid division");
			} else {
				System.out.println(a / b);

			}
			break;
		case 5:
			if (b == 0) {
				System.out.println("Invalid division");
			} else {
				System.out.println(a % b);

			}
			break;
		default:
			System.out.println("Invalid Operator");
		}
	}

}