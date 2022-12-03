package varibalesAndDataTypes;

import java.util.Scanner;

/*Q2. Make a program that takes the radius of a circle as input, 
 * calculates its radius and area and prints it as output to the user.
*/
public class CircleRadiusArea {
	public static void main(String[] args) {
		// double radius;
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter radius of circle.");

		double radius = sc.nextDouble();

		// Area of circle=PI*R*R

		double area = Math.PI * radius * radius;

		double circumference = 2 * Math.PI * radius;

		System.out.println("Radius of circle=" + radius);

		System.out.println("Area of circle= " + area);

		System.out.println("Circumference of circle=" + circumference);

	}
}
