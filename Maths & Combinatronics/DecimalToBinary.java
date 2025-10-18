import java.util.*;

public class DecimalToBinary {

	static Scanner sc = new Scanner(System.in);
	static DecimalToBinary caller = new DecimalToBinary();

	public static void main(String[] args) {
		int decimal = sc.nextInt();
		StringBuilder result = caller.DecimalBinary(decimal);
		System.out.println(result);
	}

	StringBuilder DecimalBinary(int decimal) {
		StringBuilder sb = new StringBuilder();

		if (decimal == 0) {
			sb.append(0);
		} else {
			while (decimal >= 1) {
				int a = decimal % 2;
				sb.append(a);
				decimal = decimal / 2;
			}
		} 
		return sb.reverse();
	}
}