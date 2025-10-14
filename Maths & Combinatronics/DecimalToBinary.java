import java.util.Scanner;

/**
 * Simple utility to convert decimal integers to binary strings.
 *
 * Usage:
 *  - java DecimalToBinary           (prompts for input)
 *  - java DecimalToBinary 13        (uses command-line argument)
 *
 * Behavior:
 *  - For non-negative integers, prints the standard binary representation
 *    without leading zeros.
 *  - For negative integers, prints a signed description and the two's
 *    complement binary produced by Integer.toBinaryString(n).
 */
public class DecimalToBinary {

	/**
	 * Convert a decimal integer to its binary representation as a string.
	 * For negative inputs this returns the two's-complement form via
	 * Integer.toBinaryString(n).
	 *
	 * @param n integer to convert
	 * @return binary representation
	 */
	public static String toBinary(int n) {
		if (n == 0) return "0";
		if (n < 0) return Integer.toBinaryString(n); // two's complement

		StringBuilder sb = new StringBuilder();
		while (n > 0) {
			sb.append(n & 1);
			n >>>= 1;
		}
		return sb.reverse().toString();
	}

	/**
	 * Small helper to print conversion details.
	 */
	private static void printConversion(int n) {
		System.out.println("Decimal: " + n);
		if (n < 0) {
			System.out.println("(negative) Binary (two's complement): " + Integer.toBinaryString(n));
		} else {
			System.out.println("Binary: " + toBinary(n));
		}
	}

	public static void main(String[] args) {
		int n;
		if (args.length > 0) {
			try {
				n = Integer.parseInt(args[0]);
			} catch (NumberFormatException e) {
				System.err.println("Invalid integer argument: " + args[0]);
				System.exit(2);
				return;
			}
			printConversion(n);
			return;
		}

		// Interactive mode
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter an integer: ");
		try {
			n = sc.nextInt();
		} catch (Exception e) {
			System.err.println("Failed to read an integer.");
			sc.close();
			System.exit(2);
			return;
		}
		sc.close();
		printConversion(n);
	}

}
