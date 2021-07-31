package converter.binaryint;

import java.util.regex.Pattern;

public class BinaryIntConverter {
    public static void main(String[] args) {
        var sc = new java.util.Scanner(System.in);

        while (true) {
            System.out.print("> ");
            String input = sc.nextLine().trim();
            if (input.equals("-1")) break;

            boolean validInput = true;
            String output = "";

            if (isValidBinary(input)) output = toInt(input) + checkToBinaryBoundaries(input);
            else if (isValidPositiveInt(input)) output = toBinary(Integer.parseInt(input));
            else validInput = false;

            if (output.equals("-1")) validInput = false;

            if (validInput) System.out.println(output);
            else System.out.println("Unexpected input");
        }
    }

    private static String checkToBinaryBoundaries(String input) {
        try {
            return "\n" + toBinary(Integer.parseInt(input));
        } catch (NumberFormatException nfe) {
            return "";
        }
    }

    private static String toInt(String s) {
        int increment = 1;
        int sum = 0;

        for (int i = s.length() - 1; i >= 0; i--) {
            if (s.charAt(i) == '1') sum += increment;
            increment *= 2;
        }
        return String.valueOf(sum);
    }

    private static String toBinary(int n) {
        if (n == 0) return "0";
        StringBuilder bin = new StringBuilder();

        while (n > 0) {
            if (n % 2 == 0) bin.append("0");
            else bin.append("1");
            n /= 2;
        }
        return String.valueOf(bin.reverse());
    }

    private static boolean isValidPositiveInt(String s) {
        try {
            return Integer.parseInt(s) >= 0;
        } catch (NumberFormatException nfe) {
            return false;
        }
    }

    private static boolean isValidBinary(String s) {
        return Pattern.compile("[0-1]+").matcher(s).matches();
    }
}
