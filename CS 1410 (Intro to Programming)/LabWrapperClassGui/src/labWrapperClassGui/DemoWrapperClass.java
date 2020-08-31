package labWrapperClassGui;

public class DemoWrapperClass {
	
	String minMax() {
		return "Byte: \n" + "Min: " + Byte.MIN_VALUE + "\n" + "Max: " + Byte.MAX_VALUE + "\n\n" + "Short: \n" + "Min: "
				+ Short.MIN_VALUE + "\n" + "Max: " + Short.MAX_VALUE + "\n\n" + "Integer: \n" + "Min: "
				+ Integer.MIN_VALUE + "\n" + "Max: " + Integer.MAX_VALUE + "\n\n" + "Long: \n" + "Min: "
				+ Long.MIN_VALUE + "\n" + "Max: " + Long.MAX_VALUE;
	}
	
	String toBinary(int number) {
		return "Binary: " + Integer.toBinaryString(number) + "\n" + "Octal: " + Integer.toOctalString(number) + "\n"
				+ "Hex: " + Integer.toHexString(number);
	}
	
	String charProperties (char c) {
		if (Character.isLetter(c) && Character.isUpperCase(c)) {
			StringBuilder sb = new StringBuilder(10);
			sb.append(c);
			sb.append("|");
			sb.append(Character.toLowerCase(c));
			return "Whitespace: " + Character.isWhitespace(c) + "\n" + "Digit: " + Character.isDigit(c) + "\n"
					+ "Letter: " + sb.toString() + "\n";
		}
		if (Character.isLetter(c) && Character.isLowerCase(c)) {
			StringBuilder sb2 = new StringBuilder(10);
			sb2.append(c);
			sb2.append("|");
			sb2.append(Character.toUpperCase(c));
			return "Whitespace: " + Character.isWhitespace(c) + "\n" + "Digit: " + Character.isDigit(c) + "\n"
					+ "Letter: " + sb2.toString() + "\n";
		} else
			return "Whitespace: " + Character.isWhitespace(c) + "\n" + "Digit: " + Character.isDigit(c) + "\n"
					+ "Letter: " + Character.isLetter(c) + "\n";

	}

}
