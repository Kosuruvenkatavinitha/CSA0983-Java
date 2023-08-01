import java.util.Scanner;

public class bintooctandhex {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a binary number: ");
        String binaryNumber = scanner.nextLine();

        System.out.println("Octal: " + binaryToOctal(binaryNumber));
        System.out.println("Hexadecimal: " + binaryToHexadecimal(binaryNumber));
    }

    private static String binaryToOctal(String binaryNumber) {
        int length = binaryNumber.length();
        int groups = (int) Math.ceil((double) length / 3);
        StringBuilder octalNumber = new StringBuilder();

        for (int i = 0; i < groups; i++) {
            int startIndex = Math.max(length - (i + 1) * 3, 0);
            int endIndex = length - i * 3;
            String binaryGroup = binaryNumber.substring(startIndex, endIndex);
            octalNumber.insert(0, binaryGroupToOctal(binaryGroup));
        }

        return octalNumber.toString();
    }

    private static int binaryGroupToOctal(String binaryGroup) {
        int octalValue = 0;
        int length = binaryGroup.length();

        for (int i = 0; i < length; i++) {
            int digit = binaryGroup.charAt(i) - '0';
            octalValue += digit * Math.pow(2, length - i - 1);
        }

        return octalValue;
    }

    private static String binaryToHexadecimal(String binaryNumber) {
        int length = binaryNumber.length();
        int groups = (int) Math.ceil((double) length / 4);
        StringBuilder hexadecimalNumber = new StringBuilder();

        for (int i = 0; i < groups; i++) {
            int startIndex = Math.max(length - (i + 1) * 4, 0);
            int endIndex = length - i * 4;
            String binaryGroup = binaryNumber.substring(startIndex, endIndex);
            hexadecimalNumber.insert(0, binaryGroupToHexadecimal(binaryGroup));
        }

        return hexadecimalNumber.toString();
    }

    private static String binaryGroupToHexadecimal(String binaryGroup) {
        int hexadecimalValue = 0;
        int length = binaryGroup.length();

        for (int i = 0; i < length; i++) {
            int digit = binaryGroup.charAt(i) - '0';
            hexadecimalValue += digit * Math.pow(2, length - i - 1);
        }

        if (hexadecimalValue <= 9) {
            return String.valueOf(hexadecimalValue);
        } else {
            char hexChar = (char) ('A' + hexadecimalValue - 10);
            return String.valueOf(hexChar);
        }
    }
}
