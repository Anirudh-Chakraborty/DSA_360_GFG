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
		} else if (decimal > 0) {
			while (decimal >= 1) {
				int a = decimal % 2;
				sb.append(a);
				decimal = decimal / 2;
			}
		} else if (decimal < 0) {
			decimal = decimal * -1;

			while (decimal >= 1) {
				int a = decimal % 2;
				sb.append(a);
				decimal = decimal / 2;
			}

			for (int i = 0; i < sb.length(); i++) {
				if (sb.charAt(i) == '1') {
					sb.setCharAt(i, '0');
				}
				if (sb.charAt(i) == '0') {
					sb.setCharAt(i, '1');
				}

			
			}
				int num = Integer.parseInt(sb.toString());
				
				int carry = 1;
				while (carry != 0) {
					int temp = num & carry;
					num = num ^ carry;
					carry = temp << 1;
				}

				sb.setLength(0);
				sb.append(carry);
		}

		return sb.reverse();
	}
}