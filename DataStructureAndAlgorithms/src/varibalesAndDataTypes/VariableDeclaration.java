package varibalesAndDataTypes;

public class VariableDeclaration {
	public static void main(String[] args) {
		// Primitive Data Types
		byte age = 25; // Size=1byte, Range= -128 to 128

		short roomNo = 3; // Size=2byte, Range= -32K to 32k

		int houseNo = 131; // Size=4byte, Range= -2B to 2B

		long mobileNo = 918605709787L; // Size=8byte, Range= upto 19 decimal digits

		float height = 5.5F;// Size= 4byte, Range= upto 7decimal digits

		double salary = 3000000d; // Size=8byte, Range= upto 16decimal digits

		char gender = 'M';// Size=2byte, Range= single character

		boolean info = false; // Size=1byte, value=true or false

		// Non-Primitive Data Types

		String name = "Nilesh Rathod";
		// Array
		int[] percentage = new int[3];
		percentage[0] = 85;
		percentage[1] = 55;
		percentage[2] = 81;
	}
}
